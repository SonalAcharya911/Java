class CourseRunner{
	public static void main(String[] args){
		
		Courses course1=Courses.MACHINE_LEARNING;
		Courses course2=Courses.SOFTWARE_TESTING;
		Courses course3=Courses.WEB_DEVELOPMENT;
		Courses course4=Courses.SQL;
		Courses course5=Courses.JAVA_SCRIPT;
		Courses course6=Courses.AI;
		Courses course7=Courses.python;
		
		TrainingCost.costOf(course1);
		TrainingCost.costOf(course2);		
		TrainingCost.costOf(course3);
		TrainingCost.costOf(course4);
		TrainingCost.costOf(course5);
		TrainingCost.costOf(course6);
		TrainingCost.costOf(course7);
		//TrainingCost.costOf("Science");
	}
}