import java.util.Scanner;
import java.lang.Math;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        double numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = (int) Math.ceil(numeroTotalPods/podsPorNode);

        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = (int) Math.ceil(numeroTotalPods/podsPorServidor);

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        if(numeroMinimoNodes <= 1){
            System.out.println("1.Recomendamos usar um unico node");
        }else {
            System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);
        }
        if (numeroMinimoServidores <= 1){
            System.out.println("2.Recomendamos usar um unico servidor");
        }else {
            System.out.println("2.Numero minimo de servidores:"+ numeroMinimoServidores);
        }

        // Fechando o Scanner
        scanner.close();
    }
}