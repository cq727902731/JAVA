class Auto{

	private int tirenum;//轮胎个数
	private String color;//汽车颜色
	private float weight;//车身重量

	public Auto(int tirenum,String color,float weight){
		this.tirenum = tirenum;
		this.color = color;
		this.weight = weight;
		
	}
	public void addspeed(){
		System.out.println("Auto 加速:");
	}
	public void subspeed(){
		System.out.println("Auto 减速:");
	}
	public void stop(){
		System.out.println("Auto 停车:");
	}
}
	


class Car extends Auto{
	//添加
    public void CD(){
		System.out.println("Car CD");
	}
	public void AC(){
		System.out.println("Car AC");
	}
	
    @Override
		public void addSpeed(){
			System.out.println("Car 加速");
	}
	@Override
		public void subSpeed(){
			System.out.println("Car 减速");
	}
	

}




