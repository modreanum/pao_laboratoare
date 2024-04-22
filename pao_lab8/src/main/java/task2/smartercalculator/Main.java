package task2.smartercalculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import task2.smartercalculator.calculatorResult.*;
import task2.smartercalculator.exceptions.InvalidArgumentsLengthException;

public class Main {
    public static void main(String[] args) {
        args =
                new String[] {
                    "1", "+", "2", "2", "*", "5", "1", "+", "5.0", "1.0", "-", "2", "10.0", "/",
                    "1", "abc", "+", "9", "1.0", "/", "0", "1", "/", "0", "true", "+", "true",
                    "2.54", "+", "abcd"
                    // , "1"
                };

        runSmarterCalculator(args);
        selectRequest();
    }

    private static void runSmarterCalculator(String[] args) {
        try {
            SmarterCalculator.calculate(args).stream()
                    .map(PrintingCalculationResultWrapper::new)
                    .forEach(PrintingCalculationResult::computeResult);
        } catch (InvalidArgumentsLengthException e) {
            System.err.println("unknown operand type " + e.getMessage());
        }
    }

    private static void selectRequest() {
        try (Connection connection =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/laborator", "student", "student")) {
            String selectSql =
                    "SELECT\n"
                            + "  operation_type,\n"
                            + "  left_operand,\n"
                            + "  right_operand,\n"
                            + "  operation,\n"
                            + "  result\n"
                            + "FROM smarterCalculatorResults;";
            try (ResultSet resultSet = connection.createStatement().executeQuery(selectSql)) {

                while (resultSet.next()) {
                    String leftOp = resultSet.getNString("left_operand");
                    String rightOp = resultSet.getNString("right_operand");
                    String opType = resultSet.getNString("operation_type");
                    String op = resultSet.getNString("operation");
                    String res = resultSet.getNString("result");
                    CalculationRequest request;
                    CalculationResult result1;
                    if (opType.equals("Boolean")) {
                        request =
                                new CalculationRequest(
                                        Boolean.parseBoolean(leftOp),
                                        Boolean.parseBoolean(rightOp),
                                        op);
                        result1 = new BooleanCalculationResult(request);
                    } else {
                        if (opType.equals("Integer")) {
                            request =
                                    new CalculationRequest(
                                            Integer.parseInt(leftOp),
                                            Integer.parseInt(rightOp),
                                            op);
                            result1 = new IntegerCalculationResult(request);
                        } else {
                            request =
                                    new CalculationRequest(
                                            Double.parseDouble(leftOp),
                                            Double.parseDouble(rightOp),
                                            op);
                            result1 = new DoubleCalculationResult(request);
                        }
                    }
                    PrintingCalculationResult result = new PrintingCalculationResult(result1);
                    result.computeResult();
                }

            } catch (SQLException exception) {

                System.err.println(exception.getMessage());
            }
        } catch (SQLException exception) {

            System.err.println(exception.getMessage());
        }
    }
}
