class ShortNarrowing 
{
	public static void main(String[] args) 
	{
		short a = 32000;
		char f = (char)a;
		System.out.println(f);//?
		byte g = (byte)a;
		System.out.println(g);//0
	}
}
