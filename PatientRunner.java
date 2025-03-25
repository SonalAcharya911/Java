class PatientRunner{
	public static void main(String[] args){
		Patient patient=new Patient();
		System.out.println("default values");
		System.out.println("patient age: "+patient.age);
		System.out.println("patient medical Condition: "+patient.medicalCondition);
		System.out.println("patient bloodType: "+patient.bloodType);
		System.out.println("patient doctor: "+patient.doctor);
		
		patient.age=40;
		patient.medicalCondition="Diabetes";
		patient.bloodType='O';
		patient.doctor="Endocrinologist";
		
		System.out.println("\nupdated values");
		System.out.println("patient age: "+patient.age);
		System.out.println("patient medical Condition: "+patient.medicalCondition);
		System.out.println("patient bloodType: "+patient.bloodType);
		System.out.println("patient doctor: "+patient.doctor);
		
	
	}
	
}