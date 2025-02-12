import java.util.Scanner;
class Q10EvenOddWithoutUsingModulus 
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter Number  : ");
		int num = new Scanner(System.in).nextInt();
		boolean res = num/2==num/2.0;
		System.out.print("\nUsing 1st formula : "+res);

		boolean res2 = (num/2)*2==num;
		System.out.print("\nUsing 2nd Formula : "+res2);

	}
}
