package Question1;

public class HumiditySensor implements ISensor {

	String sName;
	public HumiditySensor(String sName) {
		this.sName=sName;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("RainFall sensor switch on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("RainFall sensor switch off");
	}

	
	
}
