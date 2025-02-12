import java.util.Scanner;
class Q6CelciusToFahren 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Temperature In Degree Celcius : ");
		double degreeCel = sc.nextDouble();
		double fahren = (9.0/5.0)*degreeCel +32;
		System.out.print("\n"+degreeCel+" Celcius Is "+fahren+" Fahrenheit.\n");
		
	}
}
