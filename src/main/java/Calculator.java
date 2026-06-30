import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> results = new ArrayList<>();

    public void addResult(int result) {
        results.add(result);
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 오래된 계산 결과가 삭제되었습니다.");
            System.out.println("저장된 결과 : " + results);
        }
        else {
            System.out.println("삭제할 결과가 없습니다.");
            System.out.println("저장된 결과 : " + results);
        }
    }

    public void inquiryResults() {
        System.out.println("저장된 결과 : " + results);
    }

    public int calculate(int num1, int num2, char operator) {

        int result = 0;

        switch (operator) {
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
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;

            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        addResult(result);

        return result;
    }




}