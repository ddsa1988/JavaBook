public class Main {
    public static void main (String[] args) {

        for (int i = 0; i < 10; i++) System.out.print(i + " ");

        System.out.println();

        int a = 9;
        while (a >= 0) {
            System.out.print(a + " ");
            a--;
        }

        System.out.println();

        int b = 1;
        do{
            System.out.print(b);
        } while (b < 1);
    }
}