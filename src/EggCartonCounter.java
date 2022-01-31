import java.util.Scanner;

public class EggCartonCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("닭이 낳은 개란 수를 입력 하세요.");
        String input_ = scanner.nextLine();

        try {
            int num = Integer.parseInt(input_);
            int count_ = 0;
            if (num > 0 && num <= 30 ) {
                System.out.println(" 필요한 계란 판수는 1 입니다.");
            } else  if ( num > 30 ) {
                count_ = ( num / 30 ) + 1;
                System.out.println("필요한 계란 판수는 "+count_+" 입니다.");
            } else {
                System.out.println("계란판이 필요 하지 않습니다.");
            }

        } catch (Exception e) {
            System.out.println("숫자로 입력 하세요.");
            System.out.println("입력하신 내용은 "+input_);
        }

    }
}
