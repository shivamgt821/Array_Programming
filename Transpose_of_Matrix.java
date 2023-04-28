public class Transpose_of_Matrix {

	public static void main(String[] args) {

		int a[][] = {
					{1,3,5},
					{6,8,3},
					{0,5,2} 
					};
		int b[][] = transpose(a);
		for(int t[]:b) {
			for(int n:t) 
				System.out.print(n+" ");
			System.out.println();
		}
		
	}
	static int[][] transpose(int[][]a){
		
		int len =  a.length;
		int c[][] = new int [len][len];
		for(int i=0; i<len; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[j][i] = a[i][j];
			}
		}
		return c;
	}
}


