class Drone{
	String brand;
	String model;
	String droneType;
	String usage;
	String color;
	String material;
	int weight;
	int length;
	int breadth;
	int height;
	boolean foldable;
	boolean waterResistant;
	int maxSpeed;
	int maxAltitude;
	int flightTime;
	String battery;
	int batteryCapacity;
	int chargeTime;
	boolean gps;
	boolean returnHome;
	int pixels;
	
	Drone(String brand,String model,String droneType,String usage,String color,String material,int weight,int length,int breadth,int height,boolean foldable,boolean waterResistant,int maxSpeed,int maxAltitude,int flightTime,String battery,int batteryCapacity,int chargeTime,boolean gps,boolean returnHome,int pixels){
		this.brand=brand;
		this.model=model;
		this.droneType=droneType;
		this.usage=usage;
		this.color=color;
		this.material=material;
		this.weight=weight;
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		this.foldable=foldable;
		this.waterResistant=waterResistant;
		this.maxSpeed=maxSpeed;
		this.maxAltitude=maxAltitude;
		this.flightTime=flightTime;
		this.battery=battery;
		this.batteryCapacity=batteryCapacity;
		this.chargeTime=chargeTime;
		this.gps=gps;
		this.returnHome=returnHome;
		this.pixels=pixels;
	}
}

