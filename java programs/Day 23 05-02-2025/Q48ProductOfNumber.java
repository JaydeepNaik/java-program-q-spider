import java.util.Scanner;
class Q48ProductOfNumber
{
	public static void main(String[] args) 
	{
		System.out.println(" Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		
		boolean flag = false;
		int temp = num;
		num = -num;
		System.out.println(num);
		if(num<0)
		{
			
			num = Math.abs(num);
			flag=true;
		}
		int rev = 0;
		int rem = 0; 
		int product = 1;
		while(num>0)
		{
			rem =num%10;
			product *=rem;
			num /= 10;
		}
		if(flag)
		{
			rev=-rev;
		}
		System.out.println("\nNumber : "+temp+" Product Of Digits : "+product);
	}
}
