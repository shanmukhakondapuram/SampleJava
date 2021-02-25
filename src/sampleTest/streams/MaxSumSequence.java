package sampleTest.streams;

public class MaxSumSequence {

	public static void main(String[] args) {
		
		int[] array = {1,-2,3,4,-2,-2,70,-10,9};
		
		int sum = 0;
		int startingindex = 0;
		int endingindex = 0,actualsum = 0;
		
		for(int i = 0; i< array.length; i++) {
			sum = sum + array[i];
			if(actualsum < sum) {
				actualsum = sum;
				endingindex = i;
			}
			
			if(sum < 0) {
				sum = 0;
				startingindex = i + 1;
			}
			
		}
		
		System.out.println("Sum is: " + actualsum);
		System.out.println("Starting loc is: " + startingindex);
		System.out.println("Ending loc is: " + endingindex);
		
		
		int maxsum = 0;
		for(int k =0; k < array.length; k++) {
			int sum1 = array[k];
			for(int l = k+1; l < array.length; l++) {
				sum1 = sum1 + array[l];
				if(sum1 <= 0) {
					//break;
				}else {
					if(maxsum < sum1) {
						maxsum = sum1;
						endingindex = l;
						startingindex = k;
						
					}
				}
		}
		}
		System.out.println("maximum sum: " + maxsum);
		System.out.println("Starting loc is: " + startingindex);
		System.out.println("Ending loc is: " + endingindex);
		
		
	}

}
