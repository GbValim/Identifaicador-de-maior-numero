package desafiossjava01;


import java.util.Scanner;

public class tabuadaCachorra {

	public static void main(String[] args) {
		// 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero para ver sua tabuada");
		
		int numInf= scanner.nextInt();
	
		System.out.println("A tabuada de" + numInf + "eh: ");
		
	    for (int i = 0; i < 10; i++) {
		int tabuada = numInf * i ;
		System.out.println(tabuada);
		
	}
	
	

		scanner.close();
		
	}

}
