package vehicle;

public class model {
	private String BodyType;
	private String ModelName;
	private String[] PackageType;
	
	model()
	{
		BodyType = "Truck";
		ModelName = "Big";
		PackageType = new String[] {"Wheels", "4", "MPG", "15", "Color", "Blue", "Seats", "2", "FuelCap", "20", "tonnage", "2" };
	}
	
	model(String Bt, String Mn, String[] trimPackage)
	{
		BodyType= Bt;
		ModelName = Mn;
		PackageType = trimPackage;
	}
	
	public String getBt()
	{
		return BodyType;
	}
	public void setBt(String NewBodyType)
	{
		BodyType = NewBodyType;
	}
	public String getModelName()
	{
		return ModelName;
	}
	public void setmodelName(String newModelName) 
	{
		ModelName= newModelName;
	}
	public String[] getPackageType() 
	{
		return PackageType;
	}
	public void setPackageType(String [] newPackageType) 
	{
		PackageType = newPackageType;
	}

}
