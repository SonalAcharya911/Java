class VarScope{
	static int age=21; //static??
	public static void main(String[] args){
		System.out.println("inside main\n"+age); 
		
		{
			int hours=22;
			int minutes=25;
			System.out.println("inner scope hours "+hours);
			System.out.println("inner scope minutes "+minutes);
		}
		
		//System.out.println(minutes);
		//System.out.println("integer hours"+hours);
		String hours="22:25";
		System.out.println("new Hours "+hours);
		
	}
	//System.out.println(age);
} 