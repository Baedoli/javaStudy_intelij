public class StringClass {
    public static void main(String[] args) {
        String birethday = "1974/01/02";
        int yyyy = Integer.parseInt(birethday.substring(0,4));
        int mm = Integer.parseInt(birethday.substring(5,7));
        int dd = Integer.parseInt(birethday.substring(8,10));

        System.out.println("년도 : "+yyyy);
        System.out.println("월 : "+mm);
        System.out.println("일자 : "+dd);

    }
}
