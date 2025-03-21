class Coin{
	public static void main(String[] args){
		String coin1="25 paise";
		String coin2="50 paise";
		String coin3="1 rupee";
		String coin4="2 rupee";
		String coin5="5 rupee";
		
		String[] coins={coin1,coin2,coin3,coin4,coin5};
		
		for(String coin: coins){
			System.out.println(coin);
		}
	}
}