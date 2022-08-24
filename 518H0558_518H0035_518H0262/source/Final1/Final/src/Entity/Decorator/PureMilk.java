package Entity.Decorator;

public class PureMilk extends CondimentDecorator{
	Food food;
	
	public PureMilk (Food food) {
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
