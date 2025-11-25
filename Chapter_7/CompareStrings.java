import java.util.Scanner;

public class CompareStrings{
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      String preName = "Carmen";
      System.out.print("Enter your name > ");
      String name = scan.nextLine();
      if(name.equals(preName)){
         System.out.println(preName+" equals "+name);
      }else{
         System.out.println(preName+" does not equal "+name);
      }
   }
}