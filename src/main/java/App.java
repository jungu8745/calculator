import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> results = new ArrayList<>();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

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
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        return;
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("잘못된 연산자입니다.");
                    return;
            }

            results.add(result);

            System.out.println("결과 : " + result);
            System.out.println("저장된 결과 : " + results)System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = sc.next();

            if (answer.equals("exit")) {
                break;
            }

        }

        sc.close();

    }
}