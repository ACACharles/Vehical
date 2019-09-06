package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
//can you see this?
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActionMenu extends JFrame {

	private static JPanel contentPane;
	private static JLabel lblCarPic;
	public static ImageIcon answer;
	int color = CarFactory.color;
	
	ImageIcon imgBlack = new ImageIcon("black_96.png");
	ImageIcon imgBlue = new ImageIcon("blue2.png");
	ImageIcon imgRed = new ImageIcon("red.png");
	ImageIcon imgSilver = new ImageIcon("silver.png");
	ImageIcon imgPurp = new ImageIcon("purp.png");
	ImageIcon imgYellow = new ImageIcon("yellow.png");
	

	public ActionMenu() {
		
		CarPhoto();

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblwash = new JLabel("Car Cleanliness: " + CarFactory.cleandirty);
		lblwash.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblwash.setBounds(190, 420, 149, 34);
		contentPane.add(lblwash);

		JLabel lblTankfull = new JLabel("Gas Left: " + CarFactory.gaslvl);
		lblTankfull.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTankfull.setBounds(379, 420, 129, 34);
		contentPane.add(lblTankfull);

		JLabel lblNewLabel = new JLabel(CarFactory.name + ", it's time to start your car and DRIVE!!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 10, 712, 49);
		contentPane.add(lblNewLabel);

		JLabel lblVehicleStats = new JLabel("Vehicle Stats:");
		lblVehicleStats.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVehicleStats.setBounds(10, 69, 136, 49);
		contentPane.add(lblVehicleStats);

		JLabel lblPassengers = new JLabel("Passengers: " + CarFactory.passengers);
		lblPassengers.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassengers.setBounds(10, 112, 136, 34);
		contentPane.add(lblPassengers);

		JLabel lblFuelCapacity = new JLabel("Fuel Capacity: " + CarFactory.fuelcap);
		lblFuelCapacity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFuelCapacity.setBounds(10, 156, 136, 34);
		contentPane.add(lblFuelCapacity);

		JLabel lblMPG = new JLabel("MPG: " + CarFactory.mpg);
		lblMPG.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMPG.setBounds(10, 200, 136, 34);
		contentPane.add(lblMPG);

		JLabel lbltonage = new JLabel("Tonage: " + CarFactory.tonage);
		lbltonage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbltonage.setBounds(10, 244, 136, 34);
		contentPane.add(lbltonage);

		JLabel lblDoors = new JLabel("Doors: " + CarFactory.doors);
		lblDoors.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDoors.setBounds(10, 288, 136, 34);
		contentPane.add(lblDoors);

		JLabel lblWheelSize = new JLabel("Wheel Size: " + CarFactory.wheelsize + " in");
		lblWheelSize.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWheelSize.setBounds(10, 332, 136, 34);
		contentPane.add(lblWheelSize);

		JLabel lblyear = new JLabel("Year : " + CarFactory.year);
		lblyear.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblyear.setBounds(10, 376, 136, 34);
		contentPane.add(lblyear);

		JLabel lblRange = new JLabel("Range : " + CarFactory.range + " miles");
		lblRange.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRange.setBounds(10, 420, 136, 34);
		contentPane.add(lblRange);
		
		if (color == 0) {
			answer = imgRed;}
		if (color == 1) {
			answer = imgBlue;}
		if (color == 2) {
			answer = imgSilver;}
		if (color == 3) {
			answer = imgBlack;}
		if (color == 4) {
			answer = imgPurp;}
		if (color == 5) {
			answer = imgYellow;}

		lblCarPic = new JLabel("");
		lblCarPic.setIcon(answer);
		lblCarPic.setBounds(156, 112, 330, 265);
		contentPane.add(lblCarPic);

		JLabel lblStartCar = new JLabel("Start Your Car!");
		lblStartCar.setOpaque(true);
		lblStartCar.setBackground(Color.RED);
		lblStartCar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStartCar.setBounds(522, 69, 139, 49);
		contentPane.add(lblStartCar);
		
		JButton btnStartCar = new JButton("");
		btnStartCar.setIcon(new ImageIcon(ActionMenu.class.getResource("/guiimages/car_key_48.png")));
		btnStartCar.setBounds(550, 123, 88, 67);
		contentPane.add(btnStartCar);
		btnStartCar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (CarFactory.carRunning) {
					CarFactory.carRunning = false;
				}else {
					CarFactory.carRunning = true;
				}
				if (!CarFactory.carRunning) {
					lblStartCar.setBackground(Color.RED);
				}else {
					lblStartCar.setBackground(Color.GREEN);
				}
				contentPane.revalidate();
				contentPane.repaint();
			}
		});

		JLabel lblWashCar = new JLabel("Wash UR Filth off!");
		lblWashCar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWashCar.setBounds(506, 214, 176, 49);
		contentPane.add(lblWashCar);

		JButton btnWashCar = new JButton("");
		btnWashCar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (CarFactory.carRunning) {
				if (CarFactory.range>20) {
					CarFactory.gaslvl-=5;
				}else {
					CarFactory.gaslvl-=10;
				}
				CarFactory.cleandirty=10;
				lblwash.setText("Car Cleanliness: " + CarFactory.cleandirty);
				lblTankfull.setText("Gas Left: " + CarFactory.gaslvl);
			}}
		});
		btnWashCar.setIcon(new ImageIcon(ActionMenu.class.getResource("/guiimages/sprinkler2.png")));
		btnWashCar.setBounds(550, 268, 88, 67);
		contentPane.add(btnWashCar);

		JLabel lblGetGas = new JLabel("Fill Tanks Belly");
		lblGetGas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGetGas.setBounds(522, 345, 139, 49);
		contentPane.add(lblGetGas);

		JButton btnFillTank = new JButton("");
		btnFillTank.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (CarFactory.carRunning) {
				CarFactory.gaslvl=100;
				CarFactory.cleandirty-=2;
				lblwash.setText("Car Cleanliness: " + CarFactory.cleandirty);
				lblTankfull.setText("Gas Left: " + CarFactory.gaslvl);
				contentPane.revalidate();
				contentPane.repaint();
				}
			}
		});
		btnFillTank.setIcon(new ImageIcon(ActionMenu.class.getResource("/guiimages/gas2.png")));
		btnFillTank.setBounds(550, 387, 88, 67);
		contentPane.add(btnFillTank);

		JButton btnExitAM = new JButton("   Exit");
		btnExitAM.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExitAM.setIcon(new ImageIcon(ActionMenu.class.getResource("/guiimages/cross.png")));
		btnExitAM.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExitAM.setBounds(35, 494, 183, 89);
		contentPane.add(btnExitAM);

		JButton btnDriveAM = new JButton(" Drive");
		btnDriveAM.setIcon(new ImageIcon(ActionMenu.class.getResource("/guiimages/car2_128.png")));
		btnDriveAM.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDriveAM.setBounds(262, 494, 191, 89);
		contentPane.add(btnDriveAM);

		JButton btnRestartAM = new JButton("   Restart");
		btnRestartAM.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MainMenu restart = new MainMenu();
				restart.main(null);
				dispose();
			}
		});
		btnRestartAM.setIcon(new ImageIcon(ActionMenu.class.getResource("/guiimages/restart_48.png")));
		btnRestartAM.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRestartAM.setBounds(478, 496, 183, 84);
		contentPane.add(btnRestartAM);
	}
	
	public void CarPhoto() {
		
		int color = CarFactory.color;

//		ImageIcon imgBlack = new ImageIcon("black_96.png");
//		ImageIcon imgBlue = new ImageIcon("blue2.png");
//		ImageIcon imgRed = new ImageIcon("red.png");
//		ImageIcon imgSilver = new ImageIcon("silver.png");
//		ImageIcon imgPurp = new ImageIcon("purp.png");
//		ImageIcon imgYellow = new ImageIcon("yellow.png");

		if (color == 0) {
			answer = imgRed;}
		if (color == 1) {
			answer = imgBlue;}
		if (color == 2) {
			answer = imgSilver;}
		if (color == 3) {
			answer = imgBlack;}
		if (color == 4) {
			answer = imgPurp;}
		if (color == 5) {
			answer = imgYellow;}
		
	}

}


