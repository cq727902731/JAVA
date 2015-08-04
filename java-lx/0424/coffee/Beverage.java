
public abstract class Beverage{

	private double price;
	private String dsc;

	public Beverage(){}

	public Beverage(double price,String dsc){
		this.price = price;
		this.dsc = dsc;
	}

	public double getPrice(){
		return price;
	}
	public String getDsc(){
		return dsc;
	}

	abstract double cost();

	public String toString(){
		return dsc;
	}

}