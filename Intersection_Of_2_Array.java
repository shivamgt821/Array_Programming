package Interview_Questions;

import java.util.HashSet;

public class Intersection_Of_2_Array {

	public static void main(String[] args) {
		int a[] = {1,7,3,4};
		int b[] = {5,4,7,8};
		
		printIntersection(a,b);
		
	}

	public static void printIntersection(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length;i++) {
			set.add(a[i]);
		}
		for(int i=0; i<b.length;i++) {
			if(set.contains(b[i])) {
				System.out.print(b[i]+" ");
			}
		}
		
	}

}
