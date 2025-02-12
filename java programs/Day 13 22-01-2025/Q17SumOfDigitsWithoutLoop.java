import java.util.Scanner;
class Q17SumOfDigitsWithoutLoop
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter No. Betweeen 0000 to 1000 : ");
		int num = new Scanner(System.in).nextInt();
		int rem ; 
		int sumOfDigits=0;
		int sumEven=0;
		int sumOdd=0;
		rem = num%10;
		sumOfDigits=sumOfDigits+rem;
		num = num/10;
		sumEven += (rem%2==0)?rem:0;
		sumOdd += (rem%2!=0)?rem:0;


		rem = num%10;
		sumOfDigits=sumOfDigits+rem;
		num = num/10;
		sumEven += (rem%2==0)?rem:0;
		sumOdd += (rem%2!=0)?rem:0;


		
		rem = num%10;
		sumOfDigits=sumOfDigits+rem;
		num = num/10;
		sumEven += (rem%2==0)?rem:0;
		sumOdd += (rem%2!=0)?rem:0;


		
		rem = num%10;
		sumOfDigits=sumOfDigits+rem;
		num = num/10;
		sumEven += (rem%2==0)?rem:0;
		sumOdd += (rem%2!=0)?rem:0;


		System.out.println("\n The Sum Of Digits Is : "+sumOfDigits+"\n\n Sum Of Even : "+sumEven+"\n\n Sum Of Odd : "+sumOdd);



	}
}
