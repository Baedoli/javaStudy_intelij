import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaNotepad {
    public static void main(String[] args) {
        // 사용자로 부터 입력 받을 scanner 선언 합니다.
        Scanner scanner = new Scanner(System.in);

        // Loop 1
        // 무한반복 이지만 3을 입력 하면 탈출 ..
        while (true) {
            System.out.println("원하는 작업 번호를 입력 하세요.");
            System.out.println("1: 메모읽기");
            System.out.println("2: 새 메모");
            System.out.println("3: 종료");

            int taskNum = 0;
            try {
                String input = scanner.nextLine();
                taskNum = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                System.out.println("잘못된 숫자 입력 입니다.");
                continue;
            }

            // 메모 읽기...
            if (taskNum==1) {
                System.out.println("메모 파일병을 입력하세요.");

                String fileName = scanner.nextLine();
                FileInputStream inputStream = null;

                try {
                    inputStream = new FileInputStream(fileName);
                } catch (FileNotFoundException e) {
                    System.out.println("파일이 존재 하지 안습니다.");
                    continue;
                }

                System.out.println(fileName+"의 파일 내용을 출력 합니다.");
                Scanner reader = new Scanner(inputStream);

                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
                System.out.println("\n");
                reader.close();

            } else  if (taskNum==2) {
                System.out.println("저장할 파일명을 입력 하세요.");

                String fileName = scanner.nextLine();
                FileWriter writer = null;

                try {
                    writer = new FileWriter(fileName);
                } catch (IOException e) {
                    System.out.println("파일 생성에 실패 했습니다.");
                    continue;
                }

                System.out.println("메ㅁ할 내용을 입력 하세요.");
                System.out.println("종료 시 빈줄 엔터 입력 하세요.");

                while (true) {
                    String input = scanner.nextLine();

                    if (input.equals("")) {
                        break;
                    }

                    try {
                        writer.write(input);
                        writer.write("\n");
                    }   catch (IOException e) {
                        System.out.println("파일에 문자열을 쓰지 못했습니다.");
                    }

                }

                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("파일을 닫는데 실패 하였습니다.");
                }

            } else  if (taskNum==3) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

            else {
                System.out.println("잘못된 입력 입니다.");
            }

        }

    }
}
