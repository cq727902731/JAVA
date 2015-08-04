import static java.lang.Math.*;
class Circle{
	
	private double radius;//存放圆的半径
	
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
		System.out.println("半径为" + radius + ",周长为" + getPerimeter() + ",面积为" + getArea());
	}
    public static void main(String[] args){
		Circle c = new Circle(1.2);
		c.show();
	}

}