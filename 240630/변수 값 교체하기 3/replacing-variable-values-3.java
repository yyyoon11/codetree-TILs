public class Main {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int temp;

        temp = a; // temp = 3
        a = b; // a = 5
        b = temp; // b = 3;

        System.out.println(a);
        System.out.println(b);
    }
}