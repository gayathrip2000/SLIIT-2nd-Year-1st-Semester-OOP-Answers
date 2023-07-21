package Question2;

public class Student implements IPerson {
	
	String studentID;
	int grade;

	public Student(String studentID,int grade) {
		super();
		this.studentID = studentID;
		this.grade=grade;
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		return "Student = " +studentID+ "Grade = " +grade;
	}
	
	

}
