class StaticDemo{

	int i = 10;
	static int j = 5;

	public void sample(){
		int i = 1;
		System.out.println("i = " + i);
	}
	public static void sample1(){
		int i = 2;
		System.out.println("i = " + i);
	}
}
class MainStatic{

	public static void main(String[] args){
		System.out.println("static j = " + StaticDemo.j);
		StaticDemo sd = new StaticDemo();
		StaticDemo sd1 = new StaticDemo();
		sd.i = 68;
		sd1.i = 72;
		//System.out.println("instance i = " + sd.i);
		System.out.println("instance i = " + sd.i);
		sd.j = sd.j - 10;
		//System.out.println("static j = " + sd.j);
		System.out.println("static j = " + sd1.j);
		sd1.j = sd1.j - 10;
		}

}