import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {

    public static void main(String[] args) {

        FileInputStream inputStream = null;

        try {
            //inputStream = new FileInputStream("src/222.txt");
            inputStream = new FileInputStream("src/333.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재 하지 않습니다.");
            System.exit(10);
        }

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
/*
        Scanner scanner = new Scanner(inputStream);
        String line1 = scanner.nextLine();
        System.out.println(line1);
        String line2 = scanner.nextLine();
        System.out.println(line2);
        String line3  = scanner.nextLine();;
        System.out.println(line3); */

    }

}
