package Question4;

public class UndergraduateStudents extends Students{

	
	public  UndergraduateStudents() {
		
	}
	
	
	@Override
	void dsiplayCost() {
		// TODO Auto-generated method stub
		System.out.println("Cost for the Undergraduate program is  " +ipro.getCost());
	}
	void displayStudents() {
		// TODO Auto-generated method stub
		offerPrograms();
		conductEvents();
		dsiplayCost();
		System.out.println("Display Under graduate students");
		
	}

	
	

}
