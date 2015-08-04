class Base{

	private int i = 0;

	private void setI(int i){
		this.i = i;
	}

	public int getI(){
		return i;
	}
}
class Sub extends Base{
	public Sub(int i){
		setI(i);
		System.out.println("i = " + getI());
	}
	public static void main(String[] args){    
	    new Sub(122);
	}

		    
		
}