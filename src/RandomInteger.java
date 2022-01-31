import java.util.Random;
import java.util.Scanner;

public class RandomInteger {

    public static void main(String[] args) {

        System.out.println("지금부터 0~255 사이의 숫자를 하나 뽑겠습니다.");
        System.out.println("여러분은 제가 뽑은 숫자를 맞춰야 합니다.");

        // 0 ~ 256 사의의 숫자 중 임의의 숫자 하나를 선택합니다....
        Random random = new Random();
        int randomNumber = random.nextInt(256);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println(8 - i + "번의 기회가 있습니다.");

            System.out.println("추측한 숫자를 입력 하세요.");
            String input_ = scanner.nextLine();

            int guess = Integer.parseInt(input_);

            if (randomNumber == guess) {
                System.out.println("정답입니다. 짝짝짝 ...");
                break;
            } else if (randomNumber < guess) {
                System.out.println("제가 생각한 숫자보다 적습니다.");
            } else {
                System.out.println("제가 생각한 숫자보다 큽니다.");
            }

            if (i == 7) {
                System.out.println("더이상 기회가 남지 않았습니다.");
            }

        }

        System.out.println("게임을 종료 합니다.");

    }
/*
        System.out.println("지금 무슨 생각을 하고 있는지 맞춰 볼께요.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep 실패...");
        }

        System.out.println("치킨!");

    } */

}
