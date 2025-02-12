import java.util.Scanner;
class Q16SumOfDigits
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter No. Betweeen 0001 to 1000 : ");
		int num = new Scanner(System.in).nextInt();
		int rem ; 
		int sumOfDigits=0;
		rem = num%10;
		sumOfDigits=sumOfDigits+rem;
		num = num/10;
		rem = num%10;
		sumOfDigits=sumOfDigits+rem;
		num = num/10;
		rem = num%10;
		sumOfDigits=sumOfDigits+rem;
		num = num/10;
		rem = num%10;
		sumOfDigits=sumOfDigits+rem;
		num = num/10;
		
		System.out.println("The Sum Of Digits Is : "+sumOfDigits);

	}
}
