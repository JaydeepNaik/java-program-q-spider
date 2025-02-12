import java.util.Scanner;
class Q29Months 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Month : ");
		String mon = new Scanner(System.in).next();
		System.out.println((mon.equalsIgnoreCase("OCT")||mon.equalsIgnoreCase("NOV")||mon.equalsIgnoreCase("DEC")||mon.equalsIgnoreCase("JAN"))?(" Winter "):
							(mon.equalsIgnoreCase("FEB")||mon.equalsIgnoreCase("MAR")||mon.equalsIgnoreCase("APR")||mon.equalsIgnoreCase("MAY"))?(" Summer"):
							(mon.equalsIgnoreCase("JUN")||mon.equalsIgnoreCase("JUL")||mon.equalsIgnoreCase("AUG")||mon.equalsIgnoreCase("SEP"))?(" Monsoon"):
							("Wrong Month"));
	}
}
