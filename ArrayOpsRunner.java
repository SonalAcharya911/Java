import java.util.Arrays;
class ArrayOpsRunner{
	public static void main(String[] args){
		int[] marks={94,92,90,96,98,91,97,99,93,95};
		int[] numArray={0,0,0,0,0,0,0,0,0,0};
		
		Arrays.sort(marks);
		for(int i=0;i<marks.length;i++){
			System.out.print(" "+marks[i]);
		}
		
		System.out.println("\nworks");
		int res= Arrays.binarySearch(marks,91);
		System.out.println(res);
		
		int[] copy=Arrays.copyOf(marks,15);
		for(int i=0;i<copy.length;i++){
			System.out.print(" "+copy[i]);
		}
		System.out.println("\n");
		Arrays.fill(numArray,100);
		for(int i=0;i<numArray.length;i++){
			System.out.print(" "+numArray[i]);
		}
	}
}


