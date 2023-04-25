public class Selection_Sort {

	public static void main(String[] args) {

		int [] a = {4,5,6,2,1,9,7,10};
		sort(a);
		for(int n:a)System.out.print(n+" ");
	}
	
	static void sort(int [] a) {
		for(int i=0; i<a.length-1; i++) {
			int index = i;
		for(int j=i+1; j<a.length; j++) {
			if(a[j]<a[index]) index = j;
		}
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
	}
}
