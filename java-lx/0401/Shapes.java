abstract class Shapes{

	abstract void paint();

}
class Square extends Shapes{
	public void paint(){
	System.out.println("����");
	}
}
class Triangle extends Shapes{
	public void paint(){
	System.out.println("������");
	}
}
class Circle extends Shapes{
	public void paint(){
	System.out.println("Բ��");
	}
}
class Oval extends Shapes{
	public void paint(){
	System.out.println("��Բ��");
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

	

	

