class FloorRunner{
	public static void main(String[] args){
		Floor floor=new Floor();
				
		System.out.println("default values");
		System.out.println("floor type: "+floor.floor_type);
		System.out.println("floor thickness: "+floor.thickness);
		System.out.println("floor durability: "+floor.durability);
		System.out.println("is floor Slip resistant: "+floor.slipResistance);
		
		System.out.println("\n");
		
		floor.floor_type="Glossy";
		floor.thickness=12;
		floor.durability=20;
		floor.slipResistance=true;
		
		System.out.println("updated values");
		System.out.println("floor type: "+floor.floor_type);
		System.out.println("floor thickness: "+floor.thickness);
		System.out.println("floor durability: "+floor.durability);
		System.out.println("is floor Slip resistant: "+floor.slipResistance);
	}
}