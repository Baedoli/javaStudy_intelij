import java.util.Scanner;

public class returnMethod {
    public static void main(String[] args) {
        System.out.println("이름을 입력 하세요.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        sayhola(name);
    }

    public static void sayhola(String name) {
        if (name.equals("바보")) {
            System.out.println("고운말을 사용해 주세요.");
            return;
        }
        System.out.println(name+" 님 반갑습니다.");
    }

}
