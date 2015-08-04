
class Sugar extends Decorator{

	public Sugar(){}
	public Sugar(Beverage beverage){
		super(beverage);
	}
	public Sugar(Beverage beverage,String dsc){
		super(beverage,dsc);
	}
	public double cost(){		
		return 1.0 + getBeverage().cost();
	}

}