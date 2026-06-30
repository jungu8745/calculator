public class ArithmeticCalculator extends Calculator {

    public double calculate(double num1, double num2, char operator) {

        double result = 0;

        switch(operator) {

            case '+':
                result = num1 + num2;

                break;

            case '-':
                result = num1 - num2;

                break;

            case '*':
                result = num1 * num2;

                break;


            case '/':

                if(num2 == 0) {
                    throw new ArithmeticException(
                            "나눗셈에서 분모가 0이 될 수 없습니다.");
                }
                result = num1 / num2;

                break;


            default:
                throw new IllegalArgumentException(
                        "잘못된 연산자입니다.");

        }


        results.add(result);


        return result;

    }

}