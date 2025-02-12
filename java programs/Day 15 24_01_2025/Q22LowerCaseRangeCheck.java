import java.util.Scanner;
class Q22LowerCaseRangeCheck 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.print("\nEnter Character : ");
			char ch = new Scanner(System.in).next().charAt(0);
		
			String res=
				(ch>=97 && ch<=122 )? ch+(" Is In Lower Case"): ch+" Not In LowerCase";
			System.out.println("\n"+res);
		}
	}
}
