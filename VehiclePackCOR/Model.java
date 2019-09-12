package VehiclePack;

public class Model {

	private String bodyType;
	private String modelName;
	private String[] trimPack;
	
	Model() {
		bodyType = "sedan";
		modelName = "Camry";
		trimPack = new String[]{"Wheels", "4", "MPG", "15", "Color", "Blue", "Seats", "2", "fuelcap", "20", "tonage", "1.234"};
		}


	Model(String bt, String mn, String[] tp) {
		bodyType = bt;
		modelName = mn;
		trimPack = tp;
	}
	

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String[] getTrimPack() {
		return trimPack;
	}

	public void setTrimPack(String[] trimPack) {
		this.trimPack = trimPack;
	}


}