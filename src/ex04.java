import java.util.Scanner;

public class ex04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int idade, somaIdade = 0, maiorIdade = 0;
		double mediaIdade = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			if (idade >= 18) {
				maiorIdade++;
			}
			
			somaIdade = somaIdade + idade;
			mediaIdade = (double) somaIdade / 20;
			
		}
		
		System.out.println("Soma das idades: " + somaIdade);
		System.out.println("Média das idades: " + mediaIdade);
		System.out.println("Quantidade de pessoas maiores de idade: " + maiorIdade);
		
		entrada.close();
		
	}

}
