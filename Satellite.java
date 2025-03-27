class Satellite{
	String name;
	String manufacturer;
	String country;
	String satelliteType;
	String launchDate;
	int duration;
	int weight;
	String shape;
	String orbitType;
	int orbitalSpeed;
	int inclination;
	int frequency;
	int transmitPower;
	int dataRate;
	boolean encryption;
	String powerSource;
	String navigationSystem;
	boolean docking;
	long cost;
	int successRate;
	
	Satellite(String name,String manufacturer,String country,String satelliteType,String launchDate,int duration,int weight,String shape,String orbitType,int orbitalSpeed,int inclination,int frequency,int transmitPower,int dataRate,boolean encryption,String powerSource,String navigationSystem,boolean docking,long cost,int successRate){
		this.name=name;
		this.manufacturer=manufacturer;
		this.country=country;
		this.satelliteType=satelliteType;
		this.launchDate=launchDate;
		this.duration=duration;
		this.weight=weight;
		this.shape=shape;
		this.orbitType=orbitType;
		this.orbitalSpeed=orbitalSpeed;
		this.inclination=inclination;
		this.frequency=frequency;
		this.transmitPower=transmitPower;
		this.dataRate=dataRate;
		this.encryption=encryption;
		this.powerSource=powerSource;
		this.navigationSystem=navigationSystem;
		this.docking=docking;
		this.cost=cost;
		this.successRate=successRate;
	}
}


