package Question3;

public class Manager implements IEmployee {
	
	String managerID;
	double salary;
	
	
	public Manager(String managerID, double salary) {
		super();
		this.managerID = managerID;
		this.salary = salary;
	}


	@Override
	public String showEmployeeDetails() {
		// TODO Auto-generated method stub
		return "Manager id =   " +managerID+   " Salary ="  +salary;
	}
	
	

}
