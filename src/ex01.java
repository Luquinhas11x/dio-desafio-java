import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
		double porcentagem = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();

			if (idade <= 15) {
				total1++;
			} else {
				if (idade >= 16 && idade <= 30) {
					total2++;
				} else {
					if (idade >= 31 && idade <= 45) {
						total3++;
					} else {
						if (idade >= 46 && idade <= 60) {
							total4++;
						} else {
							total5++;
						}
					}
				}
			}
		}

		porcentagem = (double) total1 / 5 * 100;

		System.out.println("A quantidade de pessoas na 1ª faixa etária é de: " + total1);
		System.out.println("A quantidade de pessoas na 2ª faixa etária é de: " + total2);
		System.out.println("A quantidade de pessoas na 3ª faixa etária é de: " + total3);
		System.out.println("A quantidade de pessoas na 4ª faixa etária é de: " + total4);
		System.out.println("A quantidade de pessoas na 5ª faixa etária é de: " + total5);

		System.out.println("A porcentagem de pessoas na primeira faixa etária, com relação ao total de pessoas é de: "
				+ porcentagem + "%");
		
		entrada.close();
	}
}
