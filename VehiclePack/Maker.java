package VehiclePack;

import java.util.Date;

import javax.swing.ImageIcon;

 public class Maker {

	String company;
	String plantLocal;
	Date mintDate;
	ImageIcon logo;
	int phoneNumber;
	String webSite;

	ImageIcon getLogo() {
		return logo;
	}

	void getMake() {
	}

	Maker() // This is my default constructor
	{
		company = "Ford";
		plantLocal = "Kentucky";
		mintDate = new Date();
		ImageIcon fordp = new ImageIcon("ford.png");
		logo = (fordp);
		phoneNumber = 111 - 111 - 1111;
		webSite = "ford.com";
	}

	Maker(String c, String pl, Date md, ImageIcon lg, int pn, String ws) // Here is my assignable constructor
	{
		company = c;
		plantLocal = pl;
		mintDate = md;
		logo = lg;
		phoneNumber = pn;
		webSite = ws;
	}

}