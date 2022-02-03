public class returnValue {
    public static void main(String[] args) {

        int[] num = addAndMulti(2,3);

        int sum = num[0];
        int product = num[1];

        System.out.println("2 + 3 = "+sum);
        System.out.println("2 * 3 = "+product);

    }

    public static int[] addAndMulti(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] result = { sum, product};

        return result;
    }

}
