class Gun{
	public static void displayInfo(String gunName, String manufacturer, int caliber, String type, int magazineCapacity, int weight, int costPrice, boolean isAutomatic){
		System.out.println("Running displayInfo for Gun");
		System.out.println("Gun Name: " + gunName);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Caliber (mm): " + caliber);
		System.out.println("Type: " + type);
		System.out.println("Magazine Capacity: " + magazineCapacity + " rounds");
		System.out.println("Weight (grams): " + weight);
		System.out.println("Cost Price: " + costPrice);
		System.out.println("Is Automatic: " + isAutomatic);
	}

}