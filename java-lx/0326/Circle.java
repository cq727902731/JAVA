import static java.lang.Math.*;
class Circle{
	
	private double radius;//���Բ�İ뾶
	
	public Circle(){
		radius = 0;
	}
	public Circle(double r){
		radius = r;
	}
	public double getArea(){
		return PI * radius * radius ;
	}
	public double getPerimeter(){
		return 2 * radius * PI;
	}
	void show(){
		System.out.println("�뾶Ϊ" + radius + ",�ܳ�Ϊ" + getPerimeter() + ",���Ϊ" + getArea());
	}
    public static void main(String[] args){
		Circle c = new Circle(1.2);
		c.show();
	}

}