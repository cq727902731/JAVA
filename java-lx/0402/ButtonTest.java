import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class ButtonTest extends JFrame{

	JButton btn = null;
	public ButtonTest(){}

	public ButtonTest(int width,int height){

		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		System.out.println("宽:" + d.getWidth()); 
		System.out.println("高:" + d.getHeight());

		int m = (int)(d.getWidth() - width)/2;
		int n = (int)(d.getHeight() - height)/2;

		setBounds(m,n,width,height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btn = new JButton("屠龙宝刀，点击就送");
		add(btn);
		MyListener m1 = new MyListener();//创建监听器对象
		btn.addActionListener(m1);
		setVisible(true);
	}
	public static Color genericRandomColor(int number){
		int r = (int)(Math.random() * number);//[0,number)
		switch (r){
		case 0:
			return Color.GRAY;
		case 1:
			return Color.PINK;
		case 2:
			return Color.YELLOW;
		case 3:
			return Color.RED;
		default:
			return Color.CYAN;
		
		}
	}

	

		public static void main(String[] args){    
		    new ButtonTest(400,400);
	}
		

}
class MyListener implements ActionListener{

	public void actionPerformed(ActionEvent e){
		Object o = e.getSource();  //获取事件源对象,多态引用
		JButton j = (JButton)o; //向下转型
		j.setBackground(ButtonTest.genericRandomColor(5));
	}


}
		



