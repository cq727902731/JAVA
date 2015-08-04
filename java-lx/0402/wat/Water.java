package wat;
abstract class Water{
	public abstract void water();
}
class Demo{
	public static void main(String[] args){
	    Water1 w1 = new Water1(); 
		w1.water();
		w1.Filtration();
		w1.Buffers();
		Water2 w2 = new Water2(); 
		w2.water();
		w2.Buffers();
	}
}