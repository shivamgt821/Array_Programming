public class ReverseOFArray2 {

	public static void main(String[] args) {
		
		int a[] = {3,6,9,4,7,2};
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for(int t:a)System.out.print(t+" ");
	}

}
