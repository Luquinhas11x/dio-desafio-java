import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String [] arrayNomes = new String[10];
		int[] arrayIdade = new int[10];
		int menorIdade = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite seu nome: ");
			arrayNomes[i] = entrada.next();
			
			System.out.println("Digite sua idade: ");
			arrayIdade[i] = entrada.nextInt();
			
			if(arrayIdade[i] < arrayIdade[menorIdade]) {
				menorIdade = i;
			}
			
			
		}
		System.out.println("A pessoa com menor idade é: " + arrayNomes[menorIdade]);
		
		entrada.close();
	}
}
