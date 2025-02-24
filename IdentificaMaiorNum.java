package desafiosJava;
import java.util.Arrays;
import java.util.Collections;
public class IdentificaMaiorNum {

	
	public static void main(String[] args) {
		
		
		Integer[] numeros = { 1,2,3  }; 
		Arrays.sort(numeros, Collections.reverseOrder());
		
		System.out.println("O maior numero e o " + numeros[0]);
		
		
		
		
		
	}
}
