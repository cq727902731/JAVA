import java.awt.*;
import java.awt.event.*;
public class ButtonColor implements ActionListener,WindowListener{
public static void main(String args[]){
	Frame f=new Frame("变色");
	f.setLayout(new FlowLayout());
	Panel p=new Panel();
	f.add(p);
	Button b1=new Button("红色");
	Button b2=new Button("蓝色");
	Button b3=new Button("黄色");
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.addWindowListener(new ButtonColor());
	b1.addActionListener(new ButtonColor());
	b2.addActionListener(new ButtonColor());
	b3.addActionListener(new ButtonColor());
	f.setSize(300,300);
	f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
		}
		public void  windowActivated(WindowEvent e) {}
		public void  windowClosed(WindowEvent e) {}
		public void  windowDeactivated(WindowEvent e) {}
		public void  windowDeiconified(WindowEvent e) {}
		public void  windowIconified(WindowEvent e) {}
		public void  windowOpened(WindowEvent e) {}
		public void  windowClosing(WindowEvent e) {System.exit(0);}
}