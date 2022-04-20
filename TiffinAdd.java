package funAssignment;
import java.util.Scanner;

public class TiffinAdd {
	Scanner sc= new Scanner(System.in);
	int bonda(int a) {
		return 10*a;
	}int dosa(int b) {
		return 5*b;
	}int itly(int c) {
		return 20*c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bondaBill=0;
		int itlyBill=0;
		int dosaBill=0;
		while(true) {
			TiffinAdd tf=new TiffinAdd();
		System.out.println("1.Bonda \n2.Dosa \n3.Itly \n4.Bill \n5.Exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Each Bonda is Rs 10!!\nHow many pieces of Bonda you want");
				int perPicBonda=sc.nextInt();
			 bondaBill=tf.bonda(perPicBonda);
			System.out.println("your total for bonda is "+bondaBill+"\nAnythig else ?");
			break;
		case 2:
			System.out.println("Each Dosa is Rs 5!!\nHow many pieces of Dosa you want");
			int perPicDosa=sc.nextInt();
			 dosaBill=tf.dosa(perPicDosa);
			System.out.println("your total for dosa is "+dosaBill+"\nAnythig else ?");
			break;
		
		case 3:
			System.out.println("Each itly is Rs 20!!\nHow many pieces of Bonda you want");
			int perPicItly=sc.nextInt();
			 itlyBill=tf.itly(perPicItly);
			System.out.println("your total for itly is "+itlyBill+"\nAnythig else ?");
			break;
		case 4:
			int totalBill= bondaBill+itlyBill+dosaBill;
			System.out.println("Your Total Bill Amount is "+totalBill+" till now ");
			break;
		case 5:
			System.out.println("Thank You For Visiting !!! See You Again");
			System.exit(0);
	}
		}
	}
}
