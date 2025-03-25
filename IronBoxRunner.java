class IronBoxRunner{
	public static void main(String[] args){
		IronBox ironBox=new IronBox();
		
		System.out.println("default values");
		System.out.println("ironBox heatTime: "+ironBox.heatTime);
		System.out.println("ironBox spray present: "+ironBox.spray);
		System.out.println("ironBox weight: "+ironBox.weight);
		System.out.println("ironBox powerConsumption: "+ironBox.powerConsumption);
		
		ironBox.heatTime=30;
		ironBox.spray=true;
		ironBox.weight=1;
		ironBox.powerConsumption=750;
		
		System.out.println("\nupdated values");
		System.out.println("ironBox heatTime: "+ironBox.heatTime);
		System.out.println("ironBox spray present: "+ironBox.spray);
		System.out.println("ironBox weight: "+ironBox.weight);
		System.out.println("ironBox powerConsumption: "+ironBox.powerConsumption);

	}
}