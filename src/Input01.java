import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("이름을 입력하세요.");
        String input_ = scanner.nextLine();
        System.out.println(input_+" 님 반갑습니다.");

        System.out.println("영어 단어와 한글 단어를 순서대로 입력 사헤요.");
        String eng_ = scanner.next();
        String kor_ = scanner.next();

        System.out.println("영단어 :"+eng_);
        System.out.println("한글 단어 :"+kor_);
*/
        System.out.println("첫번째 숫자를 입력 하세요.");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("두번째 숫자를 입력 하세요.");
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum_ = num1 + num2;
        System.out.println("두 수의 합은 :"+sum_);
    }
}
