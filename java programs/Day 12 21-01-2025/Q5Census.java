class Q5Census 
{
	public static void main(String[] args) 
	{
		long curPol = 312032486;
		final long seconds = (365*24*60*60);
		long birth = seconds/7;
		long death = seconds/13;
		long imm = seconds/45;

		long newPop = curPol+birth-death+imm;
		System.out.println("Current Population : "+curPol);
		System.out.println("New Population : "+newPop);
	}
}
