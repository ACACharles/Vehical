package VehiclePack;

public class Automobile extends Vehicle {
	
	private boolean trunk;
	private boolean ac;
	private boolean tint;
	private String owner;
	private String title;
	public Maker autoMaker;
	public Model autoModel;
	
	// This is the default constructor 
	Automobile(){
		super();
		trunk = true;
		ac = true;
		tint = false;
		owner = "Charles";
		title = "My Title";
		autoMaker = new Maker();
		autoModel =	new Model();	
	}
	
	Automobile(int p, int f, int m, Maker a, Model b){
		super(p, f, m); // This is making a call to the constructor with 3 vars. in the Vehicle class
		
		autoMaker = a;
		autoModel = b;
		trunk = true;
		ac = true;
		tint = false;
		owner = "Charles";
		title = "My Title";
	}
	Automobile(int p, int f, int m, int d, int t, int w, int y, int tm, String c, boolean tr, boolean ac, boolean tn, String cs, String tt, Maker a, Model b){
		super(p, f, m, d, t,  w,  y, tm, c);
		
		trunk = true;
		ac = true;
		tint = false;
		owner = cs;
		title = tt;
		autoMaker = a;
		autoModel = b;
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
	public boolean isTrunk() {
		return trunk;
	}
	public void setTrunk(boolean trunk) {
		this.trunk = trunk;
	}

	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public boolean isTint() {
		return tint;
	}
	public void setTint(boolean tint) {
		this.tint = tint;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumWheels() {
		String[] TrimPack = autoModel.getTrimPack();
		int wheelCount = 0;
		try {
			wheelCount = Integer.parseInt(TrimPack[1]);
		}
			catch(Exception e) {
				System.out.println("BAD TRIM PACKAGE");
			}
		return wheelCount;
	}
	
	public int getNumDoors() {
		return super.doors; //this is pulling the door count from the Vehicle class. 
	}
	
	void getMakeAndModel() {
		
	}

}
