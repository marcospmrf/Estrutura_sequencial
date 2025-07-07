package exe01;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
       sc.close();
	}

}
