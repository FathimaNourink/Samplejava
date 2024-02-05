package inheritance;
import java.util.Scanner;

public class Employee {
    double basicPay;
    double deduction;
    double bonus;
  
    public void getDetails() {
      
           Scanner sc = new Scanner(System.in);

            System.out.print("Enter the basic pay:");
            basicPay = sc.nextDouble();

            System.out.print("Enter the deduction :");
            deduction = sc.nextDouble();

            System.out.print("Enter the bonus:");
            bonus = sc.nextDouble();
    }
}