

public class Telephone{
	private String brand;
	private String model;
	private Battery battery; //组合

	//构造时提供battery对象

	public Telephone(){}

	public Telephone(String brand,String model,Battery battery){
		this.brand = brand;
		this.model = model;
		this.battery = battery;
	}
	public void setBrand(String brand){
		this.brand = brand;	
	}
	public String getBrand(){
		return brand;
	}
	public void setModel(String model){
		this.model = model;	
	}
	public String getModel(){
		return model;
	}
	public void setBattery(Battery battery){
		this.battery = battery;
	}
	public Battery getBattery(){
		return battery;
	}
	public void call(){
		if (!(battery != null)){
			System.out.println("没电池。。");
			return;	
		}
		battery.power();
		System.out.println("品牌:" + brand + "型号:" + model + "通话中"); 
	}
	public void sendMsg(String msg){
		if (!(battery != null)){
			System.out.println("没电池。。");
			return;	
		}
		battery.power();
		System.out.println("品牌:" + brand + "型号:" + model + "通话中"); 
	}

		
}
class Apple extends Telephone{
	public Apple(String brand,String model,Battery battery){
		super(brand,model,battery);
	}
	@Override
	public void call(){
		if (!(getBattery()!= null)){
			System.out.println("没电池。。");
			return;	
		}
		getBattery().power();
			System.out.println("Apple品牌:" + getBrand() + "型号:" + getModel() + "通话中。。");
	}
	public void sendMsg(String msg){
		if (!(getBattery()!= null)){
			System.out.println("没电池。。");
			return;	
		}
		getBattery().power();
			System.out.println("Apple品牌:" + getBrand() + "型号:" + getModel() + "发短信");
	}
}
class Samsung extends Telephone{
	public Samsung(String brand,String model,Battery battery){
		super(brand,model,battery);
	}
	@Override
	public void call(){
		if (!(getBattery()!= null)){
			System.out.println("没电池。。");
			return;	
		}
		getBattery().power();
			System.out.println("Samsung品牌:" + getBrand() + "型号:" + getModel() + "通话中..");
	}
	public void sendMsg(String msg){
		if (!(getBattery()!= null)){
			System.out.println("没电池。。");
			return;	
		}
		getBattery().power();
			System.out.println("Samsung品牌:" + getBrand() + "型号:" + getModel() + "发短信" + msg);
	}
}
