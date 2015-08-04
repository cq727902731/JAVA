class Mouse{

	public Mouse(String name){
		this.name = name;
	}
	
	
	
}	
class MouseDemo{

	public static void main(String[] args){

	int a = 1;
	int b = a;

	a = 10;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	
	Mouse m1 = new Mouse("Tom");
	Mouse m2 = m1;

	m1.name = "Tim";
	System.out.println("m1.name = " + m1.name);
	System.out.println("m2.name = " + m2.name);
	}
}




