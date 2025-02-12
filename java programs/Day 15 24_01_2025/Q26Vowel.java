import java.util.Scanner;
class Q26Vowel 
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter Character : ");
		char ch = new Scanner(System.in).next().charAt(0);
		String res = (ch=='a'||ch=='e'||
					   ch=='i'||ch=='o'||
					   ch=='u'|| ch=='A'||
				       ch=='E'||ch=='I'||
			           ch=='O'||ch=='U')
			           ?ch+" Is Vowel": 
					    ch+" Is Consonent";
		System.out.println(res);
	}
}
