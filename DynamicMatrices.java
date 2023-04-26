import java.util.Scanner;

public class DynamicMatrices {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Row size : ");
		int rowSize = scn.nextInt();
		System.out.print("Enter Column size : ");
		int columnSize = scn.nextInt();
		
		int [][] a = new int [rowSize][columnSize];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the value for "+ i + "th rowsize : ");

			for(int j=0; j<a[i].length; j++) {
				a[i][j] = scn.nextInt();
				}
			}	
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j]+ " ");
				}
				System.out.println();
		}	
	}
}


