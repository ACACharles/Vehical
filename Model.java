package vehicle;

public class Model {
	private String BodyType; 
	private String ModelName;
	private String [] TrimPackage; 
	
	Model(){
		BodyType = "Pickup";
		ModelName = "Ram";
		TrimPackage = new String[] {"Wheels", "4","MPG","15", "Color", "Blue", "Seats", "2","fuelcap","20", "tonage", "1.234" } ;
	}
	
	Model(String Bt, String Mn,  String [] Tp){
		BodyType = Bt; 
		 ModelName = Mn;
		  TrimPackage = Tp; 
	}
	
	 public String getBodyType() {
		return BodyType;
	}



	public void setBodyType(String bodyType) {
		BodyType = bodyType;
	}



	public String getModelName() {
		return ModelName;
	}



	public void setModelName(String modelName) {
		ModelName = modelName;
	}



	public String[] getTrimPackage() {
		return TrimPackage;
	}



	public void setTrimPackage(String[] trimPackage) {
		this.TrimPackage = trimPackage;
	}



	


	
	

}
