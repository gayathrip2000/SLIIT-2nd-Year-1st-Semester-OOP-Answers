package Question4a;

public class GrageOpen implements Command{
	 	
		GarageGate grageopen;
	 
	 
		public GrageOpen(GarageGate grageopen) {
			this.grageopen = grageopen;
		}

	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		grageopen.open();
	}

}
