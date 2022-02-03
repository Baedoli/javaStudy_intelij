import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {

        // 입력 받을 스캐너 선언 합니다.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 작업 번호를 입력 하세요.");
            System.out.println("1: 일기 읽기");
            System.out.println("2: 새 읽기");
            System.out.println("3: 종료");

            int taskNum = 0;

            try {
                String input = scanner.nextLine();
                taskNum = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력 하세ㅛ.");
                continue;
            }

            // 일기 읽기 ...
            if (taskNum==1) {
                //
                System.out.println("년도를 입력하세요. 예:1970");
                String year = scanner.nextLine();
                System.out.println("월을 입력 사세요. 예:01");
                String month = scanner.nextLine();
                System.out.println("일자를 입력 하세요. 예:01");
                String day = scanner.nextLine();

                String fileName = year+"-"+month+"-"+day+".txt";

                FileInputStream inputStream = null;

                try {
                    inputStream = new FileInputStream(fileName);
                } catch (FileNotFoundException e) {
                    System.out.println("파일을 생성할 수 없습니다.");
                    continue;
                }

                System.out.println(year+"-"+month+"-"+day+"의 읽기");

                Scanner reader = new Scanner(inputStream);

                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
                System.out.println("\n");
                reader.close();

                // 새 일기를 선택 합니다..
            } else if (taskNum == 2) {

                System.out.println("년도를 입력하세요. 예:1970");
                String year = scanner.nextLine();
                System.out.println("월을 입력 사헤요. 예:01");
                String month = scanner.nextLine();
                System.out.println("일자를 입력하세요. 예:01");
                String day = scanner.nextLine();

                String fileName = year+"-"+month+"-"+day+".txt";

                FileWriter writer = null;

                try {
                    writer = new FileWriter(fileName);
                } catch (IOException e) {
                    System.out.println("파일 쓰기에 실패 하였습니다.");
                    continue;
                }

                System.out.println("날씨를 입력하세요.");
                String weather = scanner.nextLine();
                System.out.println("제목을 입력 하세요.");
                String title = scanner.nextLine();

                try {
                    writer.write("날씨 :"+weather);
                    writer.write("\n");
                    writer.write("제목 :"+title);
                    writer.write("\n");
                } catch (IOException e) {
                    System.out.println("파일에 문자열을 쓰지 못했습니다.");
                }

                System.out.println("일기 내용을 입력 하세요.");
                System.out.println("종료 시 빈줄 엔터");

                while (true) {
                    String body = scanner.nextLine();

                    if (body.equals("")) {
                        break;
                    }

                    try {
                        writer.write(body);
                        writer.write("\n");
                    } catch (IOException e) {
                        System.out.println("파일 쓰기에 실패 했습니다.");
                    }
                }

                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기에 실패 했습니다.");
                }

            } else if (taskNum==3) {

                System.out.println("프로그램을 종료 합니다.");
                break;

            } else  {
                System.out.println("잘못된 입력 압니다. 1,2,3 중에 하나를 입력 하세요.");
            }

        }
    }
}
