class AnchorRunner{
	public static void main(String[] args){
		Anchor anchor=new Anchor();
		
		System.out.println("default values");
		System.out.println("anchor communication skills: "+anchor.commSkills);
		System.out.println("anchor confidence level: "+anchor.confidence);
		System.out.println("anchor engagement: "+anchor.engagement);
		System.out.println("language spoken by anchor: "+anchor.langSpoken);
				
		anchor.commSkills="Excellent";
		anchor.confidence="High";
		anchor.engagement="Moderate Interaction";
		anchor.langSpoken="English";
		
		System.out.println("\n updated values");
		System.out.println("anchor communication skills: "+anchor.commSkills);
		System.out.println("anchor confidence level: "+anchor.confidence);
		System.out.println("anchor engagement: "+anchor.engagement);
		System.out.println("language spoken by anchor: "+anchor.langSpoken);
	}
	
}