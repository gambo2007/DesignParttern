package Entity.AbstractFactory;

public class PureFactory extends FoodAbstractFactory{
	@Override
	public Yaour createYaour() {
		return new PureYaour();
	}
	
	@Override
	public Milk createMilk() {
		return new PureMilk();
	}
}
