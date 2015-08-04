package a0512.decorator;

public abstract class BeverageDecorator extends Beverage {
	
	private Beverage beverage;	
	
	public BeverageDecorator(Beverage beverage){
		this.beverage = beverage;
	}

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
	
}
