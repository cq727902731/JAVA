package a0512.decorator;

public abstract class Beverage {
	private String description;

	public String getDescription() {
		return "��֪����ɶ����";
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract double cost();	//���ϵļ۸�
	
}	
