import java.util.Scanner;

public class Payroll {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Employee emp = new Employee();

      System.out.print("How many hours did you work this week? ");
      double hours = scan.nextDouble();

      System.out.print("What is your regular pay rate? ");
      double rate = scan.nextDouble();
      emp.setPayRate(rate);

      double regularPay = emp.computeRegularPay(hours);
      double overtimePay = emp.computeOvertimePay(hours);

      System.out.println("Regular pay is " + regularPay);
      System.out.println("Overtime pay is " + overtimePay);

   }
}
