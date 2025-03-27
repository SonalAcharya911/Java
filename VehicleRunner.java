class VehicleRunner{
	public static void main(String[] args){
		Vehicle.displayInfo("i10");
		Vehicle.displayInfo("Swift");
		Vehicle.displayInfo("Zen Estilo");
		Vehicle.displayInfo("Wagnor");
		
		
		int price1=Vehicle.displayPrice("i10");
		System.out.println("price of i10: "+price1);
		
		int price2=Vehicle.displayPrice("Swift");
		System.out.println("price of Swift: "+price2);
		
		int price3=Vehicle.displayPrice("Zen Estilo");
		System.out.println("price of Zen Estilo: "+price3);
		
		int price4=Vehicle.displayPrice("Wagnor");
		System.out.println("price of Wagnor: "+price4);
	}
}