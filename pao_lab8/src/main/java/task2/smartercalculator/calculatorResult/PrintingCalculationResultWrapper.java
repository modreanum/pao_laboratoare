package task2.smartercalculator.calculatorResult;

import java.sql.*;
import task2.smartercalculator.CalculationRequest;

public class PrintingCalculationResultWrapper extends PrintingCalculationResult {

    public PrintingCalculationResultWrapper(CalculationResult calculationResult) {
        super(calculationResult);
    }

    @Override
    public Object computeResult() {
        Object result = super.computeResult();
        if (result != null) {
            try (Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/laborator", "student", "student")) {
                try (Statement statement = connection.createStatement()) {
                    String createStudentTable =
                            """
                              CREATE TABLE IF NOT EXISTS smarterCalculatorResults (
                                  id INT PRIMARY KEY auto_increment,
                                  operation_type VARCHAR(20) NOT NULL,
                                  left_operand VARCHAR(254) NOT NULL,
                                  right_operand VARCHAR(254) NOT NULL,
                                  operation VARCHAR(2) NOT NULL,
                                  result VARCHAR(255) NOT NULL
                              );
                            """;
                    statement.execute(createStudentTable);
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
                try (PreparedStatement insertStatement =
                        connection.prepareStatement(
                                "INSERT INTO smarterCalculatorResults(operation_type, left_operand,"
                                        + " right_operand, operation, result)\n"
                                        + "  VALUES (?, ?, ?, ?, ?);")) {
                    CalculationRequest request = calculationResult.getRequest();
                    insertStatement.setString(1, request.getRequestType().toString());
                    insertStatement.setString(2, request.getLeftOperand().toString());
                    insertStatement.setString(3, request.getRightOperand().toString());
                    insertStatement.setString(4, request.getOperation());
                    insertStatement.setString(5, result.toString());
                    insertStatement.execute();
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }

            } catch (SQLException exception) {

                System.err.println(exception.getMessage());
            }
        }
        return result;
    }
}
