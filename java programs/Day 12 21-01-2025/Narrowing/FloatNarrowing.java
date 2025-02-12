class FloatNarrowing 
{
	public static void main(String[] args) 
	{
		float a = 2343434.0f;
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
