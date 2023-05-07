import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);//basicamente vai ver se eu vou fazer um input no teclado

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();//Ler um texto e armazenar na variavel


        System.out.println("Digite o ano de lançamento");
        int anoLancamento = leitura.nextInt();
        System.out.println("Diga sua nota para o filme");
        double avaliacao = leitura.nextDouble();
        System.out.println(anoLancamento);
        System.out.println(filme);
        System.out.println(avaliacao);
        leitura.close();
    }
}
