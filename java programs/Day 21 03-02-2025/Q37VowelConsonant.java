import java.util.Scanner;
class Q37VowelConsonantConceptClass
{
	public static void main(String[] args) 
	{
		char ch = new Scanner(System.in).next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			switch (ch)
			{
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
				{
					System.out.println("Alphabet Is Vowel : "+ch);	
				}break;
				default:
				{
					System.out.println("Alphabet Is Consonant "+ch);
				}
			}
		}
		else
		{
			System.out.print("Not An Alphabet");
		}
	}
}
