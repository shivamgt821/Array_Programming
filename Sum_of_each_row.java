public class Sum_of_each_row {

	public static void main(String[] args) {
		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		for(int i=0;i<a.length; i++) {
			int sum = 0;
			for(int j=0;j<a[i].length; j++) {
				sum+=a[i][j];
			}
		
		System.out.println("the sum of "+(i+1)+" row is : " + sum);
		}
	}
}

