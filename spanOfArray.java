public class spanOfArray {
	
	static int span(int a[]) {
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i] > max) max = a[i];
			
			if(a[i] < min) min = a[i];
	}
		return max-min;
}
	public static void main(String[] args) {
		
		int a[] = {2,88,94,34,7,99};
		System.out.println(span(a));

		
	}

}
