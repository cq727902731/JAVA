import com.wyhello.util.FrameToolkit;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.KeyStroke;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.JOptionPane.*;
import java.awt.event.KeyAdapter;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileInputStream;
import java.awt.Frame;




/**
* 朕的第一个应用程序
*/
class NotePad extends JFrame{

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	private JTextArea content = null;
	private JScrollPane contentJSP = null;
	private boolean isChange = false;  //正文是否被修改的状态
	private JPopupMenu rightMouseMenu = null;

	/**
	* 初始化组件
	*
	*/
	public void initComponent(){

		rightMouseMenu = new JPopupMenu();
		/*rightMouseMenu.add("撤销(U)").addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("撤销");
			}
		});*/
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("剪切(T)");
		rightMouseMenu.add("复制(C)");
		rightMouseMenu.add("粘贴(P)");
		rightMouseMenu.add("删除(D)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("全选(A)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("从左到右的阅读顺序(R)");
		rightMouseMenu.add("显示Unicode控制字符(S)");
		rightMouseMenu.add("显示Unicode控制字符(I)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("打开IME(O)");
		rightMouseMenu.add("汉字重选(R)");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				if (isChange){
					int command = showConfirmDialog(NotePad.this,
						"内容已更改，需要保存么?","记事本",YES_NO_CANCEL_OPTION,QUESTION_MESSAGE);
					if (command == YES_OPTION){
						//保存内容
					}else if(command == NO_OPTION){
						System.exit(0);
					}
				}else{
					System.exit(0);
				}
			}
		});
		Point p = FrameToolkit.getFrameInScreenCenterPoint(WIDTH,HEIGHT);
		setSize(WIDTH,HEIGHT);
		setLocation(p);
		setTitle("记事本");
		ImageIcon ii = new ImageIcon("note.png");
		setIconImage(ii.getImage());  //Image image
		content = new JTextArea();
		content.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
					if (e.getButton() == MouseEvent.BUTTON3){
					rightMouseMenu.show(content, e.getX(), e.getY());
					}
				}   
			});
		content.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				isChange = true;
			}
		});		
		contentJSP = new JScrollPane(content);
		add(contentJSP);
		drawMenu();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void drawMenu(){
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setBackground(new Color(237,242,242));
		JMenu fileMenu = new JMenu("文件(F)");
		fileMenu.setMnemonic((int)'F');
		JMenuItem newMenuItem = new JMenuItem("新建(N)");
		JMenuItem openMenuItem = new JMenuItem("打开(O)");
		JMenuItem saveMenuItem = new JMenuItem("保存(S)");
		JMenuItem saveAsMenuItem = new JMenuItem("另存为(A)");
		JMenuItem pageSettingMenuItem = new JMenuItem("页面设置(U)");
		JMenuItem printMenuItem = new JMenuItem("打印(P)");
		JMenuItem exitMenuItem = new JMenuItem("退出(X)");
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		/*openMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FileDialog fd = new FileDialog(NotePad.this,"打开",FileDialog.LOAD);
				fd.setVisible(true);
			}
		});*/
		fileMenu.add(saveMenuItem);
		/*saveMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FileDialog fd = new FileDialog(NotePad.this,"保存",FileDialog.SAVE);
				fd.setVisible(true);
			}
		});*/
		fileMenu.add(saveAsMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(pageSettingMenuItem);
		fileMenu.add(printMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);		
		//添加菜单快捷键
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		printMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		//注册文件菜单监视器
		NotePadMenuListener listener = new NotePadMenuListener(this);
		newMenuItem.addActionListener(listener);	//注册新建监听器
		openMenuItem.addActionListener(listener);	//注册打开监听器
		saveMenuItem.addActionListener(listener);	//注册保存监听器
		printMenuItem.addActionListener(listener);	//注册打印监听器
		//编辑菜单
		JMenu editMenu = new JMenu("编辑(E)");
		editMenu.setMnemonic((int)'E');
		JMenuItem undoMenuItem = new JMenuItem("撤销(U)");
		JMenuItem cutMenuItem = new JMenuItem("剪切(T)");
		JMenuItem copyMenuItem = new JMenuItem("复制(C)");
		JMenuItem pasteMenuItem = new JMenuItem("粘贴(P)");
		JMenuItem clearMenuItem = new JMenuItem("删除(L)");
		JMenuItem findMenuItem = new JMenuItem("查找(F)...");
		JMenuItem findNextMenuItem = new JMenuItem("查找下一个(N)");
		JMenuItem replaceMenuItem = new JMenuItem("替换(R)...");
		JMenuItem gotoMenuItem = new JMenuItem("转到(G)...");
		JMenuItem selectAllMenuItem = new JMenuItem("全选(A)");
		JMenuItem timeMenuItem = new JMenuItem("时间/日期(D)");
		editMenu.add(undoMenuItem);
		editMenu.addSeparator();
		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);
		editMenu.add(clearMenuItem);
		editMenu.addSeparator();
		editMenu.add(findMenuItem);
		editMenu.add(findNextMenuItem);
		editMenu.add(replaceMenuItem);
		editMenu.add(gotoMenuItem);
		editMenu.addSeparator();
		editMenu.add(selectAllMenuItem);
		editMenu.add(timeMenuItem);
		//添加菜单快捷键
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		clearMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		findMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		findNextMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
		replaceMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		gotoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		timeMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
		//注册文件菜单监视器
		undoMenuItem.addActionListener(listener);		//注册撤销监听器
		cutMenuItem.addActionListener(listener);		//注册剪切监听器
		copyMenuItem.addActionListener(listener);		//注册复制监听器
		pasteMenuItem.addActionListener(listener);		//注册粘贴监听器
		clearMenuItem.addActionListener(listener);		//注册删除监听器
		findMenuItem.addActionListener(listener);		//注册查找监听器
		findNextMenuItem.addActionListener(listener);	//注册查找下一个监听器
		replaceMenuItem.addActionListener(listener);	//注册替换监听器
		gotoMenuItem.addActionListener(listener);		//注册转到监听器
		selectAllMenuItem.addActionListener(listener);	//注册全选监听器
		timeMenuItem.addActionListener(listener);		//注册时间监听器
		//格式菜单
		JMenu fmtMenu = new JMenu("格式(O)");
		fmtMenu.setMnemonic((int)'O');
		JMenuItem enterMenuItem = new JMenuItem("自动换行(W)");
		JMenuItem fontMenuItem = new JMenuItem("字体(F)...");
		fmtMenu.add(enterMenuItem);
		fmtMenu.add(fontMenuItem);

		JMenu viewMenu = new JMenu("查看(V)");
		viewMenu.setMnemonic((int)'V');
		JMenuItem stateMenuItem = new JMenuItem("状态栏(S)");
		viewMenu.add(stateMenuItem);

		JMenu helpMenu = new JMenu("帮助(H)");
		helpMenu.setMnemonic((int)'H');
		JMenuItem lookMenuItem = new JMenuItem("查看帮助(H)");
		JMenuItem aboutMenuItem = new JMenuItem("关于记事本(A)");
		helpMenu.add(lookMenuItem);
		helpMenu.add(aboutMenuItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(fmtMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);
		setJMenuBar(menuBar); 
	}
	public NotePad(){
		initComponent();
	}
	public static void main(String[] args){    
	    new NotePad();
	}
	class NotePadMenuListener implements ActionListener{
		private Frame parent;

		public NotePadMenuListener(){}
		public NotePadMenuListener(Frame parent){
			this.parent = parent;
		}

		public void actionPerformed(ActionEvent e){
			Object source = e.getSource();
			if (source instanceof JMenuItem){
				JMenuItem item = (JMenuItem)source;
				String menuName = item.getText();
					switch (menuName){
						case "新建(N)":
							break;
						case "打开(O)":
							FileDialog fd = new FileDialog(parent,"打开",FileDialog.LOAD);
							fd.setVisible(true);
							System.out.println(fd.getDirectory());
							System.out.println(fd.getFile());
							InputStream is = 
							file = new File(br.readLine());
							InputStream is = new FileInputStream(file);
							OutputStream os = new FileOutputStream();
							break;
						case "保存(S)":
							break;
						case "打印(P)":
							break;
						case "撤销(U)":
							break;
						case "剪切(T)":
							break;
						case "复制(C)":
							break;
						case "删除(L)":
							break;
						case "查找下一个(N)":
							break;
						case "时间/日期(D)":
							break;
						case "粘贴(V)":
							break;
						case "查找(F)":
							break;
						case "替换(R)":
							break;
						case "转到(G)":
							break;
						case "全选(A)":
							break;
						default:
							break;
					}
				System.out.println(menuName);
	
			}
		}			
	}
}