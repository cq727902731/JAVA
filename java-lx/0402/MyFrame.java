import java.awt.Frame;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;


class MyFrame extends Frame{

	public MyFrame(){
		setSize(500,500);
		setLocation(300,300);
		setVisible(true);
		Dimension d = new Dimension(160,40);
		Button b = new Button("µã»÷ÍË³ö");
		Font f = new Font("SansSerif",2,48);
		b.setFont(f);
		b.addActionListener(new MyFirstListener());
		add(b);
		b.setSize(d);
		pack();
	}
	public static void main(String[] args){    
	    new MyFrame();
	}
}

class MyFirstListener implements ActionListener{

	public void actionPerformed(ActionEvent e){
		System.out.println("ÍË³ö");
		System.exit(0);
	}
		
}