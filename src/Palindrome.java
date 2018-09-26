import java.util.Scanner;

// Task 5
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next().trim();
        isPalindrome(n);
    }

    private static void isPalindrome(String n) {
        for (int i = 0, j = n.length() - 1; i < n.length() / 2 ; i++, j--) {
            if (n.charAt(i) != n.charAt(j)){
                System.out.println("Not palindrome");
                return;
            }

        }
        System.out.println("Palindrome");
    }

}
