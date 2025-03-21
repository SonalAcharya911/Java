class WallRunner{
	public static void main(String[] args){
		String wall1="cement wall";
		String wall2="brick wall";
		String wall3="Concrete wall";
		String wall4="Stone wall";
		String wall5="Glass wall";
		
		String[] walls={wall1,wall2,wall3,wall4,wall5};
		
		for(int index=0;index<5;index++){
			System.out.println(walls[index]);
		}
	}
}