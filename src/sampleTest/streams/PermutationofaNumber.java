package sampleTest.streams;

public class PermutationofaNumber {

	public static void main(String[] args) {
		int n = 4545;
		int count = 0;
		while(count <= 3) {
			int x = n%10;
			System.out.println(x);
			int y = n/10;
			System.out.println(y);
			
			n = (int) Math.pow(10, 3)*x + y;
			
			System.out.println("Numbers are: " + n);
			count++;
		}

	}

}
