

public class Battery{
	private String brand;//Ʒ��
	private int capacity;//����
	private String material;//����

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
			System.out.println(brand + "�Ĳ�����:" + material + ",����Ϊ" + capacity + "�ڹ���"); 

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
			System.out.println(getBrand() + "�ĵ�أ�������" + getMaterial() + "����Ϊ" + getCapacity()); 
			
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
			System.out.println(getBrand() + "�ĵ�أ�������" + getMaterial() + "����Ϊ" + getCapacity()); 
			
		}
	}
}