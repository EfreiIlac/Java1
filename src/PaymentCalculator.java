
import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) throws Exception {
        int hours = 0;
        double payRate = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours worked :");
        hours = sc.nextInt();
        System.out.println("Enter the pay rate :");
        payRate = sc.nextDouble();

        double grossPay = hours * payRate;
        System.out.println("The total pay is " + grossPay);

        sc.close();
    }
}
