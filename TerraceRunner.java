class TerraceRunner{
	public static void main(String[] args){
		Terrace terrace=new Terrace();
		
		System.out.println("default values");
		System.out.println("terrace area: "+terrace.area);
		System.out.println("terrace roof type: "+terrace.roofType);
		System.out.println("terrace load capacity: "+terrace.loadCapacity);
		System.out.println("terrace waterproofinf type: "+terrace.waterproofingType);
		
		System.out.println("\n");
		
		terrace.area= 500;
		terrace.roofType="Open";
		terrace.loadCapacity=400;
		terrace.waterproofingType= "Cementitious Waterproofing";
		
		System.out.println("updated values");
		System.out.println("terrace area: "+terrace.area);
		System.out.println("terrace roof type: "+terrace.roofType);
		System.out.println("terrace load capacity: "+terrace.loadCapacity);
		System.out.println("terrace waterproofinf type: "+terrace.waterproofingType);
	}
}