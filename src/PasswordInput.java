import java.util.Scanner;

public class PasswordInput {
    public static void main(String[] args) {

        String password = "abc123";
        Scanner scanner = new Scanner(System.in);
        String input_ = "";

        do {
            System.out.println("비밀번호를 입력 하세요.");
            input_ = scanner.nextLine();
        } while (input_.equals(password) != true);

        System.out.println("올바른 비멀번호를 입력 하습니다.");

    }
}
