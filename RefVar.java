class RefVar{
	public static void main(String[] args){
		byte age=21;
		byte years=18;
		age=years;
		System.out.println(age);
		
		short marks=90;
		short score=65;
		marks=score;
		System.out.println(marks);
		
		int doorNo=205;
		int roomNo=307;
		doorNo=roomNo;
		System.out.println(doorNo);
		
		long phNo=7406508813L;
		long contact=9739257715L;
		contact=phNo;
		System.out.println(contact);
		
		float distance=13.4f;
		float displacement=10.5f;
		distance=displacement;
		System.out.println(distance);
		
		double salary=25000;
		double income=30000;
		salary=income;
		System.out.println(salary);
		
		
		boolean marker=true;
		boolean flag=false;
		flag=marker;
		System.out.println(flag);
		
		char section='A';
		char division='B';
		division=section;
		System.out.println(division);
		
		String bookName="Othello";
		String title="A midnight Summer's Dream";
		title=bookName;
		System.out.println(title);
	}
	
}