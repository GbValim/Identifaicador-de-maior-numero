package desafiossjava01;

import java.util.Scanner;

public class ConversorFahrenheit {

	public static void main(String[] args) {
		
		
		// C x 1,8 + 32
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um numero que represente um Grau C°");
		
		

		float numinf = s.nextFloat();
		
		float resposta  = numinf*1.8f +32;
		
		
		System.out.println("O numero: " + numinf +" eh: " + resposta + " Em Fahrenheit" );
		
		s.close();
		
	}

}
