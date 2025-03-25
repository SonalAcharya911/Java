class HangerRunner{
	public static void main(String[] args){
		Hanger hanger=new Hanger();
		
		System.out.println("default values");
		System.out.println("hanger hook type"+hanger.hookType);
		System.out.println("hanger hook type"+hanger.shape);
		System.out.println("hanger hook type"+hanger.size);
		System.out.println("hanger hook type"+hanger.capacity);
		System.out.println("\n");
		
		shirt.hookType="Rotating Hook";
		shirt.shape="Triangular";
		shirt.size=50;
		shirt.capacity=2;
		System.out.println("updated values");
		System.out.println("hanger hook type"+hanger.hookType);
		System.out.println("hanger hook type"+hanger.shape);
		System.out.println("hanger hook type"+hanger.size);
		System.out.println("hanger hook type"+hanger.capacity);
		

	}
}