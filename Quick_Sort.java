public class Quick_Sort {

	public static void main(String[] args) {

		int a[] = {2,5,7,1,9,4,6,10};
		sort(a,0,7);
		for(int n:a)System.out.print(n+" ");
		System.out.println();
	}	

	static void sort(int a[],int start,int end) {
		
		if(start>=end) return;
		int i = start;
		int j = end;
		int pivot = a[(start+end)/2];
		while(i<=j) {
		while(pivot>a[i]) i++;
		while(pivot<a[j]) j--;
		if(i<=j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			i++;
			j--;
		}
	}
		sort(a,start,j);
		sort(a,i,end);
	}
}
