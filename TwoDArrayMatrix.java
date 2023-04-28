public class TwoDArrayMatrix {

	public static void main(String[] args) {
		int [][] a = new int [3][3];
		a[0][0] = 10;
		a[0][1] = 50;
		a[0][2] = 60;
		a[1][0] = 10;
		a[1][1] = 50;
		a[1][2] = 60;
		a[2][0] = 10;
		a[2][1] = 50;
		a[2][2] = 60;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
