package exercicio05_Switch;

import java.util.Scanner;

public class exercicio05_Switch {

	public static void main(String[] args) {
		int opcao, quantidade;
		float total;
		Scanner leia = new Scanner(System.in);

		System.out.println("- -- --- ----   Opções   ---- --- -- -");
		System.out.println("--Digite 1 para pedir Cachoro Quente--");
		System.out.println("--Digite 2 para pedir X-Salada--");
		System.out.println("--Digite 3 para pedir X-Bacon--");
		System.out.println("--Digite 4 para pedir Bauru--");
		System.out.println("--Digite 5 para pedir Refrigerante--");
		System.out.println("--Digite 6 para pedir Suco de Laranja--");

		System.out.println("Digite a opção desejada: ");
		opcao = leia.nextInt();

		System.out.println("Digite a quantidade desejada: ");
		quantidade = leia.nextInt();

		switch (opcao) {
		case 1:
			total = quantidade * 10;
			System.out.println("Produto: Cachoro Quente");
			System.out.println("Valor total: RS" + total);
			break;
		case 2:
			total = quantidade * 15;
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: RS" + total);
			break;
		case 3:
			total = quantidade * 18;
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: RS" + total);
			break;
		case 4:
			total = quantidade * 12;
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: RS" + total);
			break;
		case 5:
			total = quantidade * 8;
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: RS" + total);
			break;
		case 6:
			total = quantidade * 13;
			System.out.println("Produto: Suco de Laranja");
			System.out.println("Valor total: RS" + total);
			break;
		default:
			System.out.println("Opção Inválida");

		}
	}

}
