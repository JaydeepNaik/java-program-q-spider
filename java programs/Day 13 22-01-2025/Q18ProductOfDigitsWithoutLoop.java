import java.util.Scanner;
class Q18ProductOfDigitsWithoutLoop

{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter No. Betweeen 0000 to 1000 : ");
		int num = new Scanner(System.in).nextInt();
		int rem ; 
		int productOfDigits=1;
		int productEven=1;
		int productOdd=1;
		rem = num%10;
		productOfDigits=(rem!=0)?productOfDigits*rem:productOfDigits*1;
		num = num/10;
		productEven *= (rem%2==0)?rem:1;
		productOdd *= (rem%2!=0)?rem:1;


		rem = num%10;
		productOfDigits=(rem!=0)?productOfDigits*rem:productOfDigits*1;
		num = num/10;
		productEven *= (rem%2==0)?rem:1;
		productOdd *= (rem%2!=0)?rem:1;


		
		rem = num%10;
		productOfDigits=(rem!=0)?productOfDigits*rem:productOfDigits*1;
		num = num/10;
		productEven *= (rem%2==0)?rem:1;
		productOdd *= (rem%2!=0)?rem:1;


		
		rem = num%10;
		productOfDigits=(rem!=0)?productOfDigits*rem:productOfDigits*1;
		num = num/10;
		productEven *= (rem%2==0)?rem:1;
		productOdd *= (rem%2!=0)?rem:1;


		System.out.println("\n The Product Of Digits Is : "+productOfDigits+"\n\n Product Of Even : "+productEven+"\n\n Product Of Odd : "+productOdd);



	}
}
