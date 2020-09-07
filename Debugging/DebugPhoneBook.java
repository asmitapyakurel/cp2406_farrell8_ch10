import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
   private final int area;
   private final String size ;
   int CUTOFF = 30;

   DebugPhoneBook(String pages, int city)
   {
      super(pages);
      area = city;


      if (CUTOFF > pages)
      {
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
      return super.getPages(pages);
   }
}