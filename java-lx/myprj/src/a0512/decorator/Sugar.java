package a0512.decorator;

public class Sugar extends BeverageDecorator {

	public Sugar(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return .15 + getBeverage().cost();
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + "лг";
	}

}
