class Tablet{
	public static void dissolve(String tabName,int time){
		System.out.println("running dissolve in Tablet");
		
		System.out.println(tabName+"dissolves in "+time+" minutes");
	}
	
	public static void cure(String tabName,String disease){
		System.out.println("running cure in Tablet");
		System.out.println(tabName+" cures "+disease);
	}
	
	public static void killThePain(String tabName,boolean killPain){
		System.out.println("running killThePain in Tablet");
		if(killPain==true){
			System.out.println(tabName+" kills pain");
		}
		else{
			System.out.println("tablet does not kill pain");
		}
	}
	
	public static void react(String tabName,int time){
		System.out.println("running react in Tablet");
		System.out.println(tabName+" reacts within "+time+" minutes");
	}
}