import javax.swing.*;

public class UsingJOptionPaneDialogs{
   public static void main(String args[]){
   
      int Continue = 1;
      String name;
      
      do{
         name = JOptionPane.showInputDialog("Enter your name");
         Continue = JOptionPane.showConfirmDialog(null, "Is your name "+name+"?", "Confirmation", JOptionPane.YES_NO_OPTION);
      }while(Continue==1);

      JOptionPane.showMessageDialog(null, "Your Name is "+name);
      
      //ARNOLD A. ABABA
   }
}