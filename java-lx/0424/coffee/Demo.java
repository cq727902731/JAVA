class Demo{
	public static void main(String[] args){
		Beverage m = new Mocha(10.0);
		Beverage m1 = new Sugar(m,"��");
		System.out.println(m1 + "�� �۸�" + m1.cost()); 
	}
}