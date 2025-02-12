import java.util.Scanner;
class Q7VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Radius Of Cylinder : ");
		float radius = sc.nextFloat();
		System.out.print("\nEnter Height Of Cylinder : ");
		float height = sc.nextFloat();
		float area =(22.0f/7.0f)*radius*radius;
		float volume = area*height;
		System.out.print("\nThe Area Is : "+area);
		System.out.println("\n\nThe Volume Is : "+volume);
	}
}
