package graph;

public class DrawApp {
	
	public static void main(String[] args) {
		Draw d = new Draw();
		Circle circle = new Circle("圆形");
		Square square = new Square("正方形");
		d.draw(square);
		d.draw(circle);
	}
}
