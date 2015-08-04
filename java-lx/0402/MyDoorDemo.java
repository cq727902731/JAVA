
class MyDoorDemo{
	public static void main(String[] args){
		TheftproofDoor t = new TheftproofDoor();
		t.opendoor();
		t.closedoor();
		t.theftproof();
		System.out.println("_________"); 
		WaterproofDoor w = new WaterproofDoor();
		w.opendoor();
		w.closedoor();
		w.waterproof();
		System.out.println("_________");
		BulletproofDoor b= new BulletproofDoor();
		b.opendoor();
		b.closedoor();
		b.bulletproof();
	}
}


	
	