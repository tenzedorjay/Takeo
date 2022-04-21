package funAssignment;

public class TwoDArrayMaxValue {

	static void checkMax(int arr[]) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
	}System.out.println("the max value is "+max);
	}
	public static void main(String []args)
	{
		int[] arr ={
			3,43,52,23,35,25
		};
		checkMax(arr);
		
	}
}
