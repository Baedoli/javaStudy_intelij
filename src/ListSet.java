import java.util.*;

public class ListSet {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();

        foods.add("파");
        foods.add("피자");
        foods.add("치킨");

        foods.set(0, "치킨");

        String foodName = foods.get(0);
        Boolean isFoundValue = foods.contains("치킨");

        System.out.println("First Food is "+foodName);
        System.out.println("치긴의 값은 있는가 ? "+isFoundValue);

    }
}
