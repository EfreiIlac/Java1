import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the average Value :");
        double average = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter your course name :");
        String courseName = sc.nextLine();

        System.out.println("Enter your college name :");
        String collegeName = sc.next();

        System.out.println("You are studying " + courseName + " in " + collegeName + " and your average is " + average);


        sc.close();
    }
}

