abstract class Vehicle{

	abstract public String NoOfWheels();
	
}
class Car extends Vehicle{
	public String NoOfWheels(){
	    System.out.println("ËÄÂÖ³µ");
		return null;
	}
} 
class Motorbike extends Vehicle{
	public String NoOfWheels(){
	    System.out.println("Ë«ÂÖ³µ");
		return null;
	}
} 
class VehicleDemo{
	public static void main(String[] args){    
	    Vehicle c = new Car();
		Vehicle m = new Motorbike();
		c.NoOfWheels();
		m.NoOfWheels();
	}		
}