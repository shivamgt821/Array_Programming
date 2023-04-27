public class mergeTwoSortedArray {

	public static void main(String[] args) {
		
		int a[]= {3,4,5,9,10};
		int b[]= {1,7,8};
		
		int c[] = new int[a.length + b.length];
		mergeSortedArray(a,b,c);
		
		for(int n:c)System.out.print(n+" ");
		
	}

		static void mergeSortedArray(int a[],int b[],int c[]) {
			
			int i=0, j=0, k=0;
			
			while(i<a.length && j<b.length) {
			
			if(a[i] < b[j]) {
				
				c[k] = a[i];
				i++;
				k++;
			}
			else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];

	}	
}
