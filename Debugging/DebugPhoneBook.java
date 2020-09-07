import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
   private final String area;
   private final String size ;
   private  final int CUTOFF = 30;

   DebugPhoneBook(int pages, String city)
   {
      super(pages);
      this.area = city;


      if (pages < CUTOFF) {

         size = "big";
      }
      else
         size = "small";
   }



   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book.");
   }

   @Override
   public int getPages() {
      return 0;
   }
}