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

	//��ʼ��������Ϣ
	@Deprecated
	public void initRooms(){
		/*
		for (int i = 0; i < rooms.length ;i++ ){
			for (int j = 0; j < rooms[i].length ;j++ ){
				rooms[i][j] = "����";
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
			//�����
			for (int j = 0;j < args[i].length ;j++ ){
				info = info + (i + 1) + ((j + 1) > 9 ? (j + 1) : "0" + (j + 1));//- -
				info += "\t";
			}
			info += "\n";
			//
			for (int j = 0;j < args[i].length ;j++ ){
				info = info + (args[i][j] != null ? args[i][j].getName() : "����");
				info += "\t";
			}
			info += "\n";
		}
		return info;
	}
	

	public void mainMenu(){
		//��ӡ�Ƶ�˵�
		System.out.println("~~~~~~��ӭ����Cohen��Ƶ꣡~~~~~~");
		System.out.println("======��ѡ������Ҫ�ķ���=====");
		System.out.println("======1.�� ѯ �� �� �� ��=====");
		System.out.println("======2.�� ס �� �� �� ��=====");
		System.out.println("======3.�� �� �� �� �� ��=====");
		System.out.println("======4.�� �� �� �� �� ��=====");
		System.out.println("======5.�� �� �� �� �� ��=====");
		System.out.println("======6.�� �� �� �� �� ��=====");
		System.out.println("======7.ͳ �� �� �� �� ��=====");
		System.out.println("======8.�� ϸ �� ѯ �� ��=====");
		System.out.println("======9.�� �� �� �� �� ��=====");
		System.out.println("======================");
	}
	
	//
	public int getCommand(int range){
		Scanner sc = null;
		int command = 0;
		while(true){
			System.out.print("����ѡ��(1 - " + range + ")��");
			sc = new Scanner(System.in);
			try{
				command = sc.nextInt();
				if(command > 0 && command <= range){
					break;
				}
			}catch(InputMismatchException e){
				System.out.print("���������������������������,");
			}
		}
		sc.close();
		return command;
	}
	
	//���̿���
	public void mainFlow(){
		//��¼
		while(true){
			//�����˵�
			mainMenu();
			//��ȡ�û����������
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
					System.out.println("ллʹ�ã�");
					System.exit(0);
			}
		}
	}
	public void queryDetail(){
		int roomNumber = validateInputRoomNumber();
		int i = roomNumber / 100 - 1;
		int j = roomNumber % 100 - 1;
		Custom c = rooms[i][j];	//Ҫ��ѯ�Ŀͻ�����
		//��ӡ�ͻ���Ϣ	 
	}

	public int validateInputRoomNumber(){
		Scanner sc = null;
		int roomNumber = 0;
		int i = 0;
		int j = 0;
		while (true){
			sc = new Scanner(System.in);
			try{
				
				System.out.print("���뷿��ţ�");
				roomNumber = sc.nextInt();
				i = roomNumber / 100 - 1;
				j = roomNumber % 100 - 1;
				if (i >= rooms.length || j >= rooms[i].length){
					System.out.println("������ķ�����뷶Χ����,"); 
					continue;
				}

			}catch (InputMismatchException e){
				System.out.println("������ķ�������ʽ����ȷ(�磺101),"); 
				continue;
			}
			break;
		}
		return roomNumber;	
	}

	//��ѯ����
	public void select(){    
		String roomInfo = printRoomInfo(rooms);
		System.out.print(roomInfo);
	}	
	//��ס����
	public void checkIn(){
		Custom c = new Custom();
		getDataObject(c);
		int roomNumber = validateInputRoomNumber();
		int i = roomNumber / 100 - 1;
		int j = roomNumber % 100 - 1;
		rooms[i][j] = c;
		System.out.println("��ס�ɹ���������");
	}
	
	//�˷�����
	public void retreatRoom(){
		int roomNumber = validateInputRoomNumber();
		int i = roomNumber / 100 - 1;
		int j = roomNumber % 100 - 1;
		rooms[i][j] = null;
		System.out.println("�˷��ɹ�");
	}
	//���˷���
	public void settleAccounts(){ 
		System.out.println("���˷���");
	}
	//�ϴ�����
	public void uploadData(){  
		System.out.println("�ϴ�����");
	}
	//���ݱ���
	public void backup(){  
		System.out.println("���ݱ���");
	}
	//ͳ��
	public void statisticalData(){
		System.out.println("ͳ��");
	}

	
	/**
	*	����ָ�������ָ���ķ��������Ѳ������ݵ������ڲ�
	*   @param owner ָ������
	*	@param methodName Ҫ���õķ���
	*	@param args	���÷���ʱ���ݸ�������ʵ��
	*	@return ���������ú�ķ���ֵ
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
			System.out.print("������" +f.getName() +"��ֵ��" );
			String value = sc.next();	//�û�ͨ���������������
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
	

	//���
	public static void main(String[] args){
	    HotelApp ha = new HotelApp(new Custom[4][5]);	//
		//Custom c = new Custom();
		//ha.getDataObject(c);
		ha.mainFlow();
	}

}