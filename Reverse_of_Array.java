public class Reverse_of_Array {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		rev(a);
		System.out.print("Reverse of Array is: ");
		for(int n: a)System.out.print(n+" ");
	}
	
	static void rev(int a[]) {
		
		int i=0; int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
}
