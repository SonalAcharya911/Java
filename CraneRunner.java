class CraneRunner{
		
	public static void main(String... values){
		Crane crane=new Crane();
		
		System.out.println("default values");
		
		System.out.println("crane craneType: "+crane.craneType);
		System.out.println("crane load capacity : "+crane.capacity);
		System.out.println("crane mobility: "+crane.mobility);
		System.out.println("crane powerSource: "+crane.powerSource);
		
		crane.craneType="Tower Crane";
		crane.capacity=10;
		crane.mobility="Wheeled";
		crane.powerSource="Diesel Engine";
		
		System.out.println("\n Updated values");
		System.out.println("crane craneType: "+crane.craneType);
		System.out.println("crane load capacity : "+crane.capacity);
		System.out.println("crane mobility: "+crane.mobility);
		System.out.println("crane powerSource: "+crane.powerSource);
	
	}
	
}