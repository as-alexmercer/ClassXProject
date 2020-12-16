// Java program to get the sum of the series 
import java.io.*; 

class Project_Program_5 { 

	// Function to get the series 
	static double Series(double x, int n) 
	{ 
		double sum = 1, term = 1, fct, j, y = 2, m; 

	// Sum of n-1 terms starting from 2nd term 
		int i; 
		for (i = 1; i < n; i++) { 
			fct = 1; 
			for (j = 1; j <= y; j++) { 
				fct = fct * j; 
			} 
			term = term * (-1); 
			m = Math.pow(x, y) / fct; 
			m = m * term; 
			sum = sum + m; 
			y += 2; 
		} 
		return sum; 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		double x = 3; 
		int n = 4; 
		System.out.println(Math.round(Series(x, n) * 
								10000.0) / 10000.0); 
	} 
} 
