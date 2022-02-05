import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NotepadWithList {

    public static Scanner scanner = new Scanner(System.in);
    public static List<String> memoList = readMemoList();

    public static void main(String[] args) {

        while (true) {
            System.out.println("원하는 작업 번호를 선택하세요.");
            System.out.println("1: 메모 읽기");
            System.out.println("2: 새 메모");
            System.out.println("3: 메모 목록");
            System.out.println("4: 종료");

            String operation = scanner.nextLine();
            Integer taskNm = parseIntegerOrNegative1(operation);

            if (taskNm==1) {
                System.out.println("메모할 파일명을 입력 하세요.");
                String fileName = scanner.nextLine();
                readMemo(fileName);
            } else if (taskNm==2) {
                System.out.println("저장할 메모 파일명을 입력 하세요.");
                String fileName = scanner.nextLine();
                writeMemo(fileName);
            } else if (taskNm==3) {
                showMemoList();
            } else if (taskNm==4) {
                System.out.println("프로그램을 종료 합니다.");
                saveMemoList();
                break;
            } else {
                System.out.println("잘못된 입력 값입니다.");
            }
        }

    }

    public static void readMemo(String fileName) {

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재 하지 않습니다.");
            return;
        }

        System.out.println(fileName+" 의 내용을 출력 합니다.");
        Scanner reader = new Scanner(inputStream);

        while (scanner.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        System.out.println("\n");

        reader.close();
    }

    private static void writeMemo(String fileName) {
        if (memoList.contains(fileName)) {
            System.out.println("동일한 파일명이 존재 합니다.");
            return;
        }

        FileWriter writer = null;

        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패 하였습니다.");
            return;
        }

        System.out.println("메모할 내용을 입력 하세요.");
        System.out.println("종료 하시려면 빈줄에서 엔터키 입력 하세요.");

        while (true) {

            String input = scanner.nextLine();
            if (input.equals("")) break;

            try {
                writer.write(input);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("파일에 문자열을 기록하지 못했습니다.");
            }

            try {
                writer.close();
                memoList.add(fileName);
                Collections.sort(memoList);
            } catch (IOException e) {
                System.out.println("파일을 닫는데 실해 하였습니다.");
            }

        }
    }

    public static ArrayList<String> readMemoList() {
        FileInputStream inputStream = null;

        ArrayList<String> memoList = new ArrayList<String>();

        try {
            inputStream = new FileInputStream("src/notes.txt");

        } catch (FileNotFoundException e) {
            System.out.println("파일 읽기에 실패 하였습니다.");
            return memoList;
        }

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNextLine()) {
            String fileName = scanner.nextLine();
            memoList.add(fileName);
        }
        return memoList;
    }

    public static void showMemoList() {
        if (memoList.isEmpty()) System.out.println("작성된 메모가 없습니다.");
        else {
            System.out.println("메모 목록을 출력 합니다.");

            for (String fileName : memoList ) {
                System.out.println(fileName);
            }
            System.out.println("");
        }
    }

    public static void saveMemoList() {
        FileWriter writer = null;

        try {
            writer = new FileWriter("src/notes.txt");

            for (String fileNmae : memoList) {
                writer.write(fileNmae);
                writer.write("\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("파일을 생성 할 수 없습니다,");
        }
    }

    public static int parseIntegerOrNegative1(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
