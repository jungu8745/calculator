import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> results;

    private List<Double> circleResults;


    // static: 모든 객체가 공유하는 값으로 사용하기 위해 사용
    // final: 원주율 값은 변경되지 않는 상수 값이므로 수정할 수 없도록 사용
    public static final double PI = 3.14;


    public Calculator() {
        results = new ArrayList<>();

        circleResults = new ArrayList<>();
    }



    public void addResult(int result) {
        results.add(result);
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
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
                    throw new ArithmeticException("나눗셈에서 분모가 0이 될 수 없습니다.");
                }
                result = num1 / num2;
                break;

            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        addResult(result);

        return result;
    }


    public double calculateCircleArea(double radius) {

        double area = PI * radius * radius;


        circleResults.add(area);


        return area;

    }



    public List<Double> getCircleResults() {

        return circleResults;

    }



    public void setCircleResults(List<Double> circleResults) {

        this.circleResults = circleResults;

    }



    public void inquiryCircleResults() {

        System.out.println("저장된 원 넓이 : " + circleResults);

    }







}