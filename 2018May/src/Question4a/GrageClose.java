package Question4a;

 class GrageClose implements Command{

	 GarageGate grageclose;
	 
	 
	public GrageClose(GarageGate grageclose) {
		this.grageclose = grageclose;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
			grageclose.close();
	}

}
