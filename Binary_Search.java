public class Binary_Search {
	
	static int search(int a[],int x ){
		
		int start = 0;  
		int end = a.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(x == a[mid]) return mid;
			else if(x <= a[mid]) return mid-1;
			else start = mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {

		int a[] = {2,3,5,7,8,9};
		System.out.println(search(a,8));
		System.out.println(search(a,10));
	}

}
