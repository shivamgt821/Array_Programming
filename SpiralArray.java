public class SpiralArray {

	public static void main(String[] args) {
		int a[][] = spiral(5);
		for(int t[] : a) {
			for(int n:t)System.out.print(n+"\t") ;
			System.out.println();
			System.out.println();	
		}
	}
	static int[][] spiral(int size){
		
		int a[][] = new int [size][size];
		int r = 0;
		int c = -1;
		char mov = 'r';
		
		for(int i=1; i<=size*size; i++) {
			
			switch(mov) {
			
			case 'r' : c++;
			a[r][c] = i;
			if(c==size-1|| a[r][c+1]!=0)
			mov = 'd';
			break;
			
			case 'd' : r++;
			a[r][c] = i;
			if(r==size-1 || a[r+1][c]!=0)
			mov = 'l';
			break;
			
			case 'l' : c--;
			a[r][c] = i;
			if(c==0 || a[r][c-1]!=0) 
			mov = 'u';
			break;
			
			case 'u' : r--;
			a[r][c] = i;
			if(r==0 || a[r-1][c]!=0 )
				mov = 'r';
			break;
			}
		}
			return a;
	}
}
