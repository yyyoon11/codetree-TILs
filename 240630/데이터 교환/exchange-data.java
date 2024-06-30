public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7; // a = 7, b = 5, c = 6
        int temp;

        temp = a; // temp = 5
        a = c; // a = 7;
        c = b; // c = 6;
        b = temp; // b = 5

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}