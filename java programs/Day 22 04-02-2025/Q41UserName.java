import java.util.Scanner;
class Q41UserName
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next().toUpperCase();

		for(int i = 0 ; i < name.length();i++)
		{
			System.out.print(name.charAt(i));
			Thread.sleep(1000);
		}
		
	}
}
