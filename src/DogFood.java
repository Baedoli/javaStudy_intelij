import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("강아지 몸무게를 입력 하세요.");
        String input_ = scanner.nextLine();

        try {
            float weight_ = Float.parseFloat(input_);
            float inputWeight = weight_*10;

            System.out.println("강아지 몸무게 "+weight_+"kg 이며 몸무게 대비 권장 사료량은 "+inputWeight+"g 입니다.");
        } catch (Exception e) {
            System.out.println(" 강아지 몸무게는 숫자로 입력 하세요.");
            System.out.println(" 입력 값 :"+input_);
        }

    }
}
