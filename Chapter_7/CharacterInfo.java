//import java.util.Scanner;

public class CharacterInfo{
   public static void main (String args[]){
      char charr;
      String CASE = "";
      //Scanner scan = new Scanner(System.in);
      charr = 'C';
      System.out.println("The character is "+charr);
      //charr = scan.next().charAt(0);
      
      if(Character.isLowerCase(charr)==true){
         System.out.println(charr+" is lowercase");
         CASE = "uppercase";
      }else{
         System.out.println(charr+" is uppercase");
         CASE = "lowercase";
      }
      
      System.out.println(charr+" is not "+CASE);
      System.out.println("After toLowerCase(), aChar is "+Character.toLowerCase(charr));
      System.out.println("After toUpperCase(), aChar is "+Character.toUpperCase(charr));
      
      if(Character.isLetterOrDigit(charr)==true){
         System.out.println(charr+" is a letter or digit");
      }else{
         System.out.println(charr+"not a letter or digit");
      }
      
      if(Character.isWhitespace(charr)==true){
         System.out.println(charr+" is a whitespace");
      }else{
         System.out.println(charr+" is not a whitespace");
      }
   }

}

