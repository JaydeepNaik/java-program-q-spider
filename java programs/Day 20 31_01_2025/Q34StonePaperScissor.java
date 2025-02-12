import java.util.Scanner;
class Q34StonePaperScissor
{
	public static void main(String[] args) 
	{
		System.out.print("\n***** STONE PAPER SCISSOR GAME *****");
		while(true)
		{
			System.out.print("\n\n\n\n\nEnter \n1.Stone 2.Paper 3.Scissor 4.Exit:");
			System.out.print("\nEnter Option : ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if(input==4)
			{
				System.exit(0);
			}
			int randomOp=0;
			String userOpt = null;
			String botOpt = null;
			for(int i=1;i<=1;i++)
			{
			    int num =(int) (Math.random()*10);
				// int num =(int) (Math.random()*3+1);
				// (int) (Math.random() * (999 - 599 + 1) + 599); for 599 to 999
				// (int) (Math.random() * (10000 - 500 + 1) + 500); for 500 to 10000
				// (int) (Math.random() * (10000 - 1000 + 1) + 1000); for 1000 to 10000
				// (int) (Math.random() * (5000 - 500 + 1) + 500); for 500 to 5000
				// Syntax : (maximum value- minimunvalue+1)+minimum value;
				if(num>=1 && num<=3)
				{
					randomOp=num;
					continue;
				}
				i--;
			}
			if(randomOp==1)
				botOpt="Stone";
			if(randomOp==2)
				botOpt="Paper";
			if(randomOp==3) 
				botOpt="Scissor";
			if(input==1)
			{
				userOpt="Stone";
			}
			else if(input==2)
			{
				userOpt="Paper";
			}
			else if(input==3) 
			{
				userOpt="Scissor";
			}
			else
			{
				System.out.println("Invalid Input");
				return;
			}
			if(input==1 && randomOp==2 || input==2 && randomOp==3 || input==3 && randomOp==1 )
				System.out.print("\nUser : "+userOpt+"\nBot : "+botOpt+"\n Bot Wins");
			else if(input==1 && randomOp==3 || input==2 && randomOp==1 || input==3 && randomOp==2 )
				System.out.print("\nUser : "+userOpt+"\nBot : "+botOpt+"\n User Wins");
			else
				System.out.print("\nUser : "+userOpt+"\nBot : "+botOpt+"\n   Draw");
			

		}
	}
}
