import java.util.Scanner;
class Q73PasswordProgram 
{
	public static void main(String[] args) throws Exception
	{
		int systemPass = 143;
		int userPass ;
		int seconds = 5000;
		int attempts = 3;
	
		int attemps = 3 ;
		do
		{
				System.out.println("Enter Pin : ");
				userPass = new Scanner(System.in).nextInt();
				if(userPass==systemPass)
				{
					System.out.println("Phone Unlocked");
					break;
				}
				System.out.println("Wrong Pin");
				System.out.println("Attempts Left : "+(attempts-1));
				attempts--;
				if(attempts==0)
				{
					System.out.println("Phone Locked For "+(seconds/1000)+" Second");
					Thread.sleep(seconds);
					seconds*=2;
					attempts =3 ;
				}
				
		}
		while(attempts>=0);
	}
}
