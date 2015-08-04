package a0512.decorator;

public abstract class Beverage {
	private String description;

	public String getDescription() {
		return "不知道是啥饮料";
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract double cost();	//饮料的价格
	
}	
