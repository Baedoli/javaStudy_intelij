import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckDuplicate {
    public static void main(String[] args) {

        System.out.println("좋아 하는 음식의 이름을 입력 하세요. (종료 : 0)");
        ArrayList<String> myFavoriteFoods = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String foods = scanner.nextLine();

            if (foods.equals("0")) break;;

            if (myFavoriteFoods.contains(foods)) {
                System.out.println("이미 음식이 존재 합니다.");
            } else  {
                myFavoriteFoods.add(foods);
            }

        }

        System.out.println(myFavoriteFoods);

    }
}
