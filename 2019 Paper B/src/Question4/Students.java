package Question4;

public abstract class Students {
	
	IFestival ifes;
	IPrograms ipro;
	double cost;
	
	public void setFestival(IFestival ifes) {
		this.ifes=ifes;
	}
	
	public void setPrograms(IPrograms ipro) {
		this.ipro=ipro;
	}
	
	
	public void offerPrograms() {
		ipro.offerPrograms();
		
	}
	
	public void conductEvents() {
		ifes.performEvent();
	}

	abstract void displayStudents();
	abstract void dsiplayCost();
	
}
