package funAssignment;
import java.util.Scanner;

public class switchCalculator {

	Scanner sc=new Scanner(System.in);
	void add() {
		System.out.println("enter first number");
		int First=sc.nextInt();
		System.out.println("enter second number");
		int second=sc.nextInt();
		System.out.println(" the sum is "+First+second);
		}
	void sub() {
			System.out.println("enter first number");
			int First=sc.nextInt();
			System.out.println("enter second number");
			int second=sc.nextInt();
			System.out.println(" the deduction is "+(First-second));
			}
	void mul() {
				System.out.println("enter first number");
				int First=sc.nextInt();
				System.out.println("enter second number");
				int second=sc.nextInt();
				System.out.println(" the product is "+(First*second));
				}
	
 public static void main(String [] args)
	{
	 switchCalculator cal=new switchCalculator();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("-----Calculator-------");
			System.out.println("-----ADD-------");
			System.out.println("-----SUB-------");
			System.out.println("-----MUL-------");
			System.out.println("ENTER YOUR CHOICE\n");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1: cal.add();
			break;
			case 2: cal.sub();
			break;
			case 3: cal.mul();
			break;
			default: System.exit(0);
			}
			
		}
	}
}
