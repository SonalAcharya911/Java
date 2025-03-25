class Bed1Runner{
	public static void main(String[] args){
		Bed1 bed=new Bed1();
		
		System.out.println("Default values: ");
		System.out.println("bed size: "+bed.size);
		System.out.println("bed type: "+bed.type);
		System.out.println("bed brand: "+bed.brand);
		System.out.println("bed weight: "+bed.weight);
		
		bed.size="Queen";
		bed.type="Spring";
		bed.brand="KurlOn";
		bed.weight=300;
		
		System.out.println("\n");
		
		System.out.println("updated values: ");
		System.out.println("bed size: "+bed.size);
		System.out.println("bed type: "+bed.type);
		System.out.println("bed brand: "+bed.brand);
		System.out.println("bed weight: "+bed.weight);
	}
}