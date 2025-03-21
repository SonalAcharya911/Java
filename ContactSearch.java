import java.lang.String;
class ContactSearch{
	public static long getMobileByEmail(String email){
		System.out.println("running getMobileByEmail in ContactSearch");
		long contact=0;
		if(email=="sonalacharya911@gmail.com"){
			contact=7483420737L;
			System.out.println("for email: "+email);
			return contact;
		}
		else if(email=="sonalvinodkarma@gmail.com"){
			System.out.println("for email: "+email);
			contact=9739257715L;
			return contact;
		}
		else if(email=="vidya.karma@gmail.com"){
			System.out.println("for email: "+email);
			contact=9740126919L;
			return contact;
		}
		else if(email=="saahilvinod802@gmail.com"){
			System.out.println("for email: "+email);
			contact=8970910517L;
			return contact;
		}
		else if(email=="angelinarachel@gmail.com"){
			System.out.println("for email: "+email);
			contact=8796346278L;
			return contact;
			
		}
		else if(email=="aldrinasara@gmail.com"){
			System.out.println("for email: "+email);
			contact=7406508813L;
			return contact;
		}
		else if(email=="padminisachar@gmail.com"){
			System.out.println("for email: "+email);
			contact=9876543210L;
			return contact;
		}
		else if(email=="nikithanarayansaka@gmail.com"){
			System.out.println("for email: "+email);
			contact=8976543210L;
			return contact;
		}
		else if(email=="krishnaveni@gmail.com"){
			System.out.println("for email: "+email);
			contact=7896543210L;
			return contact;			
		}
		else if(email=="mahalakshmiph@gmail.com"){
			System.out.println("for email: "+email);
			contact=8790612334L;
			return contact;
		}
		else if(email=="hemaacharya@gmail.com"){
			System.out.println("for email: "+email);
			contact=7681234597L;
			return contact;
		}
		else if(email=="nageshskumbar@gmail.com"){
			System.out.println("for email: "+email);
			contact=7980123456L;
			return contact;
		}
		else if(email=="rkamalraj@rediffmail.com"){
			System.out.println("for email: "+email);
			contact=9591954310L;
			return contact;			
		}
		else if(email=="soninaveenkumar@gmail.com"){
			System.out.println("for email: "+email);
			contact=9876012345L;
			return contact;
		}
		else if(email=="soundaryatj@gmail.com"){
			System.out.println("for email: "+email);
			contact=7891234560L;
			return contact;
		}
		else{
			System.out.println("contact not found for this email..");
		}
		return contact;
	}
	
	public static String getEmailByName(String name){
		System.out.println("running getEmailByName in ContactSearch");
		String email="";
		if(name=="Sonal"){
			System.out.println("email ID for "+name+" is ");
			email="sonalacharya911@gmail.com";
			return email;
		}
		else if(name=="Saahil"){
			System.out.println("email ID for "+name+" is ");
			email="saahilvinod802@gmail.com";
			return email;
		}
		else if(name=="Vinod"){
			System.out.println("email ID for "+name+" is ");
			email="pvinodkumar020307@gmail.com";
			return email;
		}
		else if(name=="Vidya"){
			System.out.println("email ID for "+name+" is ");
			email="vidya.karma@gmail.com";
			return email;
		}
		else if(name=="Angel"){
			System.out.println("email ID for "+name+" is ");
			email="angelinarachel@gmail.com";
			return email;
		}
		else if(name=="Aldrina"){
			System.out.println("email ID for "+name+" is ");
			email="aldrinasara@gmail.com";
			return email;
		}
		else if(name=="Padmini"){
			System.out.println("email ID for "+name+" is ");
			email="padminisachar@gmail.com";
			return email;
		}
		else if(name=="Nikitha"){
			System.out.println("email ID for "+name+" is ");
			email="nikithanarayansaka@gmail.com";
			return email;
		}
		else if(name=="Mahalakshmi"){
			System.out.println("email ID for "+name+" is ");
			email="mahalakshmiph@gmail.com";
			return email;
		}
		else if(name=="Krishnaveni"){
			System.out.println("email ID for "+name+" is ");
			email="krishnaveni@gmail.com";
			return email;
		}
		else if(name=="Hema"){
			System.out.println("email ID for "+name+" is ");
			email="hemaacharya@gmail.com";
			return email;
		}
		else if(name=="Nagesh"){
			System.out.println("email ID for "+name+" is ");
			email="nageshskumbar@gmail.com";
			return email;
		}
		else if(name=="Kamal"){
			System.out.println("email ID for "+name+" is ");
			email="rkamalraj@rediffmail.com";
			return email;
		}
		else if(name=="Soni"){
			System.out.println("email ID for "+name+" is ");
			email="soninaveenkumar@gmail.com";
			return email;
		}
		else if(name=="Soundarya"){
			System.out.println("email ID for "+name+" is ");
			email="soundaryatj@gmail.com";
			return email;
		}
		else{
			System.out.println("email not found for "+name);
		}
		return email;
	}
	
	public static String[] searchByLastName(String lastName){
		System.out.println("running searchByLastName in ContactSearch");
		
		String name1="Kareena Kapoor";
		String name2="Karishma Kapoor";
		String name3="Ranbir Kapoor";
		String name4="Anil Kapoor";
		String name5="Sonam Kapoor";
		String name6="Rohit Sharma";
		String name7="Anushka Sharma";
		String name8="Kapil Sharma";
		String name9="Sneha Sharma";
		String name10="Bhavana Sharma";
		String name11="Suneil Shetty";
		String name12="Shilpa Shetty";
		String name13="Athiya Shetty";
		String name14="Soundarya Shetty";
		String name15="Keerthi Shetty";
		
		String[] names={name1,name2,name3,name4,name5,name6,name7, name8, name9,name10,name11,name12, name13, name14, name15};
		String[] newArr={"","","","",""};
		int i=0;
		for(int j=0;j<newArr.length;){
			if(names[i].endsWith(lastName)){
				newArr[j]=names[i];
				j++;
			}
			i++;
		}
		return newArr;
	}
}