package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUICustom extends JFrame {

	private JPanel contentPane;
	private int cbPass;
	private int cbTankCa;
	private int cbMPGS;
	private double cbTonage;
	private int cbDoor;
	private int cbOdo;
	private int cbSize;
	private int cbColorChoice;

	/**
	 * Create the frame.
	 */
	public GUICustom(String name) {

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHello = new JLabel("Hello " + name + ". Lets Build Your Gnarly Vehicle!");
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		lblHello.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblHello.setBounds(-12, 12, 723, 66);
		contentPane.add(lblHello);

		JLabel lblPassengers = new JLabel("Passengers:");
		lblPassengers.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassengers.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassengers.setBounds(33, 96, 187, 47);
		contentPane.add(lblPassengers);

		JLabel lblTankCap = new JLabel("Fuel Tank Capacity:");
		lblTankCap.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTankCap.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTankCap.setBounds(33, 153, 187, 47);
		contentPane.add(lblTankCap);

		JLabel lblMPG = new JLabel("Miles Per Gallon:");
		lblMPG.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMPG.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMPG.setBounds(33, 210, 187, 47);
		contentPane.add(lblMPG);

		JLabel lblDoors = new JLabel("Doors:");
		lblDoors.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoors.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDoors.setBounds(423, 92, 107, 47);
		contentPane.add(lblDoors);

		JLabel lblTons = new JLabel("Weight in Tons:");
		lblTons.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTons.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTons.setBounds(33, 278, 187, 47);
		contentPane.add(lblTons);

		JLabel lblOdometer = new JLabel("Odometer Miles:");
		lblOdometer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOdometer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOdometer.setBounds(365, 151, 178, 47);
		contentPane.add(lblOdometer);

		JLabel lblWheelSize = new JLabel("Wheel Size:");
		lblWheelSize.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWheelSize.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWheelSize.setBounds(401, 210, 129, 47);
		contentPane.add(lblWheelSize);

		JLabel lblColor = new JLabel("Color:");
		lblColor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColor.setBounds(416, 278, 114, 47);
		contentPane.add(lblColor);

		String[] pass = {"1", "2", "3", "4", "5", "6", "7", "8"}; 
		JComboBox cbPassengers = new JComboBox(pass);
		cbPassengers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose item from combo box
				String s = (String) cbPassengers.getSelectedItem();
				switch (s) {
				case "1":
					cbPass = 1;
					break;
				case "2":
					cbPass = 2;
					break;
				case "3":
					cbPass = 3;
					break;
				case "4":
					cbPass = 4;
					break;
				case "5":
					cbPass = 5;
					break;
				case "6":
					cbPass = 6;
					break;
				case "7":
					cbPass = 7;
					break;
				default:
					cbPass = 8;
					break;
				}
			}});
		cbPassengers.setBounds(249, 103, 85, 31);
		contentPane.add(cbPassengers);
		cbPassengers.setSelectedIndex(0);


		String[] tank = {"10", "12", "14", "16", "18", "20", "22"}; 
		JComboBox cbTankCap = new JComboBox(tank);
		cbTankCap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose item from combo box
				String s = (String) cbTankCap.getSelectedItem();
				switch (s) {
				case "10":
					cbTankCa = 10;
					break;
				case "12":
					cbTankCa = 12;
					break;
				case "14":
					cbTankCa = 14;
					break;
				case "16":
					cbTankCa = 16;
					break;
				case "18":
					cbTankCa = 18;
					break;
				case "20":
					cbTankCa = 20;
					break;
				default:
					cbTankCa = 22;
					break;
				}
			}});
		cbTankCap.setBounds(249, 162, 85, 31);
		contentPane.add(cbTankCap);
		cbTankCap.setSelectedIndex(0);


		String[] mpg = {"8", "12", "16", "18", "20", "25", "30", "50"}; 
		JComboBox cbMPG = new JComboBox(mpg);
		cbMPG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose item from combo box
				String s = (String) cbMPG.getSelectedItem();
				switch (s) {
				case "8":
					cbMPGS = 8;
					break;
				case "12":
					cbMPGS = 12;
					break;
				case "16":
					cbMPGS = 16;
					break;
				case "18":
					cbMPGS = 18;
					break;
				case "20":
					cbMPGS = 20;
					break;
				case "25":
					cbMPGS = 25;
					break;
				case "30":
					cbMPGS = 30;
					break;
				default:
					cbMPGS = 50;
					break;
				}
			}});
		cbMPG.setBounds(249, 221, 85, 31);
		contentPane.add(cbMPG);
		cbMPG.setSelectedIndex(0);


		String[] tons = {".5", "1", "1.5", "2", "2.5", "3"}; 
		JComboBox cbTons = new JComboBox(tons);
		cbTons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose item from combo box
				String s = (String) cbTons.getSelectedItem();
				switch (s) {
				case ".5":
					cbTonage = .5;
					break;
				case "1":
					cbTonage = 1;
					break;
				case "1.5":
					cbTonage = 1.5;
					break;
				case "2":
					cbTonage = 2;
					break;
				case "2.5":
					cbTonage = 2.5;
					break;
				default:
					cbTonage = 3;
					break;
				}
			}});
		cbTons.setBounds(249, 289, 85, 31);
		contentPane.add(cbTons);
		cbTons.setSelectedIndex(0);
	

		String[] doors = {"2", "3", "4", "5", "13"}; 
		JComboBox cbDoors = new JComboBox(doors);
		cbDoors .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose item from combo box
				String s = (String) cbDoors .getSelectedItem();
				switch (s) {
				case "2":
					cbDoor = 2;
					break;
				case "3":
					cbDoor = 3;
					break;
				case "4":
					cbDoor = 4;
					break;
				case "5":
					cbDoor = 5;
				default:
					cbDoor = 13;
					break;
				}
			}});

		cbDoors.setBounds(568, 103, 85, 31);
		contentPane.add(cbDoors);
		cbDoors.setSelectedIndex(0);


		String[] odome = {"20,000", "30,000", "50,000", "75,000", "100,000", "350,000"}; 
		JComboBox cbOdometer = new JComboBox(odome);
		cbOdometer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose item from combo box
				String s = (String) cbOdometer.getSelectedItem();
				switch (s) {
				case "20,000":
					cbOdo = 20000;
					break;
				case "30,000":
					cbOdo = 30000;
					break;
				case "50,000":
					cbOdo = 50000;
					break;
				case "75,000":
					cbOdo = 75000;
					break;
				case "100,000":
					cbOdo = 100000;
					break;
				default:
					cbOdo = 350000;
					break;
				}
			}});
		cbOdometer.setBounds(568, 162, 85, 31);
		contentPane.add(cbOdometer);
		cbOdometer.setSelectedIndex(0);
	

		String[] wsize = {"10", "14", "15", "16", "17", "18", "22"}; 
		JComboBox cbWheelSize = new JComboBox(wsize);
		cbWheelSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose item from combo box
				String s = (String) cbWheelSize.getSelectedItem();
				switch (s) {
				case "10":
					cbSize = 10;
					break;
				case "14":
					cbSize = 14;
					break;
				case "15":
					cbSize = 15;
					break;
				case "16":
					cbSize = 16;
					break;
				case "17":
					cbSize = 17;
					break;
				case "18":
					cbSize = 18;
					break;
				default:
					cbSize = 22;
					break;
				}
			}});
		cbWheelSize.setBounds(568, 221, 85, 31);
		contentPane.add(cbWheelSize);
		cbWheelSize.setSelectedIndex(0);
		

		String[] colour = {"Red", "Blue", "Silver", "Black", "Purple", "Yellow"}; 
		JComboBox cbColor = new JComboBox(colour);
		cbColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose item from combo box
				String s = (String) cbColor.getSelectedItem();
				switch (s) {
				case "Red":
					cbColorChoice = 0;
					break;
				case "Blue":
					cbColorChoice = 1;
					break;
				case "Silver":
					cbColorChoice = 2;
					break;
				case "Black":
					cbColorChoice = 3;
					break;
				case "Purple":
					cbColorChoice = 4;
					break;
				default:
					cbColorChoice = 5;
					break;
				}
			}});
		cbColor.setBounds(568, 289, 85, 31);
		contentPane.add(cbColor);
		cbColor.setSelectedIndex(0);
	

		JButton btnNewButton = new JButton("Build Your Shredder");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new CarFactory(name, cbPass, cbTankCa, cbMPGS, cbTonage, cbDoor, cbOdo, cbSize, cbColorChoice );
				dispose();
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setIcon(new ImageIcon(GUICustom.class.getResource("/guiimages/flintsone_128.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(203, 397, 302, 137);
		contentPane.add(btnNewButton);
	}
}


