package Question3;

public class Engineer implements IEmployee{

	String employeeID;
	String company;
	
	
	public Engineer(String employeeID, String company) {
		super();
		this.employeeID = employeeID;
		this.company = company;
	}




	@Override
	public String showEmployeeDetails() {
		// TODO Auto-generated method stub
		return " Engineer = "  +employeeID+ "  Company ="    +company ;
	}

}
