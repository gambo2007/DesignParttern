package Entity.Decorator;

public abstract class Food {
	String description = "Unknown Food";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
