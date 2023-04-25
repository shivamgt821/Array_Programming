public class Diagonal_Sum {

	public static void main(String[] args) {

//		int a[][] = {
//				{1,2,3,6},
//				{4,5,6,7},
//				{7,8,9,8},
//				{1,2,7,6}
//				};
		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int sum = 0;
		int len = a.length;
		for(int i=0; i<len; i++) {
			sum = sum+a[i][i];
			if(len%2 !=0 && i==len/2) continue;
			sum = sum+a[i][len-1-i];
		}
		System.out.println(sum);
		
	}

}
