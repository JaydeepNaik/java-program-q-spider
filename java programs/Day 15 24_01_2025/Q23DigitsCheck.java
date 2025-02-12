import java.util.Scanner;
class Q23DigitsCheck
{
	public static void main(String[] args) 
	{

		while(true)
		{
			System.out.print("\nEnter Character : ");
			char ch = new Scanner(System.in).next().charAt(0);
		
			String res=
				(ch>=48 && ch<=57)?(ch+" Is A Digit "): (ch+" Is Not A Digit");
			System.out.println("\n"+res);
		}
	}
}

	}
}
