import java.util.Scanner;

public class BankBalanceByRateAndYear{
   public static void main(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter initial balance > ");
      double balance = scan.nextDouble();
      double rate = 0.02;
      double temp = balance;
      for(int x=1; x<=4; x++){
         System.out.println("\nWith an initial balance of $"+balance+" at an interest of "+rate);
         for(int y=1; y<=4; y++){
            balance+=(balance*rate);
            System.out.println("After year "+y+" balance is $"+balance);
         }
         rate+=0.01;
         balance=temp;
      }
   }
}