class Computer{


	public void dvdPlay(DVD dvd){
		dvd.play();
	}
	public void dvdBurn(DVD dvd){
		dvd.burn();
	}

	public static void main(String[] args){    
	    Computer c = new Computer();
		DVD d = new LG();
		c.dvdPlay(d);
		c.dvdBurn(d);
		System.out.println("___________"); 
		d = new Samsung();
		c.dvdPlay(d);
		c.dvdBurn(d);
	}
}
		
