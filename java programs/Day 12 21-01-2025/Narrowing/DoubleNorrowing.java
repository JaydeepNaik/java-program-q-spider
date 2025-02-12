class DoubleNorrowing 
{
	public static void main(String[] args) 
	{
		double a = 2343434.0;
		float b = (float) a;
		System.out.println(b);//2343434.0
		long c = (long) a;
		System.out.println(c);//2343434
		int d = (int) a;
		System.out.println(d);//2343434
		short e = (short)a;
		System.out.println(e);//-15862
		char f = (char)a;
		System.out.println(f);//?
		byte g = (byte)a;
		System.out.println(g);//10

	}
}
