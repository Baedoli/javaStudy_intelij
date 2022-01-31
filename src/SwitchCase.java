import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 1 ~ 4까지 입력 하세요.");

        String input_ = scanner.nextLine();

        try {
            int num_ = Integer.parseInt(input_);

            if (num_ >= 1 && num_ < 5) {

                switch (num_) {
                    case 1:
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    default:
                        System.out.println("번역 불가.");
                }

            } else  {
                System.out.println("1 ~ 4 까지의 정수를 입력 하세요.");
                System.out.println("입력 삾 :"+input_);
            }

        } catch (Exception e) {
            System.out.println("숫자를 입력 사세요.");
            System.out.println("입력 값 :"+input_);
        }

    }

}
