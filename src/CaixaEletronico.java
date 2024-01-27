import java.util.Scanner;

public class CaixaEletronico {
    private static double saldo = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Caixa Eletrônico");

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Sacar Dinheiro");
            System.out.println("3. Depositar Dinheiro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    verSaldo();
                    break;
                case 2:
                    sacarDinheiro(scanner);
                    break;
                case 3:
                    depositarDinheiro(scanner);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Caixa Eletrônico. Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void verSaldo(){
        System.out.println("Seu saldo atual é: R$" + saldo);
    }

    private static void sacarDinheiro(Scanner scanner) {
        System.out.println("Digite o valor que deseja scar: ");
        double valor = scanner.nextDouble();
        if(valor <= saldo) {
            saldo -= valor;
            System.out.println("Retire seu dinheiro. Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private static void depositarDinheiro(Scanner scanner){
        System.out.println("Digite o valor que deseja depositar: ");
        double valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("Depósido realizado com sucesso. Novo saldo: R$" + saldo);
    }

}
