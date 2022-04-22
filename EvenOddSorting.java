package funAssignment;

public class EvenOddSorting {

	public static void main(String []args) {
		
		int []arr= {3,32,423,23,54,44};
		
		int [] even=new int[7];
		int [] odd=new int[7];
		int k=0;
		int l=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				even[k]=arr[i];
				k++;
			}
		}for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				odd[l]=arr[j];
				l++;
			}
		}
		System.out.println("The odd numbers are ");
		for(int i=0;i<k;i++) {
			System.out.print("\t"+odd[i]);
		}
		System.out.println("\nThe Even Numbers are ");
		for(int j=0;j<l;j++) {
			System.out.print("\t"+even[j]);
		}
		
		
		}
	
}
