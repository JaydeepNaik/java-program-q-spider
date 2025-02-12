class Q2SwappingEx2 
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 4;
		System.out.println("Before Swapping");
		System.out.println("a : "+a+" b : "+b);
		b = a+b;
		a = b-a;
		b = b-a;
		System.out.println("After Swapping");
		System.out.println("a : "+a+" b : "+b);
		//a = a+b 2+4=6 
		//b = a-b 6-4=2
		//a = a-b 6-2=4
	}
}
