class CricketRunner{
	public static void main(String[] args){
		String[] playerNames={"Virat","ABD"};
		int[] scores={4000,3500};
		
		int[] numOfMatches={100,70};
		Cricket.match_details("Tuesday",playerNames);
		
		Cricket.match_details("Virat",150,7000);
		Cricket.match_details(playerNames,scores,numOfMatches);
	}
}