class Printer{   
	public static void main(String args[]){
		
		System.out.println("");
		
		String[] strings={"buyerName","buyerPhone","costPrice","loc","pin"};
		
		
		String[] items={"Bolt","Cam","Hasp", "Spring","Sliding"};
		String[] glassSellers = {"Thindlu Main Road", "Main Road", "Avenue Road", "Mysore Road", "Horamavu Agara Main Road"};

		
		int[] nums={101, 102, 103, 104, 105};
		int[] prices={560097, 560093, 560002, 560026, 560043};
		float[] digits={3000.50f,5000.75f,7500.25f,12000.99f,15000.49f};
		
		for(int i=0;i<5;i++){
			System.out.print("Glass.seller(");
			for(int j=0;j<5;j++){
			System.out.print(strings[j]+(i+1)+",");
			}
			System.out.print(");");
			System.out.print("\n");
		}
		
		/*
		for(int i=0;i<5;i++){
		System.out.println("String loc"+(i+1)+"=\""+glassSellers[i]+"\";");
		}
		
		for(int i=0;i<5;i++){
		System.out.println("int pin"+(i+1)+"="+prices[i]+";");
		}
		*/
		
		/*
		for(String item:items){
			System.out.print("System.out.println(\""+item+": \"+"+item+");");
		}
		*/
	}
}

 