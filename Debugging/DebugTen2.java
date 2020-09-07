// A Vacation is 10 days
// but an ExtendedVacation is 30 days
public class DebugTen2
{


   public static void main(String[] args)
   {
      Object debugVacation = new DebugExtendedVacation();

      Object debugExtendedVacation = new DebugExtendedVacation();
      DebugVacation myVacation = null;
      assert false;
      System.out.println("My vacation is for " +
         myVacation.getDays() + " days");
      DebugVacation yourVacation = null;
      System.out.println("Your vacation is for " +
         yourVacation.getDays() + " days");
   }
}
