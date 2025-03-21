class Cricket{
	public static void match_details(String dayName,String... playerNames){
		System.out.println("running match_details in Cricket");
		for(String player:playerNames){
			System.out.println(player+" plays on "+dayName);
		}
	}
	
	public static void match_details(String playerName, int numOfMatches,int totalRuns){
		float avgScore=totalRuns/numOfMatches;
		System.out.println("Average runs scored by "+playerName+" is "+avgScore);
	}
	
	public static void match_details(String[] playerNames,int[] scores, int[] numOfMatches){
		for(int i=0;i<playerNames.length;i++){
			float avgScore=(scores[i]/numOfMatches[i]);
			System.out.println("Average runs scored by "+playerNames[i]+" is "+avgScore);
		}
	}
	
}