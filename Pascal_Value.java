import java.util.Scanner;

public class Pascal_Value {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter pascal triangle size : ");
		int size = scn.nextInt();
		int a[][] = pascalTriangle(size);
		int space = size-1;
		for(int t[]: a) {
			for(int i=0; i<=space; i++) System.out.print(" ");
			for(int n:t) {
			System.out.print(n+ " ");
			}
			System.out.println();
			space--;
		}
	}
	
	static int [][] pascalTriangle(int size){
		
		int a[][] = new int[size][];
		for(int i=0; i<a.length; i++) {
			a[i] = new int[i+1];
			
			for(int j=0; j<a[i].length; j++) {
				if(j==0 || i==j) {
					a[i][j] = 1;
				}
				else {
				a[i][j] = a[i-1][j-1] + a[i-1][j];
				}
			}
		}
		return a;
	}
}
