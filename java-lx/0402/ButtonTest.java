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
		System.out.println("��:" + d.getWidth()); 
		System.out.println("��:" + d.getHeight());

		int m = (int)(d.getWidth() - width)/2;
		int n = (int)(d.getHeight() - height)/2;

		setBounds(m,n,width,height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btn = new JButton("�����������������");
		add(btn);
		MyListener m1 = new MyListener();//��������������
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
		Object o = e.getSource();  //��ȡ�¼�Դ����,��̬����
		JButton j = (JButton)o; //����ת��
		j.setBackground(ButtonTest.genericRandomColor(5));
	}


}
		



