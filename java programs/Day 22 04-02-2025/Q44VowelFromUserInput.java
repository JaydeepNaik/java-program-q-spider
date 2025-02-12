import java.util.Scanner;
class Q44VowelFromUserInput
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.print(" Vowel : ");
		for(int i = 0; i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.print(name.charAt(i)+" ");
			}
		}
		
	}
}
