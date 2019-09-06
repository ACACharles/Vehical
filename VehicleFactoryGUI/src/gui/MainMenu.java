package gui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtfUserName;
	public String name = "";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rbMinivan;
	private JRadioButton rbSportsCar;
	private JRadioButton rbCustom;
	public int rbCarChoice = 0;


	public String getName() {
		return name;
	}

	public int getRbCarChoice() {
		return rbCarChoice;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}});}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/guiimages/car_128.png")));
		setTitle("Kori's Awesome GUI Game");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWelcome = new JLabel("Welcome to Radical Vehicle Simulator");
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(10, 10, 685, 35);
		contentPane.add(lblWelcome);

		txtfUserName = new JTextField();
		txtfUserName.setToolTipText("You can leave me blank");
		txtfUserName.setHorizontalAlignment(SwingConstants.CENTER);
		JButton btnCreate = new JButton("Create Vehicle");
		btnCreate.setVerticalAlignment(SwingConstants.TOP);
		btnCreate.setIcon(new ImageIcon(MainMenu.class.getResource("/guiimages/car_128.png")));
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str = txtfUserName.getText();
				if (str.equals("")) {
					name = "Tandy";
				}else{name = txtfUserName.getText();} 
				carBuilder();
				//System.out.println("Name: " + name + " Car Choice: " + rbCarChoice);
				//new ActionMenu(name, rbCarChoice);
				//dispose();
			}});
		btnCreate.setForeground(new Color(0, 0, 0));
		btnCreate.setBackground(new Color(0, 255, 127));
		btnCreate.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCreate.setBounds(351, 394, 294, 143);
		contentPane.add(btnCreate);


		JButton btnExit = new JButton("Exit Game");
		btnExit.setIcon(new ImageIcon(MainMenu.class.getResource("/guiimages/cross.png")));
		btnExit.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(new Color(0, 255, 127));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnExit.setBounds(50, 394, 291, 143);
		contentPane.add(btnExit);

		JLabel lblYourName = new JLabel("What is your name road warrior?");
		lblYourName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblYourName.setBounds(50, 81, 291, 49);
		contentPane.add(lblYourName);

		txtfUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfUserName.setBounds(388, 80, 228, 49);
		contentPane.add(txtfUserName);
		txtfUserName.setColumns(10);

		JLabel lblSteed = new JLabel("Choose your mighty steed:");
		lblSteed.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSteed.setBounds(50, 234, 241, 49);
		contentPane.add(lblSteed);

		rbMinivan = new JRadioButton("   Default Minivan");
		rbMinivan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String action = e.getActionCommand();
				if (action.contentEquals("   Default Minivan")){
					rbCarChoice = 0;
				}
			}
		});
		rbMinivan.setSelected(true);
		buttonGroup.add(rbMinivan);
		rbMinivan.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbMinivan.setBounds(388, 154, 228, 49);
		contentPane.add(rbMinivan);

		rbSportsCar = new JRadioButton("   Default Sports Car");
		rbSportsCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String action = e.getActionCommand();
				if (action.contentEquals("   Default Sports Car")){
					rbCarChoice = 1;
				}
			}
		});

		buttonGroup.add(rbSportsCar);
		rbSportsCar.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbSportsCar.setBounds(388, 234, 228, 49);
		contentPane.add(rbSportsCar);

		rbCustom = new JRadioButton("   Custom Vehicle");
		rbCustom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String action = e.getActionCommand();
				if (action.contentEquals("   Custom Vehicle")){
					rbCarChoice = 2;
				}
			}
		});

		buttonGroup.add(rbCustom);
		rbCustom.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbCustom.setBounds(388, 314, 228, 49);
		contentPane.add(rbCustom);
	}

	protected void carBuilder() {
		if (rbCarChoice==0) {
			CarDesign.minivan(name);
		}if (rbCarChoice==1) {
			CarDesign.sportsCar(name);
		}if (rbCarChoice==2) {
			new GUICustom(name);
		}dispose();
	}
}

