package gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CarPhoto extends CarFactory {


	
	public CarPhoto(int color) {
		// TODO Auto-generated constructor stub

		ImageIcon answer = null;

		ImageIcon imgBlack = new ImageIcon("black_96.png");
		// lblBlack= new JLabel(imgBlack);
		ImageIcon imgBlue = new ImageIcon("blue_96.png");
		//JLabel lblcatPic = new JLabel(imgduke);
		ImageIcon imgRed = new ImageIcon("red_96.png");
		//JLabel lblcatPic = new JLabel(imgduke);
		ImageIcon imgSilver = new ImageIcon("silver_96.png");
		//JLabel lblcatPic = new JLabel(imgduke);
		ImageIcon imgPurp = new ImageIcon("purple_96.png");
		//JLabel lblcatPic = new JLabel(imgduke);
		ImageIcon imgYellow = new ImageIcon("yellow_96.png");
		//JLabel lblcatPic = new JLabel(imgduke);

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
		
		ActionMenu.setPicture(answer);
	}
}
