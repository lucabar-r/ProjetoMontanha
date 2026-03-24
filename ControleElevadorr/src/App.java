import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // ENTRADA: Variáveis int
        System.out.print("Digite a capacidade máxima (C): ");
        int limiteC = leitor.nextInt();
        
        System.out.print("Digite o peso da caixa A: ");
        int cargaA = leitor.nextInt();
        
        System.out.print("Digite o peso da caixa B: ");
        int cargaB = leitor.nextInt();

        // PROCESSAMENTO: Operação
        int somaPesos = cargaA + cargaB;

        // SAÍDA: Decisão (if/else)
        if (somaPesos < limiteC) {
            System.out.println("Seguro: A soma dos pesos é estritamente menor que o limite.");
        } else {
            System.out.println("Alerta: A capacidade foi atingida ou ultrapassada!");
        }

        leitor.close();
    }
}