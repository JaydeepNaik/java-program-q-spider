import java.util.Scanner;
class Q28MarksPassAndFail 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Marks ");
		float marks = new Scanner(System.in).nextFloat();
		float per = (marks*100.0f)/600.0f;
		System.out.println(" Percentage : "+String.format("%.2f",per));
		System.out.println((per>100)?("Wrong Input"):(per<=100 && per>=75?("Pass : Grade A "):
							(per<75 && per>=60)?("Pass : Grade B "):
							 (per<60 && per>35)?("Pass : Grade C"):(" Fail ")));
	}
}
