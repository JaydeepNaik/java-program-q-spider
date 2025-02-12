import java.util.Scanner;
class Q68FrequencyOfDigits
{
     public static void main(String args[])
     {
		int num = new Scanner(System.in).nextInt();
		int rem;
		int place = 1;
		int dup = 0; 
		for(int i = 9 ; i >=0 ; i--)
		{ 
			int count = 0;
			for(int j = num ; j>0 ; j/=10)
			{
				rem = j%10;
				if(i==rem)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(i+" : "+count+"  ");
				dup = dup+(place*i);
				place=place*10;
			}
		}
		System.out.println("After Removing Repeating Number :"+dup);
     }
}