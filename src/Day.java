
// Task 10
public class Day {
    public static void main(String[] args) {
        int days = 356;
        calc(days);
    }

    private static void calc(int days) {
        System.out.println("In " + days + " days are: " + "\n"
                + days * 24 +" hours;" + "\n"
                + days * 1440+ " minutes;" + "\n"
                + days * 86400 + " seconds.");
    }
}
