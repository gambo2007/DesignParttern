package Entity.Template;

public abstract class OrderProcess {
	public boolean isDelivery;
	  
    public abstract void doSelect();
  
    public abstract void doPayment();
  
    public final void foodWrap()
    {
        try
        {
            System.out.println("Food wrap successful");
        }
        catch (Exception e)
        {
            System.out.println("Food wrap unsuccessful");
        }
    }
  
    public abstract void doDelivery();
  
    public final void processOrder(boolean isDelivery)
    {
        doSelect();
        doPayment();
        if (isDelivery) {
            foodWrap();
        }
        doDelivery();
    }
}
