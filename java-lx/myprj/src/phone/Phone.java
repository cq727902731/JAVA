package phone;

public class Phone {

	
	private String model;
	private String brand;
	private Power power;
	
	
	public void call(){
		if(power != null){
			power.providerPower();
			System.out.println("��绰");
		}
			
		
	}
	
	public void sendMsg(){
		
	}
	
}
