package Entity.Template;

public class NetOrder extends OrderProcess{

	@Override
	public void doSelect() {
		// TODO Auto-generated method stub
		System.out.println("Item added to online shopping cart");
        System.out.println("Get food wrap preference");
        System.out.println("Get delivery address.");
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Online Payment through Netbanking, card or Paytm");
	}

	@Override
	public void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Ship the item through post to delivery address");
	}

}
