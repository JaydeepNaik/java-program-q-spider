import java.util.Scanner;
class Q9EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter Number  : ");
		int num = new Scanner(System.in).nextInt();
		//boolean res = num/2==num/2.0;
		boolean res = num%2==0;
		System.out.print(res);
	}
}
