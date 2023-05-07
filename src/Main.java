// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Sreen Macth!");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento " + ano);
        boolean incluidoNoPlano = false;
        double notaFilme = 8.1;
        //media calculada a partir de 3 notas
        double media = (9.8 + 6.3 + 9.5 ) / 3;

        System.out.println(media);

        String sinopse;
        sinopse= """
                Filme Top Gun 
                aventura com galã dos anos 80
                Muito bom
                """ + ano;
        System.out.println(sinopse);

        /*String nome = "Vitor";
        int idade = 20;
        double valor = 59.66;
        System.out.println(String.format("Meu nome é %s, tenho %d anos e gastei %.2f",nome, idade, valor ));
        String mensagem = """
                Olá, %s 
                Bem vindo ao curso de java, temos %d aulas
                """.formatted(nome, idade);
        System.out.println(mensagem);*/

        int classificacao = (int) (media / 2); //Deste modo ele vai converter a variavel media para int
        System.out.println(classificacao);


    }
}