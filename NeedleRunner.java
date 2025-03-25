class NeedleRunner{
	public static void main(String[] args){
		Needle needle1=new Needle();
		Needle needle2=new Needle();
		
		System.out.println(needle1.x);
		
		needle2.x=10;
		
		System.out.println(needle2.x); 
		System.out.println(needle1.x);
		
	}
}


