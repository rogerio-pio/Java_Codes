import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        System.out.println("Quantidade de servidores: ");
        int quantidadeServidores = scanner.nextInt();

        System.out.println("Quantidade de banco de dados: ");
        int quantidadeBancosDados = scanner.nextInt();

        //TODO: Calcule os custos
        double custoTotal = (quantidadeServidores * 0.15) + (quantidadeBancosDados * 0.05);


        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        // Fechando o Scanner
        scanner.close();
    }
}