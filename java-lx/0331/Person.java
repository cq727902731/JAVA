class Person{

	private int i;

	public Person(){}
	
	public Person(int i){
		this.i = i;
	}
	public static void main(String[] args){    
	    /*String s = new Person(6756).toString();
		System.out.println(s);*/
		Person p1 = new Person(101);
		Person p2 = new Person(100);
		System.out.println(p1);
		System.out.println(p2);
		boolean b = p1.equals(p2);
		System.out.println(b); 	
	}
	/*@Override
	public String toString(){
		return super.toString() + "$i = " + i;
	}*/
	@Override 
		public boolean equals(Object obj){
			if (this == obj){
				return true;
			}
			if (obj instanceof Person){
				Person o = (Person)obj;
				if(o.i == this.i){
					return true;
				}
			}
			return false;
	}

}

		
		
