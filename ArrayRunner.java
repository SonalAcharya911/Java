class ArrayRunner{
	public static void main(String[] args){
		System.out.println("main");
		int[] marks={90,91,92,93,94,95,96,97,98,99,100};
		int[] num={3,2,5,8,1,0,4,9,11,24,12,20};
		
		Array.reverseArray(marks);
		
		System.out.println("\n");
		
		Array.checkNum(marks,91);
		
		System.out.println("\n");
		
		Array.displaySum(marks);
		
		System.out.println("\n");
		
		Array.eoCount(marks);
		
		System.out.println("\n");
		
		System.out.println(Array.factorial(7));
		
		for(int index=0;index<num.length;index++){
			int res=Array.factorial(num[index]);
			System.out.println(res);
		}
	}
}