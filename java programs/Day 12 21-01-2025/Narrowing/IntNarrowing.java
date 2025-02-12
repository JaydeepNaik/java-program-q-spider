class IntNarrowing 
{
	public static void main(String[] args) 
	{
		int a = 4343343;
	
		short e = (short)a;
		System.out.println(e);//17967
		char f = (char)a;
		System.out.println(f);//?
		byte g = (byte)a;
		System.out.println(g);

	}
}
