public class DebugCustomerMakingPurchase extends DebugCustomer
{
    double amountOfPurchase;
    private boolean overLimit;

    private void FixDebugCustomerMakingPurchase(int id,
       String name, double credit, double pAmount)
    {
       amountOfPurchase = pAmount;
       if(amountOfPurchase > creditLimit) {
           overLimit = true;
       }
       else
          overLimit = false;
    }

    public DebugCustomerMakingPurchase(int id, double v, String name, double credit)
    {
        super(id, name, credit);
        amountOfPurchase = v;
    }

    @Override
    public void display()
    {
       super.display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
