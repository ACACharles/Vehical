package vehicle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.text.SimpleDateFormat;
import java.awt.Image;
import java.util.Date;

class makerVehicle extends JFrame
{
	 String company,plantLocation, phoneNumber, website;
	 ImageIcon logo;
	 Date mintDate;
	  
	 makerVehicle()
	{
		company = "Ford";
		plantLocation = "Detroit";
		phoneNumber = "4798999844";
		try { mintDate = new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-31");}
		catch(Exception e) {;}
		website = "www.ford.com";
		mintDate = new Date(); 
		logo = new ImageIcon("chevlogo.jpg");
		
	}
		makerVehicle(String s, String pl, Date md, String pn, String ws, ImageIcon l)
	{
			company = s;
			plantLocation = pl;
			mintDate = md;
			phoneNumber = pn;
			website = ws;
			logo =l;
			
			
	}
		ImageIcon getLogo() 
		{
			return logo;
		}
		void getMaker() 
		{
		 MakeFrame thisOne = new MakeFrame();
		}
		
	private class MakeFrame extends JFrame
	{
		JPanel pnl = new JPanel();
		ClassLoader ldr = this.getClass().getClass().getClassLoader();
		ImageIcon duke = logo;
		JLabel lbll = new JLabel( duke ) ;
		
		MakeFrame()
		{
			super("cherry");
			setSize(600,600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			add(pnl);
			pnl.add(lbll);
			setVisible(true);
		}
		}
	}
	


	
	
	
	
	
