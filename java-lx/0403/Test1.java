import static javax.swing.JOptionPane.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.lang.Integer;


class Test1 extends Frame{
	JButton btn;
	public Test1(){
		btn = new JButton("click me");
		btn.addActionListener(new MyListener(this));
		add(btn);
		setSize(200,200);
		setLocation(400,400);
		setVisible(true);
	}

	public static void main(String[] args){
		Test1 t = new Test1();
		
		
	    
	}
}
class MyListener implements ActionListener{
	Frame f;

	public MyListener(Frame f){
		this.f = f;
	}
	public void actionPerformed(ActionEvent e){
		int a =  Integer.parseInt(showInputDialog(f,"请输入第一个数"));
		int b =  Integer.parseInt(showInputDialog(f,"请输入第二个数"));
		int sum = a + b;
		Test1 t1 = (Test1)f;
		((Test1)f).btn.setText(String.valueOf(sum));
		System.out.println("sum =" + sum);
	}
}
