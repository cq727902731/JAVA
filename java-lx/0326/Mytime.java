class MyTime{
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void display(){
		System.out.println("hour" + ":" + "minute" + ":" + "second");
	}

	public void addHour(int hour){
		this.hour = this.hour + hour;
		System.out.println(this.hour);
	}

	public void addMinute(int minute){
		this.minute = this.minute + minute;
		System.out.println(this.minute);
	}

	public void addSecond(int second){
		this.second = this.second + second;
		System.out.println(this.second);
	}

	public void subHour(int hour){
		this.hour = this.hour - hour;
		System.out.println(this.hour);
	}

	public void subMinute(int minute){
		this.minute = this.minute - minute;
		System.out.println(this.minute);
	}

	public void subSecond(int second){
		this.second = this.second - second;
		System.out.println(this.second);
	}
}

class MyTimeDemo{
	
	public static void main(String[] args){
		MyTime mt = new MyTime(11,14,32);
	    mt.display();
		mt.addHour(1);
		mt.addMinute(10);
		mt.addSecond(20);
		
		mt.subHour(2);
		mt.subMinute(15);
		mt.subSecond(30);
	}	
}