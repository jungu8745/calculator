public class CircleCalculator extends Calculator {

    // static: 객체마다 만들지 않고 하나의 값을 공유하기 위해 사용
    // final: 원주율은 변경되지 않는 값이므로 변경 방지를 위해 사용
    public static final double PI = 3.14;

    public double calculateCircleArea(double radius) {

        double area = PI * radius * radius;
        results.add(area);

        return area;

    }


}