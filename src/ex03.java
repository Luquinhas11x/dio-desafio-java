import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, somaNumero = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
			
			somaNumero = somaNumero + numero;
		}
		
		
		
		System.out.println("A soma dos 10 n�mero �: " + somaNumero);
		
		entrada.close();
	}
}
