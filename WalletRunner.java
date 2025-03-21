class WalletRunner{
	public static void main(String[] args){
		String item1="Money";
		String item2="Photo";
		String item3="Cards";
		String item4="Coins";
		String item5="Gum";
		
		String[] walletItems={item1,item2,item3,item4,item5};
		
		for(int index=0;index<5;index++){
			System.out.println(walletItems[index]);
		}
	}
}