package vehicle;

public class Automobile extends Vehicle {
	private boolean Trunk;
	private boolean Ac;
	private boolean Tint;
	private String Owner;
	private String Title;
	public makerVehicle AutoMake;
	public model AutoModel;
	
	Automobile(int MPG, int pass, int fc, model mo, makerVehicle ma)
	{
		super();
		Trunk = true;
		Ac = true;
		Tint = true;
		Owner = "Me";
		Title = "IN Glove box.";
		AutoMake = new makerVehicle();
		AutoModel = new model();
		updateVehicle();
		
	}
	Automobile(model mo, makerVehicle ma, String clr , int ps, int mg, int fc, int ds, double ton, int yr, int ts, int top)
	{
		super( ps, fc, mg);
		Trunk = true;
		Ac = true;
		Owner = "Me";
		Title = "Yes";
		AutoMake = new makerVehicle();
		AutoModel = new model();
		updateVehicle();
	}
	
	public boolean isTrunk() 
	{
		return Trunk;
	}
	public void setTrunk(boolean newTrunk)
	{
		Trunk = newTrunk;
	}
	public boolean isAc() 
	{
		return Ac;
	}
	public void setAc(boolean newAc)
	{
		newAc= Ac;
	}
	public boolean isTint() 
	{
		return Tint;
	}
	public void setTint(boolean newTint) 
	{
		 Tint = newTint;
	}
	public String getOwner() 
	{
		return Owner;	
	}
	public void setOwner(String newOwner) 
	{
		Owner = newOwner;
	}

	public int getNumWheels() 
	{
		String[] trimPackage = AutoModel.getPackageType();
		int wheelCount = 0;
		try 
		{
			wheelCount = Integer.parseInt(trimPackage[1]);
		}
		catch(Exception e) 
		{
			System.out.println("Bad Package Type");
		}
		return wheelCount;
	}
	private void updateVehicle() 
	{
		String [] trimPak = AutoModel. getPackageType();
		int wCount, MPG, pass, fuelCap,tonnage;
		String colour;
		
			try 
			{ 
				MPG = Integer.parseInt(trimPak[2]);
				pass = Integer.parseInt(trimPak[3]);
				fuelCap = Integer.parseInt(trimPak[4]);
				
			}
			catch(Exception e) 
			{
				
				MPG = 20;
				pass = 4;
				fuelCap = 20;
				
				System.out.println("Bad Package Type");
			}
			try 
			{
				tonnage = Integer.parseInt(trimPak[11]);
			}
			catch (Exception e) 
			{
				tonnage = 2;
				System.out.println("Bad Trim Package");
			}
			super.mpg = MPG;
			super.passengers = pass;
			super.fuelcap = fuelcap;
			super.tonnage = tonnage;
			super.color = trimPak[3];
	}
	
	int getdNumDoors()
	{
		return super.doors;
	}
	@Override
	void getMakeandModel() {
		AutoMake.getMaker();
		AutoModel.getModelName();
	}
	}
