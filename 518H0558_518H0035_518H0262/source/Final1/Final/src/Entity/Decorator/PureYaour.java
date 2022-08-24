package Entity.Decorator;

public class PureYaour extends CondimentDecorator{
	Food food;
	
	public PureYaour (Food food) {
		this.food = food;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return food.getDescription() + ",Pure";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .15 + food.cost();
	}
	
}
