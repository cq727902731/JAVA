package pethospital;

public class Animal{
	private String name;

	public Animal(){}

	public Animal(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;
	}
	public void makeNoise(){
		System.out.println("¶¯ÎïµÄ½ÐÉù"); 
		
	}
	
}

