import java.util.HashSet;
import java.util.Set;

public class setExam01 {
    public static void main(String[] args) {
        Set<String> myFavoriteFoods = new HashSet<String>();

        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");

        System.out.println(myFavoriteFoods);

        for (String food : myFavoriteFoods) {
            System.out.println(food+" 맛 있어요.");
        }

        System.out.println("배열의 갯수 : "+myFavoriteFoods.size());


    }
}
