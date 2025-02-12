import java.util.Scanner;
class Q24UppperCaseRangeCheck 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.print("\nEnter Character : ");
			char ch = new Scanner(System.in).next().charAt(0);
		
			String res=
				(ch>=65 && ch<=90)? (ch+" Is In Upper Case ") : 
				(ch>=97 && ch<=122 )? ch+(" Is In Lower Case"):
				(ch>=48 && ch<=57)?(ch+" Is A Digit "): (ch+" Is A Special Symbol");
			System.out.println("\n"+res);
		}
	}
}
