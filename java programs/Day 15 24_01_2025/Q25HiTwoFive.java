import java.util.Scanner;
class Q25HiTwoFive

{
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.print("\nEnter A Number :");
			int num = new Scanner(System.in).nextInt();

			String res = (num%2==0 && num%5==0?"HiTwoHiFive":
						 (num%2==0)?"Hi Two":
						 (num%5==0)?"Hi Five":"Blank");

			System.out.print("\n"+res);
		}
	}
}
