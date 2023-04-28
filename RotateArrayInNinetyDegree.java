public class RotateArrayInNinetyDegree {

	public static void main(String[] args) {
		int a[][]= 
    {
          {1,2,3},
					{4,5,6},
					{7,8,9}
		};
		for(int i=0; i<a.length; i++) {
			for(int j=a.length-1; j>=0; j--) {
				System.out.print(a[j][i]+" "); 
			}
			System.out.println();
		}
	}
}
