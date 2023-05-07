import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        int i = 1;
        int numeroDigitado = 0;
        int numeroAleatorio = aleatorio.nextInt(100);
        int valorLeitura, tentativas;

        while (numeroDigitado != numeroAleatorio){

            tentativas = 5-i;
            System.out.println("Digite o número desejado");

            valorLeitura = leitura.nextInt();

            if (valorLeitura < numeroAleatorio){
                System.out.println("O número é maior, restam " + tentativas + " Tentativas");
            } else if (valorLeitura > numeroAleatorio) {
                System.out.println("O número é menor restam " + tentativas + " Tentativas");
            }else {
                System.out.println("Meus parabéns, vc acertou!");
                break;
            }
            if(i <= 5){
                i++;
            }else {
                break;
            }

        }
    }
}
