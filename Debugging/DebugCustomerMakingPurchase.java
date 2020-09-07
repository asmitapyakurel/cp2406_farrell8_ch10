public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;

    private void FixDebugCustomerMakingPurchase(int id,
       String name, double credit, double purchAmount)
    {
       amountOfPurchase = purchAmount;
       if(amountOfPurchase > creditLimit) {
           overLimit = true;
       }
       else
          overLimit = false;
    }

    public DebugCustomerMakingPurchase(int id, double v, String name, double credit) {
        super(id, name, credit);
    }

    @Override
    public void display()
    {
       display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
