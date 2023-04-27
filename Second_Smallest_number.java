public class Second_Smallest_number {

	public static void main(String[] args) {
		
		int a[] = {2,5,8,-1,4,0,7};
		
		int s1 = a[0];
		int s2 = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i] < s1) {
				s2 = s1;
				s1 = a[i];
			}
			else if (a[i] < s2 || s1 == s2)  s2 = a[i];
			}
		System.out.println(s2);
		
	}

}
	
	


