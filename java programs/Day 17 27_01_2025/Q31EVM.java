import java.util.Scanner;
class Q31EVM
{
	public static void main(String[] args) 
	{
		int pop;
		int bjp=0;
		int cong=0;
		int aap=0;
		int shivsena=0;
		int nota = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Population : ");
		pop = sc.nextInt();
		for(int i=1;i<=pop;i++)
		{
			System.out.print("\nList Of Parties \n1.BJP \n2.CONGRESS \n3.AAP \n4.ShivSena \n5.Nota ");
		    System.out.print("\nEnter Choice : ");
			int choice = sc.nextInt();
			if(!(choice>=1 && choice <=5))
			{
				pop++;
				System.out.println("\nWrong Choice ");
			}
			if(choice==1)
				bjp++;
			if(choice==2)
				cong++;
			if(choice==3)
				aap++;
			if(choice==4)
				shivsena++;
			if(choice==5)
				nota++;
		}
		System.out.print("\n\n BJP :"+bjp+"\n\n Congress :"+cong+"\n\n Shivsena : "+shivsena+"\n\n Nota : "+nota);
		if(bjp>=cong && bjp>=aap && bjp>=shivsena & bjp>=nota){

			System.out.println("\n\n BJP WINS : "+bjp);		 
			return;
		}
		if(cong>=bjp && cong >=aap && cong>=shivsena && cong>=nota){
			System.out.println("\n\n Congress Wins : "+cong);
			return;
		}
		if(aap>=bjp && aap>=cong && aap >= shivsena && aap>=nota){
			System.out.println("\n\n AAP Wins "+shivsena);
			return;
		}
		if(shivsena>=bjp && shivsena >= cong && shivsena>=aap && shivsena>=nota){

			System.out.println("\n\n Shivsena Wins : "+shivsena);
			return ;
		}
		if(nota>=bjp && nota>=cong && nota>=aap && nota>=shivsena){
			System.out.println("\n\n Nota");
		}
	}
}
