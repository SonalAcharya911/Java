class Molecule{
	/* public static void arrRotate(int[] arr){
		int temp=0;
		int i=0;
		
		temp=arr[i];
			for(i=1;i<arr.length;i++){
				arr[i-1]=arr[i];
			}
		arr[arr.length-1]=temp;
		
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		} */
		/*
		for(int j=1;j<arr.length;j++){
			temp=arr[j-1];
			for(int i=1;i<arr.length;i++){
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
		*/
		public static void arrRotate(int[] arr){
		int temp=0;
		int i=0;
		
		temp=arr[arr.length-1];
			for(i=arr.length-2;i>=0;i--){
				arr[i+1]=arr[i];
			}
		arr[0]=temp;
		
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
	}
	public static void secondLeast(int[] arr){
		int least=0;
		/*for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					least=arr[i];
				}
			}
		}
		*/
		least=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<least){
				least=arr[i];
			}
		}
		System.out.println(least);
		 		
	}
	public static void miss(){
		int[] arr={1,2,3,4,6,8,10};
		int j=0;
		int flag=0;
		for(j=0;j<10;j++){
			if(j==arr[j]){
				flag=0;
			}
			
		}
		if(flag==1){
			System.out.println(j);
		}
	}		
}
	
	/* public static void miss(){
		int[] arr={1,2,3,4,6,8,10};
		int i=0;
		int flag=0;
		for(int j=0;j<arr.length;j++){
			for(i=1;i<=10;i++){
				if(i!=arr[j]){					
					break;
				}
			}
			if(flag==1){
				System.out.println(i+" not found");
			}
		}		
	} */
	