import java.util.Scanner;
class Q12PoundsToKilograms 
{
	public static void main(String[] args) 
	{
		final float pounds = 0.454f;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Weight In Pounds : ");
		float value = sc.nextFloat();
		float kilogram = value*pounds;
		System.out.println("\n"+value+" pounds is "+kilogram+" Kilograms");
	}
}
