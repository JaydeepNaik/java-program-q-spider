import java.util.Scanner;
class PractiseReverseNumberUsingLoops
{
	public static void main(String[] args) 
	{
		System.out.println(" Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		
		boolean flag = false;
		int temp = num;
		if(num<0)
		{
			num = Math.abs(num);
			flag=true;
		}
		int rev = 0;
		int rem = 0; 
		int sum = 0;
		int even =0;
		int odd = 0;
		while(num>0)
		{

			rem =num%10;
			if(rem%2==0)
			{
				even+=rem;
			}
			if(rem%2!=0)
			{
				odd+=rem;
			}
			rev =(rev*10)+ rem ;
			sum +=rem;
			num /= 10;
		}
		if(flag)
		{
			rev=-rev;
		}
		System.out.println("\nNumber : "+temp+"\nReversed Num : "+rev+"\nSum Of Digits : "+sum+"\nEven Sum : "+even+"\nOdd Sum : "+odd);
	}
}
