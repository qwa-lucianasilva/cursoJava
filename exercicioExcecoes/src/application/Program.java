package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();
		
		System.out.println(" End of program");
	}
	
	public static void method1() {
		System.out.println("METHODO1 start***");
		method2();
		System.out.println("***METHOD2 END***");
	}
	
	
	public static void  method2() {
		
		System.out.println("***METHOD2 start***");
		Scanner sc = new Scanner(System.in);
		
		
		try {
			String [] vector = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vector[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		
		}
		//aqui, vamos criar + uma exceção pois usuaro digitou letra ao inves de numero, assim colocando a exceção o código segue e mostra o erro para o usuario
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("End of program");
		sc.close();
	}

}
