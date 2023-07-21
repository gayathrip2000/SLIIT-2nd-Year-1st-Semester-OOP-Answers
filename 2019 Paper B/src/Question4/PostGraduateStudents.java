package Question4;

public class PostGraduateStudents extends  Students{
	

	public PostGraduateStudents() {
		
	}
	
	@Override
	void displayStudents() {
		// TODO Auto-generated method stub
		offerPrograms();
		conductEvents();
		dsiplayCost();
		System.out.println("Display Post graduate students");
	}

	@Override
	void dsiplayCost() {
		// TODO Auto-generated method stub
		System.out.println("Cost for postgraduate program is "+ipro.getCost());
	}
	}


