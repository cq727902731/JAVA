

class LG implements DVD{
	public void play(){
		System.out.println("lg在播放");
	}
	public void burn(){
		System.out.println("lg在刻录");
	}
}
class Samsung implements DVD{
	public void play(){
		System.out.println("Samsung在播放");
	}
	public void burn(){
		System.out.println("Samsung在刻录");
	}
}