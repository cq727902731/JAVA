abstract class Shapes{

	abstract void paint();

}
class Square extends Shapes{
	public void paint(){
	System.out.println("矩形");
	}
}
class Triangle extends Shapes{
	public void paint(){
	System.out.println("三角形");
	}
}
class Circle extends Shapes{
	public void paint(){
	System.out.println("圆形");
	}
}
class Oval extends Shapes{
	public void paint(){
	System.out.println("椭圆形");
	}
}
class Demo{
	public static void main(String[] args){    
	    Shapes s = new Square();
		Shapes t = new Triangle();
		Shapes c = new Circle();
		Shapes o = new Oval();

		s.paint();
		t.paint();
		c.paint();
		o.paint();
	}
}

	

	


