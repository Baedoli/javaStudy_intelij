import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력 하세요.");
        String num1 = scanner.nextLine();

        try {
            int num2 = Integer.parseInt(num1);
            num2 = num2 + 1;
            System.out.println("다음 숫자는 "+num2+" 입니다.");
        } catch (Exception e) {
            System.out.println("숫자를 입력한다면 이련 오류는 생기지 않습니다.");
            System.out.println("입력값 ="+num1);
        }

    }
}
