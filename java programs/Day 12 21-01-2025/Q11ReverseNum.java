import java.util.Scanner;
class Q11ReverseNum
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter Any 3 Digit Number : ");
		int num = new Scanner(System.in).nextInt();
		boolean flag = false;
		int dup = num; // Duplicate Number
		int rev=0;  
		if(num<0)
		{
			flag=true;
		}
		//Initialially Rev
		int rem = num%10;  
		rev = (rev*10)+rem;

		num = num/10;
	    rem = num%10;
		rev = (rev*10)+rem;

	    num = num/10;
	    rem = num%10;
		rev = (rev*10)+rem;
		if(flag==true)
		{
			rev=-rev*-1;
		}
		System.out.print("Actual Number : "+dup+"\nReversed Number : "+rev);
	}
}
