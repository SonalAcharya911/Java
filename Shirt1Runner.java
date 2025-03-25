class Shirt1Runner{
	public static void main(String[] args){
		Shirt1 shirt= new Shirt1();
		
		System.out.println("default values");
		System.out.println("shirt material: "+shirt.material);
		System.out.println("shirt pattern: "+shirt.pattern);
		System.out.println("shirt sleevelength: "+shirt.sleeveLength);
		System.out.println("shirt fit: "+shirt.fit);
		
		System.out.println("\n");
		
		shirt.material="Linen";
		shirt.pattern="Striped";
		shirt.sleeveLength="Full sleeve";
		shirt.fit="Slim fit";
		
		System.out.println("updated values");
		System.out.println("shirt material: "+shirt.material);
		System.out.println("shirt pattern: "+shirt.pattern);
		System.out.println("shirt sleevelength: "+shirt.sleeveLength);
		System.out.println("shirt fit: "+shirt.fit);
	}
}