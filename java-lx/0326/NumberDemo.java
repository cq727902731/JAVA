class NumberDemo{
	private int n1;
	private int n2;

	public NumberDemo(int n1,int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public int add(int n1,int n2){
		System.out.println("n1 + n2" + "=" + (n1 + n2));
		return n1 + n2;
		
	}
	public int sub(int n1,int n2){
		System.out.println("n1 - n2" + "=" + (n1 - n2));
		return n1 - n2;
		
	}
	public int mut(int n1,int n2){
		System.out.println("n1 * n2" + "=" + (n1 * n2));
		return n1 * n2;
		
	}
	public int div(int n1,int n2){
		System.out.println("n1 / n2" + "=" + (n1 / n2));
		return n1 / n2;
		
	}
}
	
class MyNumberDemo{
	public static void main(String[] args){
		NumberDemo md = new NumberDemo(7,9);
		md.add(100,101);
		md.sub(22,232);
		md.mut(232,232);
		md.div(232,232);
	}



}

