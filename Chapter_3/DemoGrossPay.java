import javax.swing.*;

class DemoGrossPay{
   public static void main(String args[]){  
      calculateGross(10.0);
      calculateGross(25.0);
      calculateGross(37.5);
   }
   static void calculateGross(double hours){
      double HourRate = 22.75;
      double gross = hours*HourRate;
      System.out.printf("%.2f hours at $%.2f per hour is $%.3f\n", hours, HourRate, gross);
   }
}