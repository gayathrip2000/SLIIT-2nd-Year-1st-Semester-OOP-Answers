package Question4a;

public class MobileUI {
	
	Command Command[];

	
	public MobileUI() {
		this.Command = new Command[6];
	}


	public void setCommand(int index, Command cmdObj) {
		
		Command[index] = cmdObj;
		
	}

	public void commmandPressed(int index) {
		Command[index].execute();
	}
	
}
