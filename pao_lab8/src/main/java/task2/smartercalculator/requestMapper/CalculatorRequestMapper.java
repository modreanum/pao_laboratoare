package task2.smartercalculator.requestMapper;

import java.util.Optional;
import task2.smartercalculator.CalculationRequest;
import task2.smartercalculator.exceptions.InvalidOperationException;
import task2.smartercalculator.exceptions.UnknownOperandTypeException;

public interface CalculatorRequestMapper {
    Optional<CalculationRequest> tryMapRequest(
            String leftOperandString, String operatorString, String rightOperandString)
            throws InvalidOperationException, UnknownOperandTypeException;
}
