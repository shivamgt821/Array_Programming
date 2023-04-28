public class SumOfTwoMatrix {

	public static void main(String[] args) {
		int [][]a = {{1,4,3},{1,5,6},{6,7,6}};
		int [][]b = {{1,4,5},{1,0,1},{2,1,3}};
		int sum[][] = new int [3][3];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum[i][j]= a[i][j]+b[i][j];
			}
		}
			for(int i=0; i<sum.length; i++) {
				for(int j=0; j<sum[i].length; j++) {
					System.out.print(sum[i][j]+ " ");
				}
				System.out.println();
			}
		}
	}


