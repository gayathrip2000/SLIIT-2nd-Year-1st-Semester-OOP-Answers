
package Question1;

public class Pet implements PointAllocator{

	private int point;
	public Pet() {
		
	}
	public void setpoint(int point) {
		// TODO Auto-generated method stub
		this.point=point;
	}

	@Override
	public int getpoint() {
		// TODO Auto-generated method stub
		return this.point;

	}
	
	public void feed() {
		
	};
	public void clean() {
		
	};
	public void cuddle() {
		
	};
	public void GetTotalPoints() throws CaughtException {};


	
}
