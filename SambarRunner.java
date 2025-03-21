class SambarRunner{
	public static void main(String... args){
		String[] veggies=Sambar.vegetables();
		for(String veggie:veggies){
			System.out.println(veggie);
		}
		
		int quantity=Sambar.quantity();
		System.out.println(quantity);
		
		boolean hot=Sambar.hot();
		if(hot){
			System.out.println("Sambar is hot");
		}
		else{
			System.out.println("Sambar is cold");
		}
		
		boolean taste=Sambar.good();
		if(taste){
			System.out.println("Sambar is good");
		}
		else{
			System.out.println("Sambar is bad");
		}
		
	}
}