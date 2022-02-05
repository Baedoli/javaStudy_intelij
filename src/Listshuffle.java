import java.util.ArrayList;
import java.util.Collections;

public class Listshuffle {
    public static void main(String[] args) {
        ArrayList<Integer> interges = new ArrayList<Integer>();

        for (int i=0; i<10; i++) {
            interges.add(i);
        }

        System.out.println("섞기 전 : "+interges);
        Collections.shuffle(interges);
        System.out.println("섞은 후 : "+interges);
    }
}
