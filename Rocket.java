class Rocket{
	String name;
	String manufacturer;
	String country;
	String launchDate;
	String mission;
	int load;
	int stages;
	String fuelType;
	int height;
	int diameter;
	int mass;
	int thrust;
	int burnTime;
	int boosters;
	boolean reusable;
	int noOfEngines;
	int maxSpeed;
	boolean escapeSystem;
	int cost;
	int successRate;
	
	Rocket(String name,String manufacturer,String country,String launchDate,String mission,int load,int stages,String fuelType,int height,int diameter,int mass,int thrust,int burnTime,int boosters,boolean reusable,int noOfEngines,int maxSpeed,boolean escapeSystem,int cost,int successRate){
		this.name=name;
		this.manufacturer=manufacturer;
		this.country=country;
		this.launchDate=launchDate;
		this.mission=mission;
		this.load=load;
		this.stages=stages;
		this.fuelType=fuelType;
		this.height=height;
		this.diameter=diameter;
		this.mass=mass;
		this.thrust=thrust;
		this.burnTime=burnTime;
		this.boosters=boosters;
		this.reusable=reusable;
		this.noOfEngines=noOfEngines;
		this.maxSpeed=maxSpeed;
		this.escapeSystem=escapeSystem;
		this.cost=cost;
		this.successRate=successRate;
	}
}

