class SirenRunner{
	public static void main(String... values){
		
	
	Siren siren=new Siren();
	Siren siren1=new Siren();
	siren1=siren;
	
	System.out.println("default values");
	
	System.out.println("siren Type: "+siren.type);
	System.out.println("siren frequency : "+siren.frequency);
	System.out.println("siren usage: "+siren.usage);
	System.out.println("siren mountingType: "+siren.mountingType);
	
	
	siren.type="Emergency";
	siren.frequency=800;
	siren.usage="Ambulance";
	siren.mountingType="Vehicle Mounted";
	
	System.out.println("\n updated values");
	
	System.out.println("siren Type: "+siren.type);
	System.out.println("siren frequency : "+siren.frequency);
	System.out.println("siren usage: "+siren.usage);
	System.out.println("siren mountingType: "+siren.mountingType);
	
	}
}