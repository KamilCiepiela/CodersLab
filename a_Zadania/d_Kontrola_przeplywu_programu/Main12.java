public class Main12 {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;

        if ((a + b > c)||(c + b > a)||(a + c > b)) {
            System.out.println("Z podanych boków można zbudować trójkąt.");
        }
        else {
            System.out.println("Z podanych boków nie można zbudować trójkąta.");
        }

    }

}
