import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몸무게(kg)를 입력 하세요.");
        String input1 = scanner.nextLine();
        System.out.println("신장(m)을 입력 하세요.");
        String input2 = scanner.nextLine();;

        try {
            double weight_ = Double.parseDouble(input1);
            double height_ = Double.parseDouble(input2);
            double bmi = 0;
            if (weight_ > 0 && height_ > 0) {
                bmi = weight_ / (height_*height_);
                if (bmi < 18.5) {
                    System.out.println("저체중 입니다. BMI 지수 :"+bmi);
                } else  if (bmi >= 23) {
                    System.out.println("과체중 입니다. BMI 지수 :"+bmi);
                } else {
                    System.out.println("정상 체중 입니다. BMI 지수 :"+bmi);
                }
            } else  {
                System.out.println("신장 및 몸무게근 반드시 0 이상 입력 하세요.");
            }
        } catch (Exception e) {
            System.out.println("신장 과 체중은 반드시 숫자 입력이 필요 합니다.");
            System.out.println("몸무게 입력 : "+input1);
            System.out.println("신장 입력 : "+input2);
        }
    }
}
