import static javax.swing.JOptionPane.*;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;


class Test extends JFrame{
	

	public Test(){
		JButton btn = new JButton("click me");
		btn.addActionListener(new MyListener(this));
		add(btn);
		setSize(200,200);
		setLocation(400,400);
		setVisible(true);
	}

	public static void main(String[] args){
		Test t = new Test();    
	}

}

class MyListener implements ActionListener{
	Frame f;
	public MyListener(Frame f){
		this.f = f;
	}

	public void actionPerformed(ActionEvent e){
		//Icon icon = new ImageIcon("note.png");

		int a = Integer.parseInt(showInputDialog("请输入第一个数:"));
		int b = Integer.parseInt(showInputDialog("请输入第二个数:"));
		int sum = a + b;
		showMessageDialog(null,sum); 
		
		
	}
}
