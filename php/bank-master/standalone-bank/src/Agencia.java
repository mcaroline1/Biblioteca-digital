import java.util.Scanner;

public class Agencia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int op = -1;
		Conta conta = null;

		do {
			System.out.println("Informe a opção: ");
			System.out.println("0= Sair");
			System.out.println("1=Criar conta corrente");
			System.out.println("2=Sacar");
			System.out.println("3=Gerar taxa");

			op = leitor.nextInt();

			switch (op) {
			case 0:
				System.out.println("Obrigado pela visita!");
				break;
			case 1:
				System.out.println("Informe o valor do saldo: ");
				double saldo = leitor.nextDouble();

				System.out.println("Informe o limite: ");
				double limite = leitor.nextDouble();

				System.out.println("Informe o tipo de servico( 1= Minimo 2= Máximo): ");
				int servico = leitor.nextInt();

				conta = new ContaCorrente(saldo, limite, servico);

				break;
			case 2:
				System.out.println("Informe o valor do saque: ");
				double saque = leitor.nextDouble();

				conta.sacar(saque);

				break;
			case 3:
				conta.gerarTaxa();

				break;
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("Saldo atual: " + conta.verificarSaldo());
		} while (op != 0);
	}
}
