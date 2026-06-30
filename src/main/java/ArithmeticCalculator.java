import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator {

    private Map<Character, Operator> operators;

    public ArithmeticCalculator() {

        operators = new HashMap<>();

        operators.put('+', new AddOperator());
        operators.put('-', new SubtractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }

    public double calculate(double num1, double num2, char operator) {
        Operator selectedOperator = operators.get(operator);

        if (selectedOperator == null) {
            throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        double result =
                selectedOperator.operate(num1, num2);

        results.add(result);

        return result;

    }

}