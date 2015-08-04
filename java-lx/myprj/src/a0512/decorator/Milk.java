package a0512.decorator;

public class Milk extends BeverageDecorator {
	
	
	
	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return .5 + getBeverage().cost();
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + "еёдл";
	}
	
	

}
