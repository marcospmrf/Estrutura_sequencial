package exe04;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int hora;
		double valorh;
		double salario;
		
		num = sc.nextInt();
		hora = sc.nextInt();
		valorh = sc.nextDouble();
		
		salario = hora * valorh;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
        sc.close();
	}

}
