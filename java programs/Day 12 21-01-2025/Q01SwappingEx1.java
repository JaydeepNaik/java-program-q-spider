class Q1SwappingEx1 
{
	public static void main(String[] args) 
	{
		int a = 2; 
		int b =4;
		System.out.println("Before Swapping");
		System.out.println("a : "+a+" b : "+b);
		int temp = a;
		a = b ;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("a : "+a+" b : "+b);
	}
}
