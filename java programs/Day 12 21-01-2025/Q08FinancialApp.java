import java.util.Scanner;
class Q8FinancialApp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Subtotal : ");
		float subTotal = sc.nextFloat();
		System.out.print("\nEnter Gratuity Rate : ");
		float gRate = sc.nextFloat();
		float tip =(subTotal*gRate)/100;
		System.out.println("\nThe Tip Is "+tip+" Total Is "+(subTotal+tip));
	}
}
