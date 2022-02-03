import java.util.Scanner;

public class multiMethod {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 연산을 선택 하세요.");
        System.out.println("1: 더하기");
        System.out.println("2: 곱하기");
        System.out.println("그외는 종료");

        String input = scanner.nextLine();
        System.out.println("첫번째 숫자를 입력하세요.");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        int num2 = scanner.nextInt();

        if (input.equals("1")) {
            int sum = add(num1, num2);
            System.out.println(num1+" = "+num2+" = "+sum);
        }

        if (input.equals("2")) {
            int product = product(num1, num2);
            System.out.println(num1+" * "+num2+" = "+product);
        }

    }

    public static int add (int a, int b) {
        System.out.println("덧셈을 수행 합니다.");
        return  a+b;
    }

    public static int product (int a, int b) {
        System.out.println("곱셈을 수행 합니다.");
        return  a*b;
    }


}
