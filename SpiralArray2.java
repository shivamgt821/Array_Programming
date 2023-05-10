public class SpiralArray2 {

	public static void main(String[] args) {
		int a[][] = {{2,8,9},
					       {3,5,3},
					       {1,8,2}
		};
		int size = a.length;
		int r = 0;
		int c = -1;
		char mov = 'r';
		for(int i=0; i<size*size; i++) {
			if(mov == 'r') { c++;
				System.out.print(a[r][c]+" ");
				a[r][c] = 0;
				if(c==size-1 || a[r][c+1]==0)
				mov = 'd';
		}
		else if(mov=='d') {r++;
			System.out.print(a[r][c]+" ");
			a[r][c] = 0;
			
			if(r==size-1 || a[r+1][c]==0)
			mov = 'l';
		}
		else if(mov == 'l') {c--;
			System.out.print(a[r][c]+" ");
			a[r][c] = 0;
			
			if(c==0 || a[r][c-1]==0)
			mov = 'u';
		}
		else if(mov == 'u') {r--;
			System.out.print(a[r][c]+" ");
			a[r][c] = 0;
			
			if(r==0 || a[r-1][c]==0)
			mov = 'r';
			}	
		}
	}
}
