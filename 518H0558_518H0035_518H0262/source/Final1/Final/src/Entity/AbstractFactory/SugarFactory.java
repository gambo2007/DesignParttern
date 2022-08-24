package Entity.AbstractFactory;

public class SugarFactory extends FoodAbstractFactory{
	@Override
	public Yaour createYaour() {
		return new SugarYaour();
	}
	
	@Override
	public Milk createMilk() {
		return new SugarMilk();
	}
}
