class JamunRunner{
	String taste;
	int cost;
	int weight;
	String color;

	public static void main(String[] args){
		Jamun jamun=new Jamun();
		System.out.println("default values");
		System.out.println("jamun taste: "+jamun.taste);
		System.out.println("jamun cost: "+jamun.cost);
		System.out.println("jamun weight: "+jamun.weight);
		System.out.println("jamun season: "+jamun.season);
		
		jamun.taste="sour";
		jamun.cost=60;
		jamun.weight=1;
		jamun.season="Monsoon";
		
		System.out.println("\nupdated values");
		System.out.println("jamun taste: "+jamun.taste);
		System.out.println("jamun cost: "+jamun.cost);
		System.out.println("jamun weight: "+jamun.weight);
		System.out.println("jamun season: "+jamun.season);
		
	}
}