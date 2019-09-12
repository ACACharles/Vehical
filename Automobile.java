package vehicle;

public class Automobile extends Vehicle {
	private String Owner; 
	 private String Title; 
	  private boolean Trunk; 
	   private boolean AC ; 
	  private boolean Tint; 
	 private Maker autoMaker; 
	private Model autoModel; 
	
	
     Automobile(){
    	 super(); 
    	
     
		Owner = "Luke" ;
		 Title = "Held" ;
		  Trunk = true; 
		   AC = true ; 
		  Tint = false; 
		 autoMaker = new Maker();
		autoModel = new Model() ; 
		     
		      
		     
		     
	}
     Automobile(int p, int f, int m, Maker Ll, Model Mm) {
    	 super(p,f,m);
    	  autoMaker = Ll; 
    	   autoModel = Mm; 
    	   Owner = "Luke" ;
  		    Title = "Held" ;
  		   Trunk = true; 
  		  AC = true ; 
  		 Tint = false; 
    	   
     }
     Automobile(int p, int f, int m, Maker Ll, Model Mm, int d, int t, int w, int y, int z, String c){
    	 autoMaker = Ll; 
  	      autoModel = Mm; 
  	        Owner = "Luke" ;
		    Title = "Held" ;
		   Trunk = true; 
		  AC = true ; 
		 Tint = false;
		
    	 
    	 
    	 
   }
	
	public Maker getAutoMaker() {
		return autoMaker;
	}

		public void setAutoMaker(Maker autoMaker) {
			this.autoMaker = autoMaker;
	}

		public Model getAutoModel() {
			return autoModel;
	}

			public void setAutoModel(Model autoModel) {
				this.autoModel = autoModel;
	}

				public int getWheels() {
					String[] TrimPackage = autoModel.getTrimPackage();
						int wheelCount = 0;
					try {
						wheelCount = Integer.parseInt(TrimPackage[1]);
					}
					catch(Exception e ) {
						System.out.println("Bad Trim Pack");
					}
					return wheelCount; 
					}
	
	
				public int getDoors() {
					return super.doors;
	}

			public String getOwner() {
				return Owner;
	}

		public void setOwner(String owner) {
			Owner = owner;
	}

		public String getTitle() {
			return Title;
	}

			public void setTitle(String title) {
				Title = title;
	}

				public boolean isTrunk() {
					return Trunk;
	}

					public void setTrunk(boolean trunk) {
						Trunk = trunk;
	}

						public boolean isAC() {
							return AC;
	}

						public void setAC(boolean aC) {
							AC = aC;
	}	

					public boolean isTint() {
						return Tint;
	}

				public void setTint(boolean tint) {
					Tint = tint;
	}
	
			void getMakeandModel() {
				Tint = true; 
	} 
	
	
	

}
