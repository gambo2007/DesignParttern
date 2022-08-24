package Entity.AbstractFactory;

public class FoodFactory {
	private FoodFactory() {
		
	}
	
	public static FoodAbstractFactory getFactory(TypeFood typeFood) {
		switch(typeFood) {
			case SUGAR:
				return new SugarFactory();
			case PURE:
				return new PureFactory();
			default:
				throw new UnsupportedOperationException("This food isn't supported ");
		}
	}
}
