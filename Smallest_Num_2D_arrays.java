public class Smallest_Num_2D_arrays {

	public static void main(String[] args) {
		int a[][] = {
				{1,2,3},
				{5,0,6},
				{4,9,-1}
			};
		int i = 0;
		int smallest = a[i][i];
		int biggest = a[i][i];
		for(i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				
				if(smallest>a[i][j]) smallest = a[i][j];
				
				if(biggest<a[i][j]) biggest = a[i][j];
			}
		}
		System.out.println("The smallest number in given matrix is = " +smallest);
		
		System.out.println("The biggest number in given matrix is = " +biggest);
	}

}
