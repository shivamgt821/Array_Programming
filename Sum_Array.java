public class Sum_Array {

	public static void main(String[] args) {
		int [] a = {3,8,9,4,5,2,1};
		String s = "";
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum = sum+a[i];
			s=s+a[i];
			if(i<a.length-1) 
				s += "+";
		}
		s = s+ "=" +sum;
		System.out.println(s);
	}

}
