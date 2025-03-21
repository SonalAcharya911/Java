class Engine{
	public static void displayInfo(String engineName, String engineManufacturer, String engineType,int horsepower, int torque, int displacement, int numCylinders,String fuelType, float compressionRatio, float fuelEfficiency,int weight, int maxRPM, String coolingSystem, String ignitionType,boolean isTurbocharged, String transmissionType, String emissionStandard,int numValves, float bore, float stroke, String engineBlockMaterial,float oilCapacity, String starterType, String fuelInjectionType, int engineCost){
		System.out.println("Running displayInfo for Engine");
		System.out.println("Engine Name: " + engineName);
		System.out.println("Engine Manufacturer: " + engineManufacturer);
		System.out.println("Engine Type: " + engineType);
		System.out.println("Horsepower: " + horsepower + " HP");
		System.out.println("Torque: " + torque + " Nm");
		System.out.println("Displacement: " + displacement + " cc");
		System.out.println("Number of Cylinders: " + numCylinders);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Compression Ratio: " + compressionRatio);
		System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
		System.out.println("Weight: " + weight + " kg");
		System.out.println("Max RPM: " + maxRPM);
		System.out.println("Cooling System: " + coolingSystem);
		System.out.println("Ignition Type: " + ignitionType);
		System.out.println("Turbocharged: " + isTurbocharged);
		System.out.println("Transmission Type: " + transmissionType);
		System.out.println("Emission Standard: " + emissionStandard);
		System.out.println("Number of Valves: " + numValves);
		System.out.println("Bore: " + bore + " mm");
		System.out.println("Stroke: " + stroke + " mm");
		System.out.println("Engine Block Material: " + engineBlockMaterial);
		System.out.println("Oil Capacity: " + oilCapacity + " liters");
		System.out.println("Starter Type: " + starterType);
		System.out.println("Fuel Injection Type: " + fuelInjectionType);
		System.out.println("Engine Cost: Rs." + engineCost);
	}

}