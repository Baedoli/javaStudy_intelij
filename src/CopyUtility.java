import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyUtility {
    public static void main(String[] args) {
        // FileInputStream input =
        Scanner scanner = new Scanner(System.in);
        System.out.println("복사할 파일명을 입력 하세요.");
        String fileNameFrom = scanner.nextLine();
        System.out.println("복사 대상 파일명을 입력 하세요.");
        String fileNameTo = scanner.nextLine();

        FileInputStream inputStream = null;
        FileWriter writer = null;

        try {
            inputStream = new FileInputStream(fileNameFrom);
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다. 파일명 :"+fileNameFrom);
            System.exit(10);
        }

        try {
            writer = new FileWriter(fileNameTo);

        } catch (IOException e) {
            System.out.println("파일 생성에 실파 하였습니다.");
            System.exit(11);
        }

        Scanner fileReader = new Scanner(inputStream);

        while (fileReader.hasNextLine()) {

            String line = fileReader.nextLine();

            try {
                writer.write(line);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("파일 쓰기에 실피 하였습니다.");
                System.exit(12);
            }
        }

        System.out.println("파일 복사가 종료 되었습니다.");
        System.out.println("원본 파일 :"+fileNameFrom);
        System.out.println("대상 파일 :"+fileNameTo);

        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일을 닫는데 실패 하였습니다.");
        }

    }

}
