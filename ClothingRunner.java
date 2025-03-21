public class ClothingRunner{
	public static void main(String[] values){
		Clothing.addCloth("Saree");
		Clothing.addCloth("Frock");
		Clothing.addCloth("Kurti");
		Clothing.addCloth("Jeans");
		Clothing.addCloth("Socks");
		Clothing.addCloth("Jacket");
		System.out.println("before deleting");
		Clothing.display();
		
		Clothing.search("Frock");
		//Clothing.search("Sweater");
		
		
		Clothing.delete("Frock");
		System.out.println("after deleting");
		Clothing.display();
		Clothing.update("Kurti","Jacket");
		System.out.println("\n\n after update");
		Clothing.display();
		
		
	}
}