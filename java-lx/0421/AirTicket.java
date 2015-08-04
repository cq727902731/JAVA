import java.util.Scanner;

class AirTicket{
	public static void main(String[] args){    
	    int[][]seats = new int[7][4];
		/*for (int a = 0;a < 7;a++ ){
			for(int b = 0; b < 4;b++){
			}
		}*/
		/*seats[0] = new int[]{0,0,0,0};
		seats[1] = new int[]{0,0,0,0};
		seats[2] = new int[]{0,0,0,0};
		seats[3] = new int[]{0,0,0,0};
		seats[4] = new int[]{0,0,0,0};
		seats[5] = new int[]{0,0,0,0};
		seats[6] = new int[]{0,0,0,0};*/
		
		int i = 0,j = 0;
		for (i = 0;i < seats.length ;i++ ){
			for (j = 0 ;j < seats[i].length ;j++ ){
				System.out.print(seats[i][j] + "\t"); 	
			}
			System.out.println(); 
		}
		boolean sign = true;
		while(sign){
			System.out.println("请输入你要查找的座位");
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入排号");
			i = sc.nextInt() - 1;
			System.out.println("请输入列号");
			j = sc.nextInt() - 1;			
		
			if(seats[i][j] == 0){			
				System.out.println("恭喜您买到第"+(i+1)+"排,第"+(j+1)+"列的票");
				seats[i][j] = 1;//更新数组
				//打印出更新后的数组
				for (i = 0;i < seats.length ;i++ ){
					for (j = 0 ;j < seats[i].length ;j++ ){
						System.out.print(seats[i][j] + "\t"); 	
					}
					System.out.println();
				}
				
				System.out.println("是否继续购买");
				System.out.println("1继续购买，0退出，请选择");
				int k = sc.nextInt();
				
				if (k == 1){
					continue;
				}else{
					System.exit(0);
				}

			}else{
				System.out.println("对不起，此座位已经被卖出，请重新选择座位");
				continue;
			}
		}
	}
}

