import java.util.Scanner;
class Q46SumOfEvenOddDigits
{
	public static void main(String[] args) 
	{
		System.out.println(" Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		
		boolean flag = false;
		int temp = num;
		int rem = 0, even =0, odd = 0;
		if(num<0)
		{
			num = Math.abs(num);
			flag=true;
		}
		while(num>0)
		{

			rem = num%10;
			if(rem%2==0)
			{
				even+=rem;
			}
			if(rem%2!=0)
			{
				odd+=rem;
			}
			num /= 10;
		}
		if(flag)
		{
			rev=-rev;
		}
		System.out.println("\nNumber : "+temp+"\nEven Sum : "+even+"\nOdd Sum : "+odd);
	}
}
