class Car{

	int count;
	String color;
	int weight;
	int speed;



	public Car(int count,String color,int weight,int speed){
		this.count = count;
		this.color = color;
		this.weight = weight;
		this.speed = speed; 
	}
	public void speedUp(){
		System.out.println("轮子数量为：" + count + "个,颜色为：" + color +
			",重量为:" + weight + "kg的车当前速度为：" + speed +"\t");
		speed++;
		System.out.println("轮子数量为：" + count + "个,颜色为：" + color +
			",重量为:" + weight + "kg的车加速之后速度为：" + speed +"\t");	
	}

	public void speedDown(){
		speed--;
		System.out.println("轮子数量为：" + count + "个,颜色为：" + color +
			",重量为:" + weight + "kg的车当前速度为：" + speed + "\t");

		System.out.println();
		if (speed == 0){
			System.out.println("轮子数量为：" + count + "个,颜色为：" + color +
			",重量为:" + weight + "kg的车停车了" + "\t");	
		}else{
			System.out.println("轮子数量为：" + count + "个,颜色为：" + color +
			",重量为:" + weight + "kg的车减速之后速度为：" + speed +"\t");
		}
		
	}
	
	public static void main(String[] args){
	    Car c = new Car(4,"黑色",1000,5);
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
	}
}