class Demo{
	public static void main(String[] args){
		Beverage m = new Mocha(10.0);
		Beverage m1 = new Sugar(m,"ÌÇ");
		System.out.println(m1 + "£¬ ¼Û¸ñ£º" + m1.cost()); 
	}
}