package Interview_Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sum_Off_All_Elements_In_Array {

	public static void main(String[] args) {
		// Method1
		int array[] = {2,3,4,5,6,7};
		int sum = Arrays.stream(array).sum(); // Return int stream 
		System.out.println(sum);
		
		// Method2
		int sum1 = IntStream.of(array).sum();
		System.out.println(sum1);
		
		// Method3
		int sum2 = Arrays.stream(array).reduce((x,y)->x+y).getAsInt();
		System.out.println(sum2);
		
		//Method4
		int sum3 = Arrays.stream(array).reduce(Integer ::sum).getAsInt();
		System.out.println(sum3);
		
		//Method5
		long sum4 = Arrays.stream(array).summaryStatistics().getSum();
		System.out.println(sum4);
		
		//Method6
		int sum5 = 0;
		for(int i=0; i<array.length; i++) {
			sum5 += array[i];
		}
		System.out.println(sum5);

	}
}
