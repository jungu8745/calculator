public class DivideOperator {
    public double operate(double num1, double num2) {
        if(num2 == 0) {
            throw new ArithmeticException("나눗셈에서 분모가 0이 될 수 없습니다.");
        }
        return num1 / num2;
    }
}