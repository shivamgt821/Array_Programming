import java.util.HashSet;

public class Missing_Number_In_Array {

	public static void main(String[] args) {
		int a[] = {4,6,7,8,9,1,0,2};
		missingNumber(a);
	}

	public static void missingNumber(int a[]) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		int n = a.length+1;
		for(int i=0; i<n; i++) {
			if(!set.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
