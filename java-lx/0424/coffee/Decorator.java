
abstract class Decorator extends Beverage{
	
	private Beverage beverage; //装饰的对象
	
	public Decorator(){}
	public Decorator(Beverage beverage){
		this.beverage = beverage;
	}
	public Decorator(Beverage beverage,String dsc){
		super(0.0,dsc);
		this.beverage = beverage;
	}
	public Beverage getBeverage(){
		return beverage;
	}
	public String toString(){
		return super.toString() + "、" + beverage;
	}
	
}