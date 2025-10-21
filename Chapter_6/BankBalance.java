import java.util.Scanner;

class BankBalance{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        double balance = scan.nextDouble();
        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for YES or Any number for NO >> ");
        int choice = scan.nextInt();
        int counter = 2;
        if (choice==1) {
            balance = balance+(balance*0.03);
            System.out.println("After 1 year at 0.03 interest rate, balance is $"+balance);
            while (true) {
                System.out.println("\n\nDo you want to see the balnce at the end of another year?");
                System.out.print("Enter 1 for YES or Any number for NO >> ");
                choice = scan.nextInt();
                if(choice==1){
                    balance = balance+(balance*0.03);
                    System.out.println("After "+counter+" years at 0.03 interest rate, balance is $"+balance);
                    counter++;
                }else{
                    scan.close();
                    break;
                }
            }
        }
    }
}
