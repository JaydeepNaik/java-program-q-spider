import java.util.Scanner;
class Q13MinutesToYears
{
	public static void main(String[] args) 
	{

		long totalYearMinutes = 365*24*60;
		Scanner sc = new Scanner(System.in);		
		long userMinutes = sc.nextLong();
		long noOfYears = userMinutes/totalYearMinutes;


		long remDays =userMinutes%totalYearMinutes;
	    long noOfDays = remDays/(24*60);
		
		System.out.println(noOfYears+" "+noOfDays);

	}
}
