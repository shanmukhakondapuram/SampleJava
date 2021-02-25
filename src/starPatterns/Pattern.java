package starPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pattern {

	public static void main(String[] args) {
		// Right angled Triangle
		int n = 5;
		for(int i =0; i <= n; i++) {
			for(int j =0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Left angled Triangle
		for(int i = n; i >= 0; i--) {
			
			for(int j = 0; j <= 2*i; j++) {
				System.out.print(" ");
			}
			for(int k =0; k <= n-i; k++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		// half-Diamond Triangle
			for(int i = n; i >= 0; i--) {
				
				for(int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				for(int k =0; k <= n-i; k++)
					System.out.print("* ");
				
				System.out.println();
			}
		//full diamond Triangle
			
			for(int i = 0; i <= n; i++) {
				
				for(int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				for(int k =0; k <= n-i-1; k++)
					System.out.print(" *");
				
				System.out.println();
			}
			//downward Triangle Pattern
			for(int i = 0; i <= n; i++) {
				for(int k =0; k <= n-i; k++)
					System.out.print(" *");
				
				System.out.println();
			}
			
			//Reverse Pyramid start
			for(int i = 0; i <= n; i++) {
				for(int j = 0; j <= i; j++)
					System.out.print(" ");
				
				for(int k =0; k <= n-i; k++)
					System.out.print(" *");
				
				System.out.println();
			}
			for(int i = n; i >= 0; i--) {
				
				for(int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				for(int k =0; k <= n-i; k++)
					System.out.print(" *");
				
				System.out.println();
			}
			
			//Pattern to print X
			
			n =9;
			for(int i = 0; i < n; i++) {
				for(int k =0; k < n; k++) {
					if(k == i || k == n-i-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
				System.out.println("");
			}
			List<String> al = new ArrayList<String>();
			
			
	}
	
	
}
