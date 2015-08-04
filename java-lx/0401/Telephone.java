

public class Telephone{
	private String brand;
	private String model;
	private Battery battery; //���

	//����ʱ�ṩbattery����

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
			System.out.println("û��ء���");
			return;	
		}
		battery.power();
		System.out.println("Ʒ��:" + brand + "�ͺ�:" + model + "ͨ����"); 
	}
	public void sendMsg(String msg){
		if (!(battery != null)){
			System.out.println("û��ء���");
			return;	
		}
		battery.power();
		System.out.println("Ʒ��:" + brand + "�ͺ�:" + model + "ͨ����"); 
	}

		
}
class Apple extends Telephone{
	public Apple(String brand,String model,Battery battery){
		super(brand,model,battery);
	}
	@Override
	public void call(){
		if (!(getBattery()!= null)){
			System.out.println("û��ء���");
			return;	
		}
		getBattery().power();
			System.out.println("AppleƷ��:" + getBrand() + "�ͺ�:" + getModel() + "ͨ���С���");
	}
	public void sendMsg(String msg){
		if (!(getBattery()!= null)){
			System.out.println("û��ء���");
			return;	
		}
		getBattery().power();
			System.out.println("AppleƷ��:" + getBrand() + "�ͺ�:" + getModel() + "������");
	}
}
class Samsung extends Telephone{
	public Samsung(String brand,String model,Battery battery){
		super(brand,model,battery);
	}
	@Override
	public void call(){
		if (!(getBattery()!= null)){
			System.out.println("û��ء���");
			return;	
		}
		getBattery().power();
			System.out.println("SamsungƷ��:" + getBrand() + "�ͺ�:" + getModel() + "ͨ����..");
	}
	public void sendMsg(String msg){
		if (!(getBattery()!= null)){
			System.out.println("û��ء���");
			return;	
		}
		getBattery().power();
			System.out.println("SamsungƷ��:" + getBrand() + "�ͺ�:" + getModel() + "������" + msg);
	}
}
