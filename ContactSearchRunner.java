class ContactSearchRunner{
	public static void main(String... args){
		
		//getMobileByEmail
		
		String email="sonalvinodkarma@gmail.com";
		long contact1=ContactSearch.getMobileByEmail(email);
		System.out.println("contact: "+contact1);
		
		long contact2=ContactSearch.getMobileByEmail("sonalacharya911@gmail.com");
		System.out.println("contact: "+contact2);
		
		long contact3=ContactSearch.getMobileByEmail("vidya.karma@gmail.com");
		System.out.println("contact: "+contact3);
		
		long contact4=ContactSearch.getMobileByEmail("saahilvinod802@gmail.com");
		System.out.println("contact: "+contact4);
		
		long contact5=ContactSearch.getMobileByEmail("angelinarachel@gmail.com");
		System.out.println("contact: "+contact5);
		
		long contact6=ContactSearch.getMobileByEmail("aldrinasara@gmail.com");
		System.out.println("contact: "+contact6);
		
		long contact7=ContactSearch.getMobileByEmail("padminisachar@gmail.com");
		System.out.println("contact: "+contact7);
		
		long contact8=ContactSearch.getMobileByEmail("nikithanarayansaka@gmail.com");
		System.out.println("contact: "+contact8);
		
		long contact9=ContactSearch.getMobileByEmail("krishnaveni@gmail.com");
		System.out.println("contact: "+contact9);
		
		long contact10=ContactSearch.getMobileByEmail("mahalakshmiph@gmail.com");
		System.out.println("contact: "+contact10);
		
		long contact11=ContactSearch.getMobileByEmail("hemaacharya@gmail.com");
		System.out.println("contact: "+contact11);
		
		long contact12=ContactSearch.getMobileByEmail("nageshskumbar@gmail.com");
		System.out.println("contact: "+contact12);
		
		long contact13=ContactSearch.getMobileByEmail("rkamalraj@rediffmail.com");
		System.out.println("contact: "+contact13);
		
		long contact14=ContactSearch.getMobileByEmail("soninaveenkumar@gmail.com");
		System.out.println("contact: "+contact14);
		
		long contact15=ContactSearch.getMobileByEmail("soundaryatj@gmail.com");
		System.out.println("contact: "+contact15);
		
		long contact16=ContactSearch.getMobileByEmail("sonamkapoor@gmail.com");
		System.out.println("contact: "+contact16);
		
		//get email from name
		
		String email1=ContactSearch.getEmailByName("Sonal");
		System.out.println(email1);
		
		String email2=ContactSearch.getEmailByName("Saahil");
		System.out.println(email2);
		
		String email3=ContactSearch.getEmailByName("Vinod");
		System.out.println(email3);
		
		String email4=ContactSearch.getEmailByName("Vidya");
		System.out.println(email4);
		
		String email5=ContactSearch.getEmailByName("Angel");
		System.out.println(email5);
		
		String email6=ContactSearch.getEmailByName("Aldrina");
		System.out.println(email6);
		
		String email7=ContactSearch.getEmailByName("Padmini");
		System.out.println(email7);
		
		String email8=ContactSearch.getEmailByName("Nikitha");
		System.out.println(email8);
		
		String email9=ContactSearch.getEmailByName("Mahalakshmi");
		System.out.println(email9);
		
		String email10=ContactSearch.getEmailByName("Krishnaveni");
		System.out.println(email10);
		
		String email11=ContactSearch.getEmailByName("Hema");
		System.out.println(email11);
		
		String email12=ContactSearch.getEmailByName("Nagesh");
		System.out.println(email12);
		
		String email13=ContactSearch.getEmailByName("Kamal");
		System.out.println(email13);
		
		String email14=ContactSearch.getEmailByName("Soni");
		System.out.println(email14);
		
		String email15=ContactSearch.getEmailByName("Soundarya");
		System.out.println(email15);
		
		String email16=ContactSearch.getEmailByName("Sonam");
		System.out.println(email16);
		
		//searching by last name
		
		
				
		String[] lname1=ContactSearch.searchByLastName("Kapoor");
		for(String name:lname1){
			System.out.println(name);
		}
		
		
		String[] lname2=ContactSearch.searchByLastName("Sharma");
		for(String name:lname2){
			System.out.println(name);
		}
		
		
		String[] lname3=ContactSearch.searchByLastName("Shetty");
		for(String name:lname3){
			System.out.println(name);
		}
		

	}
}