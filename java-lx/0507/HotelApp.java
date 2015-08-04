import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HotelApp{

	private String username = "cohen";
	private String password = "1234abcd";
	private String datePattern = "yyyy-MM-dd";
	private DateFormat df = new SimpleDateFormat(datePattern);

	private Custom[][] rooms = null;	//
	
	public HotelApp(){
		rooms = new Custom[4][5];
	}

	public HotelApp(Custom[][] rooms){
		this.rooms = rooms;
	}

	//初始化房间信息
	@Deprecated
	public void initRooms(){
		/*
		for (int i = 0; i < rooms.length ;i++ ){
			for (int j = 0; j < rooms[i].length ;j++ ){
				rooms[i][j] = "空闲";
			}
		}
		*/
	}

	//Getter
	public Custom[][] getRooms(){
		return rooms;
	}

	//Setter
	public void setRooms(Custom[][] rooms){
		this.rooms = rooms;
	}
	/**
	*
	*
	*/
	public Custom getCustomByIndex(int i, int j){
		Custom c = null;
		try{
			c = rooms[i][j];
		}catch(ArrayIndexOutOfBoundsException ex){
				
		}
		return c;
	}

	//
	public String printRoomInfo(Custom[][] args){
		String info = "";
		for (int i = 0; i < args.length ;i++ ){
			//房间号
			for (int j = 0;j < args[i].length ;j++ ){
				info = info + (i + 1) + ((j + 1) > 9 ? (j + 1) : "0" + (j + 1));//- -
				info += "\t";
			}
			info += "\n";
			//
			for (int j = 0;j < args[i].length ;j++ ){
				info = info + (args[i][j] != null ? args[i][j].getName() : "空闲");
				info += "\t";
			}
			info += "\n";
		}
		return info;
	}
	

	public void mainMenu(){
		//打印酒店菜单
		System.out.println("~~~~~~欢迎光临Cohen大酒店！~~~~~~");
		System.out.println("======请选择您需要的服务=====");
		System.out.println("======1.查 询 房 间 服 务=====");
		System.out.println("======2.入 住 酒 店 服 务=====");
		System.out.println("======3.酒 店 退 房 服 务=====");
		System.out.println("======4.酒 店 结 账 服 务=====");
		System.out.println("======5.上 传 数 据 服 务=====");
		System.out.println("======6.数 据 备 份 服 务=====");
		System.out.println("======7.统 计 数 据 服 务=====");
		System.out.println("======8.详 细 查 询 服 务=====");
		System.out.println("======9.退 出 酒 店 服 务=====");
		System.out.println("======================");
	}
	
	//
	public int getCommand(int range){
		Scanner sc = null;
		int command = 0;
		while(true){
			System.out.print("请您选择(1 - " + range + ")：");
			sc = new Scanner(System.in);
			try{
				command = sc.nextInt();
				if(command > 0 && command <= range){
					break;
				}
			}catch(InputMismatchException e){
				System.out.print("您输入的命令有误，请您输入整数,");
			}
		}
		sc.close();
		return command;
	}
	
	//流程控制
	public void mainFlow(){
		//登录
		while(true){
			//列主菜单
			mainMenu();
			//获取用户输入的命令
			int cmd = getCommand(9);
			switch(cmd){
				case 1:
					select();
					break;
				case 2:
					checkIn();
					break;
				case 3:
					retreatRoom();
					break;
				case 4:
					settleAccounts();
					break;
				case 5:
					uploadData();
					break;
				case 6:
					backup();
					break;
				case 7:
					statisticalData();
					break;
				case 8:
					queryDetail();
					break;
				case 9:
					System.out.println("谢谢使用！");
					System.exit(0);
			}
		}
	}
	public void queryDetail(){
		int roomNumber = validateInputRoomNumber();
		int i = roomNumber / 100 - 1;
		int j = roomNumber % 100 - 1;
		Custom c = rooms[i][j];	//要查询的客户对象
		//打印客户信息	 
	}

	public int validateInputRoomNumber(){
		Scanner sc = null;
		int roomNumber = 0;
		int i = 0;
		int j = 0;
		while (true){
			sc = new Scanner(System.in);
			try{
				
				System.out.print("输入房间号：");
				roomNumber = sc.nextInt();
				i = roomNumber / 100 - 1;
				j = roomNumber % 100 - 1;
				if (i >= rooms.length || j >= rooms[i].length){
					System.out.println("您输入的房间号码范围有误,"); 
					continue;
				}

			}catch (InputMismatchException e){
				System.out.println("您输入的房间号码格式不正确(如：101),"); 
				continue;
			}
			break;
		}
		return roomNumber;	
	}

	//查询服务
	public void select(){    
		String roomInfo = printRoomInfo(rooms);
		System.out.print(roomInfo);
	}	
	//入住服务
	public void checkIn(){
		Custom c = new Custom();
		getDataObject(c);
		int roomNumber = validateInputRoomNumber();
		int i = roomNumber / 100 - 1;
		int j = roomNumber % 100 - 1;
		rooms[i][j] = c;
		System.out.println("入住成功！！！！");
	}
	
	//退房服务
	public void retreatRoom(){
		int roomNumber = validateInputRoomNumber();
		int i = roomNumber / 100 - 1;
		int j = roomNumber % 100 - 1;
		rooms[i][j] = null;
		System.out.println("退房成功");
	}
	//结账服务
	public void settleAccounts(){ 
		System.out.println("结账服务");
	}
	//上传数据
	public void uploadData(){  
		System.out.println("上传数据");
	}
	//数据备份
	public void backup(){  
		System.out.println("数据备份");
	}
	//统计
	public void statisticalData(){
		System.out.println("统计");
	}

	
	/**
	*	调用指定对象的指定的方法，并把参数传递到方法内部
	*   @param owner 指定对象
	*	@param methodName 要调用的方法
	*	@param args	调用方法时传递给方法的实参
	*	@return 方法被调用后的返回值
	*/
	public Object productObject(Object owner, String methodName, Class paramType, Object... args){
		Class clazz = owner.getClass();
		Object arg = args[0];
		Method m = null;
		Object retValue = null;
		try{
			m = clazz.getMethod(methodName,paramType);
			retValue = m.invoke(owner,args);
		}catch(NoSuchMethodException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		catch(InvocationTargetException e){
			e.printStackTrace();
		}
		return retValue;
	}

	public Object getDataObject(Object owner){
		Class clazz = owner.getClass();
		Field[] fields = clazz.getDeclaredFields();
		Scanner sc = new Scanner(System.in);
		for (Field f : fields){
			String methodName = "set" + f.getName().substring(0,1).toUpperCase() + 
				f.getName().substring(1);
			System.out.print("请输入" +f.getName() +"的值：" );
			String value = sc.next();	//用户通过键盘输入的数据
			if (f.getType() == Date.class){
				try{
					productObject(owner,methodName,f.getType(),new Object[]{df.parse(value)});
				}catch(ParseException e){
					e.printStackTrace();
				}
			}else if (f.getType() == int.class){
				productObject(owner,methodName,f.getType(),new Object[]{Integer.parseInt(value)});
			}else if (f.getType() == String.class){
				productObject(owner,methodName,f.getType(),new Object[]{value});
			}
		}
		return owner;
	}
	

	//入口
	public static void main(String[] args){
	    HotelApp ha = new HotelApp(new Custom[4][5]);	//
		//Custom c = new Custom();
		//ha.getDataObject(c);
		ha.mainFlow();
	}

}