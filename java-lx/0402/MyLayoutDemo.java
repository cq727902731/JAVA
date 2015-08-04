import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

class MyLayoutDemo extends JFrame{

	public MyLayoutDemo(){

		setSize(500,600);
		setLocation(400,200);
		add(new Button("North"), BorderLayout.NORTH);
		add(new Button("South"), BorderLayout.SOUTH);
		add(new Button("East"), BorderLayout.EAST);
		add(new Button("West"), BorderLayout.WEST);
		add(new Button("Center"), BorderLayout.CENTER);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args){
		new MyLayoutDemo();
	
	}
}
	    

		