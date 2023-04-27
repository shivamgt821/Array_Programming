import java.util.Scanner;

public class Smallest_number_in_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter the array element : ");
		for(int i=0; i<a.length; i++)a[i] = sc.nextInt();
		
//		int [] a = {3,4,1,3,6,2,8};
		int smallest = a[0];
		for(int i=0; i<a.length ; i++) {
			if(smallest > a[i]) {
				smallest = a[i];
			}
		}
		System.out.println("smallest digit of given array is " + smallest);
	}

}
