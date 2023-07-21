package Question2;

public class Lecturer implements IPerson {
	
	String employeeID;
	String depatment;
	
	
	public Lecturer(String employeeID, String depatment) {
		super();
		this.employeeID = employeeID;
		this.depatment = depatment;
	}


	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		return "Lecturer = " +employeeID+ "Department = " +depatment;
	}
	
	

}
