import java.util.Scanner;

class PayOutOfBoundsException extends Exception {
    public PayOutOfBoundsException(String message) {
        super(message);
    }
}

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int basicSalary = sc.nextInt();
        try {
            if (basicSalary < 8000) {
                throw new PayOutOfBoundsException("Basic salary cannot be less than 8000");
            }
            double da = 0.1 * basicSalary;
            double hra = 0.15 * basicSalary;
            double ta = 0.05 * basicSalary;
            double pt = 200;
            double tds = 0.1 * basicSalary;
            double grossSalary = basicSalary + da + hra + ta - pt - tds;
            System.out.println("Gross salary: " + grossSalary);
        } catch (PayOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
