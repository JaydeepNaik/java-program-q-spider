import java.util.Scanner;
class Q33LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float years = 0;
		System.out.println("Enter Amount : ");
		float amt = sc.nextFloat();
		System.out.println("Enter ROI : " );
		float roi = sc.nextFloat();
		System.out.println("Enter Tenure(Months) : ");
		int months = sc.nextInt();
		if(months<=12)
		{
			years=months;	
		}
		else
		{
			if(months%12*0.1f<=0.9)
			{
				years=(months/12+(months%12)*0.1f);	
			}
			else
			{
				years=(months/12+(months%12)*0.01f);
			}			
		}
		System.out.println("******LOAN CALCULATION******");
		System.out.println(" PRINCIPLE AMOUNT : "+amt);
		System.out.println(" ROI : "+roi+"%");
		System.out.println(" Tenure : "+months+" Months");
		float intYear = amt*roi/100;
		float totalInter = intYear*years;
		System.out.println(" INTEREST : "+totalInter);
		float outStanding = amt+totalInter;
		System.out.println(" Total Oustanding Amount : "+outStanding);
		System.out.println(" EMI "+(outStanding/months)+"rs");

	}
}
