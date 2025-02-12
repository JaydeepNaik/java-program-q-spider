import java.util.Scanner;
class Q32CurrencyConverter
{
	public static void main(String[] args) 
	{
		System.out.println("  \nCURRENCY CONVERTER  ");
		System.out.println("\nEnter Amount In Inr : ");//100

		float inr = new Scanner(System.in).nextFloat();
		System.out.print("\nLIST OF CURRENCIES \n1.USD \n2.EURO \n3.GBP \n4.PKR \n5.REND \n6.YEN");
		System.out.print("\nEnter Currency Name : ");
		String curr = new Scanner(System.in).next().toUpperCase();
		System.out.println();
		float convertedCurr = 0f;
		if(curr.equals("USD"))
		{
			convertedCurr = inr/86.57f;
			System.out.println(inr+" INR = "+String.format(" %.2f",convertedCurr)+" USD");
		}
		else if(curr.equals("EURO"))
		{
			convertedCurr = inr/90.26f;
			System.out.println(inr+" INR = "+String.format(" %.2f",convertedCurr)+" EURO.");
		}
		else if(curr.equals("GBP"))
		{
			convertedCurr = inr/107.67f;
			System.out.println(inr+" INR = "+String.format(" %.2f",convertedCurr)+" Pounds.");	
		}	
		else if(curr.equals("PKR"))
		{
			convertedCurr = inr/0.31f;
			System.out.println(inr+" INR = "+String.format(" %.2f",convertedCurr)+" PKR.");
		}
		else if(curr.equals("REND"))
		{
			convertedCurr = inr/0.22f;
			System.out.println(inr+" INR = "+String.format(" %.2f",convertedCurr)+" REND.");
		}
		else if(curr.equals("YEN."))
		{
			convertedCurr = inr/86.56f;
			System.out.println(inr+" INR = "+String.format(" %.2f",convertedCurr)+" YEN");
		}
		else
		{
			System.out.print("INVALID OUTPUT");
		}

	}
}
