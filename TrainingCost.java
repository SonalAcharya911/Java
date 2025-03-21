class TrainingCost{
	public static void costOf(Courses course){
		System.out.println("running costOf in TrainingCost");
		if(course==Courses.MACHINE_LEARNING){
			System.out.println(course+" costs Rs.12000");
		}
		else if(course==Courses.SOFTWARE_TESTING){
			System.out.println(course+" costs Rs.19000");
		}
		else if(course==Courses.SQL){
			System.out.println(course+" costs Rs.25000");
		}
		else if(course==Courses.JAVA_SCRIPT){
			System.out.println(course+" costs Rs.15000");
		}
		else if(course==Courses.WEB_DEVELOPMENT){
			System.out.println(course+" costs Rs.30000");
		}
		else if(course==Courses.python){
			System.out.println(course+" costs Rs.30000");
		}
		else{
			System.out.println(course+" not available");
		}
	}
}