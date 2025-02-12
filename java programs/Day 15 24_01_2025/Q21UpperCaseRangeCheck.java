import java.util.Scanner;
class Q21UpperCaseRangeCheck 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.print("\nEnter Character : ");
			char ch = new Scanner(System.in).next().charAt(0);
		
			String res=
				(ch>=65 && ch<=90)? (ch+" Is In Upper Case ") : ch+" Not In UpperCase";
			System.out.println("\n"+res);
		}
	}
}
