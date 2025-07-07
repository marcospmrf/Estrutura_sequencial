package exe02;

import java.util.Scanner;
import java.lang.Math;

public class exe02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double area;
		
		raio = sc.nextDouble();
		
		area = 3.14159 * Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f%n", area);
		

		sc.close();

	}

}
