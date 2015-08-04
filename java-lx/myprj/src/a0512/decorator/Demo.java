package a0512.decorator;

public class Demo {
	
	public static void main(String[] args) {
		Cappuccino cb = new Cappuccino();
		Milk n1 = new Milk(cb);
		Milk n2 = new Milk(n1);
		Sugar s1 = new Sugar(n1);
		System.out.println(s1.getDescription());
		System.out.println(s1.cost());
	}
}
