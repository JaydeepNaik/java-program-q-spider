import java.util.Scanner;
class Q19PrimeNumber 
{
	public static void main(String[] args) 

	{
		boolean flag = true;
		while(flag)
		{
			System.out.println("Enter No. Between 1 to 25 : ");
			int num = new Scanner(System.in).nextInt();
			System.out.println((num==1?num+" Is Prime":(num==2 || num==3 || num==5)?(num+" Is Prime"):(num%2==0 || num%5==0 ||num%3==0 ?(num+" Is Not Prime"):(num+" Is Prime"))));
		}
	}
}
