class Glass{
	public static void seller(String sellerName,int sellerID, int sellingPrice, String location, int pinCode){
		System.out.println("running seller in Glass");
		System.out.println("Seller Name: "+sellerName);
		System.out.println("Seller ID: "+sellerID);
		System.out.println("Selling Price: "+sellingPrice);
		System.out.println("Seller location: "+location);
		System.out.println("Seller Pin Code: "+pinCode);
	}
	
	public static void buyer(String buyerName,int buyerPhone, int costPrice, String location, int pinCode){
		System.out.println("running buyer in Glass");
		System.out.println("Buyer Name: "+buyerName);
		System.out.println("Buyer Phone Number: "+buyerPhone);
		System.out.println("Cost Price: "+costPrice);
		System.out.println("Buyer Address: "+location);
		System.out.println("Buyer Pin Code: "+pinCode);
	}
}