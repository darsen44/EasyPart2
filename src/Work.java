// Task 4
public class Work {
    public static void main(String[] args) {
        double salary = 8.5;
        double hours = 55;
        System.out.println("Salary per week " + income(salary,hours) + "$");
    }

    private static double income(double salary, double hours){
        if(hours > 60){
            System.out.println("Too many hours");
            return -1;
        }
        if(salary < 8){
            System.out.println("Not enough salary");
            return -1;
        }
        if(hours > 40)
            hours = 40 + (hours - 40) * 1.5;
        return hours * salary;
    }
}
