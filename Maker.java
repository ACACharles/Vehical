package vehicle;
import java.util.Date;

import javax.swing.ImageIcon;

import java.awt.Image.*;

public class Maker {
	

		String Company; 
		  Date mintDate; 
		   String PlantLocation; 
		   ImageIcon logo; 
		  int ContactInfo; 
		 String webSite; 
		
		 
	Maker() {
		Company = "Dodge";
		  mintDate = new Date(); 
		   PlantLocation = "Conway, Ar"; 
		   // logo = (""); 
		     ContactInfo = 501-504-9636; 
		      String WebSite = "mopar.com"; 
	}     
	 

		    
	Maker(String c, Date md, ImageIcon lg, int ci, String ws) {
		Company = c; 
		 mintDate = md;
		  logo = lg; 
		   ContactInfo = ci; 
			webSite = ws; 
				
		
	}

	}
		



