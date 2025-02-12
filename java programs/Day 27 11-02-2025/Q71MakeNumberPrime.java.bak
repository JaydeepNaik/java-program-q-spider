import java.util.Scanner;
class Q71MakeNumberPrime 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number : ");
		int num = sc.nextInt();
		if(num==1)
			num++;
		for(int i = 2 ; i<num ; i++) // 9 10 11 
		{
			flag = false;
			if(num%i==0) // 10%2==0 
			{
				flag=true;
				i = 1;
				num++;
			}
		}
		System.out.println("Prime Number : "+num);
	}
}
