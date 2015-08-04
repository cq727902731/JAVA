class StaticDemo{
	static int i = 10;
	int j = 5;

}
class Test{
	public static void main(String[] args){
	    StaticDemo sd = new StaticDemo();
		//sd.i;
		//sd.j;
		System.out.println(sd.i);
		System.out.println(sd.j);
	}
	

}