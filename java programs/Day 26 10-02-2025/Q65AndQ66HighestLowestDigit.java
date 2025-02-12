import java.util.Scanner;
class Q65AndQ66HighestLowestDigit
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number :  ");
		int num = new Scanner(System.in).nextInt();
		int max = 0,rem,min=9;
		while(num>0)
		{
			rem = num%10;
			if(max<rem)
			{
				max = rem ;
			}
			else if(min>rem)
			{
				min = rem;
			}
			num/=10;
		}
		System.out.println("Higest Digit In A Number : "+max);
		System.out.println("Lowest Digit In A Number : "+min);
		
	}
}
