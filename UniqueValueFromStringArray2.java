public class UniqueValueFromStringArray2 {
	
	public static void main(String[] args) {
		String a[] = {"ravi","raju","ram","ravi","raju","ram"};
    
		for(int i=0; i<a.length; i++) {
			int count = 1;
			for(int j=i+1; j<a.length; j++ ) {
				if(a[i] == a[j]) {
					count++;
					a[j] = "";
				}
			}
			if(a[i]!= "") {
				System.out.print(a[i]+"="+count+" ");
			}			
		}
	 }
}



