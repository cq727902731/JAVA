class Auto{

	private int tirenum;//��̥����
	private String color;//������ɫ
	private float weight;//��������

	public Auto(int tirenum,String color,float weight){
		this.tirenum = tirenum;
		this.color = color;
		this.weight = weight;
		
	}
	public void addspeed(){
		System.out.println("Auto ����:");
	}
	public void subspeed(){
		System.out.println("Auto ����:");
	}
	public void stop(){
		System.out.println("Auto ͣ��:");
	}
}
	


class Car extends Auto{
	//���
    public void CD(){
		System.out.println("Car CD");
	}
	public void AC(){
		System.out.println("Car AC");
	}
	
    @Override
		public void addSpeed(){
			System.out.println("Car ����");
	}
	@Override
		public void subSpeed(){
			System.out.println("Car ����");
	}
	

}




