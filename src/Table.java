import java.util.Scanner;

// Task 6
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Table of " + n);
        multi(n);
    }

    private static void multi(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n + "*" + i + ": " + n * i);
        }
    }
}
