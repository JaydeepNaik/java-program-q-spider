import java.util.Scanner;
class Q14ConditionalOp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter 1st Number : ");
		int a = sc.nextInt();
		System.out.print("\nEnter 2nd Number : ");
		int b = sc.nextInt();
		System.out.print("\nEnter 3rd Number : ");
		int c = sc.nextInt();
		int large = (a>b)?(a>c)?(a):(b):(b>c)?(b):(c);
		int small = (a<b)?(a<c)?(a):(b):(b<c)?(b):(c);
		System.out.println("\nLargest Number : "+large+"\n\nSmallest Number : "+small);
	}
}
