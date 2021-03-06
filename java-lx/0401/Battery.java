

public class Battery{
	private String brand;//品牌
	private int capacity;//容量
	private String material;//材料

	public Battery(){}

	public Battery(String brand,int capacity,String material){
		this.brand = brand;
		this.capacity = capacity;
		this.material = material;
	}
	public void setBrand(String brand){
		this.brand = brand;	
	}
	public String getBrand(){
		return brand;
	}
	public void setCapacity(int capacity){
		this.capacity = capacity;	
	}
	public int getCapacity(){
		return capacity;
	}
	public void setMaterial(String material){
		this.material = material;	
	}
	public String getMaterial(){
		return material;
	}
	public void power(){
		if (capacity > 0){
			System.out.println(brand + "的材料是:" + material + ",电量为" + capacity + "在供电"); 

		}
	}
}

class Byd extends Battery{
	
	public Byd(String brand,int capacity,String material){
		super(brand,capacity,material);
	}

	@Override
	public void power(){
		if (getCapacity() > 0){
			System.out.println(getBrand() + "的电池，材料是" + getMaterial() + "容量为" + getCapacity()); 
			
		}
	}
}
class Pisen extends Battery{
	
	public Pisen(String brand,int capacity,String material){
		super(brand,capacity,material);
	}

	@Override
	public void power(){
		if (getCapacity() > 0){
			System.out.println(getBrand() + "的电池，材料是" + getMaterial() + "容量为" + getCapacity()); 
			
		}
	}
}