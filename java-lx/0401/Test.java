

public class Test{

	public static void main(String[] args){
		Telephone iphone6 = new Telephone();
	    Battery b = new Byd("比亚迪",10000,"锂电子");
		
		iphone6.setBattery(b);

		iphone6.call();
		iphone6.sendMsg("你是SB");

	}
}



		
		
