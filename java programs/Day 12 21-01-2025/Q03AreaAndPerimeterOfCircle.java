import java.util.Scanner;
class Q3AreaAndPerimeterOfCircle
{
	public static void main(String[] args) 
	{	
		float radius;
		final float PI = 22.0f/7.0f;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter The Radius : ");
		radius = sc.nextFloat();
		float area = PI*radius*radius; 
		float perimeter = 2.0f*PI*radius;
		System.out.println("Area Of Circle : "+area+" sqcm");
		System.out.println("Perimter Of Circle : "+perimeter);

	}
}
