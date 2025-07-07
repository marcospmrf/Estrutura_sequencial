package exe05;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
         int cod1, cod2, qt1, qt2;
         double preco1, preco2, total;
         
         cod1 = sc.nextInt();
         qt1 = sc.nextInt();
         preco1 = sc.nextDouble();
         
         cod2 = sc.nextInt();
         qt2 = sc.nextInt();
         preco2 = sc.nextDouble();
         
         total = preco1 * qt1 + preco2 * qt2;
      
         System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		sc.close();
	}

}
