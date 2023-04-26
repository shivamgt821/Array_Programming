public class Linear_Search {

	public static void main(String[] args) {
		int a[] = {3,4,5,6,8,9};
		System.out.println(search(a,8));
		System.out.println(search(a,10));
	}
	
	static int search(int a[], int x) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==x) return i;
		}
		return -1;
	}

}
