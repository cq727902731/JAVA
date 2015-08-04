package graph;

public class Shape {
	
	private String name;
	
	public Shape(){}
	public Shape(String name){
		System.out.println(name);
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
	
}
