import java.util.Scanner;
class Q4AreaAndPerimeterOfRectangle 
{
	public static void main(String[] args) 
	{
		float width,height;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter A Height : ");
		height = sc.nextFloat();
		System.out.print("\nEnter A Width : ");
		width = sc.nextFloat();
		float area = height*width;
		float perimeter = 2*(height+width);
		System.out.print("\nArea Of Rectangle : "+area+" sqcm");
		System.out.print("\nAPerimeter Of Rectangle : "+perimeter+" sqcm");
		
	}
}
