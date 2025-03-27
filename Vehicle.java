class Vehicle{
	public static void displayInfo(String carName){
		System.out.println("running displayInfo in Vehicle");
		String color="";
		int price=0;
		boolean storageSpace=false;
		String company="";
				
		if(carName=="i10"){
			System.out.println("info of: "+carName);
			color="Black";
			price=800000;
			storageSpace=true;
			company="Hyundai";
			System.out.println("car color: "+color);
			System.out.println("car price: "+price);
			System.out.println("car storageSpace: "+storageSpace);
			System.out.println("car company: "+company);
		}
		else if(carName=="Swift"){
			System.out.println("info of: "+carName);
			color="Blue";
			price=500000;
			storageSpace=true;
			company="Maruti Suzuki";
			System.out.println("car color: "+color);
			System.out.println("car price: "+price);
			System.out.println("car storageSpace: "+storageSpace);
			System.out.println("car company: "+company);
		}
		else if(carName=="Zen Estilo"){
			System.out.println("info of: "+carName);
			color="Golden";
			price=650000;
			storageSpace=false;
			company="Maruti Suzuki";
			System.out.println("car color: "+color);
			System.out.println("car price: "+price);
			System.out.println("car storageSpace: "+storageSpace);
			System.out.println("car company: "+company);
		}
		else{
			System.err.println("Car info not found");
		}
	}
	
	public static int displayPrice(String carName){
		int price=0;
		if(carName=="i10"){
			return price=800000;
		}
		else if(carName=="Swift"){
			return price=500000;
		}
		else if(carName=="Zen Estilo"){
			return price=650000;
		}
		else {
			System.err.println("Car info not found");
			return price=0;
		}
	}
}