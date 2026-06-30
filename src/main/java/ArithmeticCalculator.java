public class ArithmeticCalculator extends Calculator {

    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;

    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    public double calculate(double num1, double num2, char operator) {
        double result;

        switch(operator) {

            case '+':
                result = addOperator.operate(num1, num2);
                break;

            case '-':
                result = subtractOperator.operate(num1, num2);
                break;

            case '*':
                result = multiplyOperator.operate(num1, num2);
                break;

            case '/':
                result = divideOperator.operate(num1, num2);
                break;

            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        results.add(result);

        return result;

    }

}