import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble(); 


        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble(); 


        System.out.println("Operações: 1-Soma  2-Subtração  3-Multiplicação  4-Divisão");
        System.out.print("Escolha: ");
        int escolha = leitor.nextInt();
        

double resultado = 0;

boolean operacaoValida = true; 


switch (escolha) {
    case 1:
        resultado = numero1 + numero2; 
        break; 

    case 2:
        resultado = numero1 - numero2; 

    case 3:
        resultado = numero1 * numero2; 
        break;

    case 4:

        if (numero2 == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
            operacaoValida = false; 
        } else {
            resultado = numero1 / numero2; 
        }
        break;

    default:
        System.out.println("Opção inválida!");
        operacaoValida = false;
        break;
}

if (operacaoValida == true) {
    System.out.println("Resultado: " + resultado);
}
leitor.close();
    }
}