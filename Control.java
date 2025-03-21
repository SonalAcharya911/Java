class Control{
	public static void main(String[] args){
		int a=2;
		int b=10;
		char op= '+';
		boolean flag=true;
		//if
		if(a==2){
			System.out.println("a is 2");
		}
		
		//if-else
		if(b%2==0){
			System.out.println("b is even");
		}
		else
		{
			System.out.println("b is odd");
		}
		
		//while
		while(flag){
			System.out.println("while runs");
			flag=false;
		}
	
		//for
		System.out.println("for loop");
		for(a=3;a<=b;a++){
			System.out.println(a);
		}
		
		//switch
		switch(op){
			case '+': System.out.println(a+b);
					break;
			case '-': System.out.println(a-b);
					break;
			default: System.out.println("invalid");
		}
	}
}