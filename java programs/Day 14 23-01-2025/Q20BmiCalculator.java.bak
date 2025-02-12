import java.util.Scanner;
class Q20BmiCalculator 
{
	public static void main(String[] args) 
	{
		final float pounds = 0.45359237f;
		final float meters = 0.0254f;
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Weight In Pounds : ");
		float weight = sc.nextFloat();
		System.out.print("\nEnter Height In Inches : ");
		float height = sc.nextFloat();

		float mm = meters*height;
		float kilogram = weight*pounds;
		
		float bmi = (kilogram/(mm*mm));
		System.out.println("\nBMI IS "+bmi);
	}
}
