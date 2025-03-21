class Array{
	//static int[] marks={90,91,92,93,94,95,96,97,98,99};
	static int index=0;
	
	public static void reverseArray(int[] array){
		System.out.println("running reverseArray in Array");
		int[] array2={0,0,0,0,0,0,0,0,0,0,0};
		System.out.println("before reversing");
		for(index=0;index<array.length;index++){
			System.out.println(array[index]);
		}
		int index2=0;
		for(index=(array.length-1);index>=0;index--){
			
			array2[index2]=array[index];
			index2++;
		}
		
		System.out.println("after reversing");
		array=array2;
		for(index=0;index<array.length;index++){
			System.out.println(array[index]);
		}
	}
	
	public static void checkNum(int[] array,int arrNum){
		System.out.println("running checkNum in Array");
		boolean isThere=true;
		for(index=0;index<array.length;index++){
			if(array[index]==arrNum){
				isThere=true;
				break;
			}
			else{
				isThere=false;
			}
		}
		if(isThere==true){
			System.out.println(arrNum+" found at index "+index);
		}
		else{
			System.out.println("target number not found");
		}
	}
	
	public static void displaySum(int[] array){
		System.out.println("running displaySum in Array");
		int sum=0;
		for(index=0;index<array.length;index++){
			sum=sum+array[index];
		}
		System.out.println("Sum of Array is: "+sum);
	}
	
	public static void eoCount(int[] array){
		System.out.println("running eoCount in Array");
		int evenCount=0;
		int oddCount=0;
		for(index=0;index<array.length;index++){
			if(array[index]%2==0){
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
		System.out.println("even numbers count= "+evenCount);
		System.out.println("odd numbers count= "+oddCount);
	}
	
	public static int factorial(int element){
		int fact=0;
		if(element==0||element==1){
			return fact=1;
		}
		else{
			return fact=element*factorial(element-1);
		}
	}
	
}