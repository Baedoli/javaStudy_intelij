import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/444.txt");
            writer.write("치킨은 살 안쪄요.\n");
            writer.write("내가 살 쪄요.");
            writer.close();;
        } catch (IOException e) {
            System.out.println("파일 생성에 실파 하였습니다.");
            System.exit(11);
        }
    }
}
