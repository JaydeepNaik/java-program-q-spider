import java.util.Scanner;
class Q67GenerateRandom6Digit
{
     public static void main(String args[])
     {
	       //int opt =(int) (Math.random()*(999999-100000+0)+100000);
		   //System.out.println(opt);
		   String otp = "";
		   for(int i = 1; i <= 10 ;)
		   {
				otp+=(int)(Math.random()*1000000);
				if(otp.length()==6)
				{
					System.out.println(otp);
					i++;
				}
				otp="";
		   }

     }
}