public class Remove_Duplicate {

	public static void main(String[] args) {
		System.out.println("Before remove duplicate value");
		int a[] = {2,2,3,3,4,4,5,6,6};
		for(int n:a)System.out.print(n+" ");
		int rd = removeDup(a);
		System.out.println();
		System.out.println("After remove duplicate value");

		for(int i=0;i<rd;i++) {
			System.out.print(a[i]+" ");
		}
	}
	static int removeDup(int a[]) {
		int rd=0; 
		for(int i=1;i<a.length-1;i++) {
			if(a[rd]!=a[i]) {
				rd++;
				a[rd]=a[i];
			}
		}
		return rd+1;
	}

}
