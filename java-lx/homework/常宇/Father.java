class Father{
	int a;
	public Father(int a){
		this.a = a;
	}
}
class Son extends Father {
	public Son(int a){
		super(a);//Ã»¶®
		System.out.println("a=" + a);
	}
	

}
class Test{
public static void main(String[] args){
		Son s = new Son(18);
		
	}
}