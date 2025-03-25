class HairRunner{
	public static void main(String[] args){
		Hair hair=new Hair();
		System.out.println("default values");
		System.out.println("hair color: "+hair.color);
		System.out.println("hair length: "+hair.length);
		System.out.println("hair hairType: "+hair.hairType);
		System.out.println("hair strength: "+hair.strength);
		
		hair.color="Brown";
		hair.length="long";
		hair.hairType="Curly";
		hair.strength="strong";
		
		System.out.println("\nupdated values");
		System.out.println("hair color: "+hair.color);
		System.out.println("hair length: "+hair.length);
		System.out.println("hair hairType: "+hair.hairType);
		System.out.println("hair strength: "+hair.strength);
	}
	
}