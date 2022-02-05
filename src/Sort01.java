import java.util.ArrayList;
import java.util.Collections;

public class Sort01 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();

        students.add("배성호");
        students.add("오정임");
        students.add("배미진");
        students.add("배예진");

        System.out.println("정렬 전 : "+students);
        Collections.sort(students);
        System.out.println("오름 차순 정렬 후 : "+students);
        Collections.reverse(students);
        System.out.println("내림 차순 정렬 후 : "+students);

    }
}
