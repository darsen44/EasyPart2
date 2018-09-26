// Task 1
public class Integer {
    public static void main(String[] args) {
        double a = 6.0001;
        int b = (int) a;
        double c = a - b;
        if(c != 0) System.out.println("Not integer");
        else System.out.println("Integer");
    }
}
