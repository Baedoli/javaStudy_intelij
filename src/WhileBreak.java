import java.util.Scanner;

public class WhileBreak {
    public static void main(String[] args) {
        String password = "abc123";
        Scanner scanner = new Scanner(System.in);
        String input_ = "";

        while (true) {
            System.out.println("비밀 번호를 입력 하세요.");
            input_ = scanner.nextLine();;

            if(input_.equals(password)==true) {
                System.out.println("비밀번호가 일치 합니다.");
                break;
            } else {
                System.out.println("비밀번호가 불일치 합니다.");
            }
        }

    }
}
