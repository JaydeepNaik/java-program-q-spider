import java.util.Scanner;
class Q45SumOfDigits
{
	public static void main(String[] args) 
	{
		System.out.println(" Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		
		int temp = num;
		
		int rev = 0;
		int rem = 0; 
		int sum = 0;
		while(num>0)
		{
			rem =num%10;
			rev =(rev*10)+ rem ;
			sum +=rem;
			num /= 10;
		}
		System.out.println("\nNumber : "+temp+"\nSum Of Digits : "+sum);
	}
}
