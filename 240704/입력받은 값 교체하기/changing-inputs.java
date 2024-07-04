import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;

        temp = a; // temp = 14
        a = b; // a = 5
        b = temp; // b = 14

        System.out.print(a + " " + b);
    }
}