package graph;

public class DrawApp {
	
	public static void main(String[] args) {
		Draw d = new Draw();
		Circle circle = new Circle("Բ��");
		Square square = new Square("������");
		d.draw(square);
		d.draw(circle);
	}
}
