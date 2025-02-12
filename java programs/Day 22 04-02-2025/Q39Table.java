import java.util.Scanner;
class Q39Table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("Enter Range : ");
		int range = sc.nextInt();
		for(int i = 1; i <= range ; i++)
		{
			System.out.println(num+" X "+ i +" = "+(num*i));
		}
	}
}
