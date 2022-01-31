import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInputNote {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        FileWriter writer = null;

        try {
            writer = new FileWriter("src/555.txt");
        } catch (IOException e) {
            System.out.println("파일 생성에 실패 하였습니다.");
            System.exit(11);
        }

        System.out.println("저장할 문자영을 입력하세요. 종료 시에는 엔터키를 입력 하세요.");

        while (true) {
            String input = scanne.nextLine();;

            if (input.equals("")) {
                break;
            }

            try {
                writer.write(input);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("문자를 쓰지 못했습니다.");
                System.exit(12);
            }
        }

        try {
            writer.close();;
        } catch (IOException e) {
            System.out.println("파일을 닫는데 실패 하였습니다.");
            System.exit(13);
        }

    }
}
