import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int paymentValue = 1000;
        int quota = 10;
        int bonus = 250;

        System.out.println("Enter the number of sales you did :");
        int sales = sc.nextInt();
        if (sales > quota) {
            int total = paymentValue + bonus;
            System.out.println("Your total pay is : "+ total + " you had the 250$ bonus, congratuation ");
        } else {
            System.out.println("Your total pay is " + paymentValue + " you did not reach the quota, you needed " + (quota - sales) + " more sales");
        }

        sc.close();
    }
    
}
