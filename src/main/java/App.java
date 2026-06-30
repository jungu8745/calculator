import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");

            char operator = sc.next().charAt(0);


            try {
                int result = calculator.calculate(num1, num2, operator);
                System.out.println("결과 : " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }


            System.out.print("가장 오래된 계산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String removeCommand = sc.next();

            if (removeCommand.equals("remove")) {
                calculator.removeResult();
            }

            System.out.print("저장된 계산 결과를 조회하시겠습니까? (inquiry 입력 시 조회): ");
            String inquiryCommand = sc.next();

            if (inquiryCommand.equals("inquiry")) {
                calculator.inquiryResults();
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = sc.next();

            if (answer.equals("exit")) {
                break;
            }

        }

        sc.close();

    }
}



