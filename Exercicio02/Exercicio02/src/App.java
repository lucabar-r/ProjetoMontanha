import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Lado A: ");
        int ladoA = leitor.nextInt();

        System.out.print("Lado B: ");
        int ladoB = leitor.nextInt();

        System.out.print("Lado C: ");
        int ladoC = leitor.nextInt();

        // Se todos os lados forem iguais...
if (ladoA == ladoB && ladoB == ladoC) {
    System.out.println("Triângulo Equilátero.");

// Senão, se PELO MENOS DOIS lados forem iguais...
} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
    System.out.println("Triângulo Isósceles.");

// Senão (se não for nenhum dos de cima, só sobra uma opção: todos diferentes!)
} else {
    System.out.println("Triângulo Escaleno.");
}
leitor.close();

    }
}