class WireRunner{
	public static void main(String[] args){
		int wire1=1;
		int wire2=3;
		int wire3=5;
		int wire4=7;
		int wire5=9;
		
		int[] wires={wire1, wire2, wire3, wire4, wire5};
		
		for(int index=0;index<5;index++){
			System.out.println(wires[index]);
		}
	}
}