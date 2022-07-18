import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		String nome; 
		int numero;
		
		System.out.println("Digite seu nome: ");
		nome = entrada.next();
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		for (int i = 0; i < numero; i++) {
			System.out.println("O seu nome é: " + nome);
		}
		
		entrada.close();
		
	}
}
