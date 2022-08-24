package Entity.Decorator;

public class SugarYaour extends CondimentDecorator{
	Food food;
	
	public SugarYaour (Food food) {
		this.food = food;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return food.getDescription() + ",Sugar";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .19 + food.cost();
	}
	
}