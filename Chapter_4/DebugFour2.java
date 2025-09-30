// This class uses a DebugPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values
import java.util.Scanner;
public class DebugFour2
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      String color;
      String point;
      DebugPen pen1 = new DebugPen();
      DebugPen pen2 = new DebugPen();
      System.out.print("Enter a color ink for the pen >> ");
      color = input.nextLine();
      System.out.print("Enter a point size - fine, medium, or thick >> ");
      point = input.nextLine();
      pen1 = new DebugPen();
      pen2 = new DebugPen(point, color);
      System.out.println("Default value pen:");
      display(pen1.getColor(), pen1.getPoint());
      System.out.println("User value pen:");
      display(pen2.getColor(), pen2.getPoint());
   }
   public static void display(String c, String p)
   {
      System.out.println("   The pen has ink color " + c);
      System.out.println("      and a " + p + " point.");
   }
}
