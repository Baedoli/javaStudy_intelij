import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        Integer[] integerArry = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> integerList = Arrays.asList(integerArry);

        System.out.println(integerList);
    }
}
