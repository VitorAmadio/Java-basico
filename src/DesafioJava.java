import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        double saldo = 2500;
        String nome = "Vitor";
        String tipoConta = "Corrente";
        Scanner ler = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("Bem-vindo " + nome );
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial " + saldo);
        System.out.println("**************************************");

        boolean parar = false;
        while (!parar){
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("0 - Sair");
            int opcao;
            try {
                System.out.println("Insira um número");
                opcao = ler.nextInt();
                if (opcao == 1){
                    System.out.println("Seu saldo é de R$ " + saldo);
                } else if (opcao == 2) {
                    System.out.println("Insira o valor desejado!");
                    try{
                        double valorAdicionar = ler.nextDouble();
                        saldo += valorAdicionar;
                        System.out.println("Agora seu saldo é de R$ " + saldo);
                    }catch (Exception e){
                        System.out.println("Insira um valor numérico");
                        ler.next();
                    }

                }else if (opcao == 3){
                    System.out.println("Insira o valor para ser transferido");
                    try{
                        double valorTranseferir = ler.nextDouble();
                        if (valorTranseferir > saldo){
                            System.out.println("Não é possivel transefir um valor maior que seu saldo");
                        }else{
                            saldo -= valorTranseferir;
                            System.out.println("Agora seu saldo é de R$ " + saldo);
                        }
                    }catch (Exception e){
                        System.out.println("Insira um valor numérico");
                        ler.next();
                    }
                } else if (opcao == 0) {
                    parar = true;
                    break;
                }else {
                    System.out.println("Informe um valor válido!");
                }
            }catch (Exception e){
                System.out.println("Informe um valor que seja numérico");
                ler.next();
            }

        }
        System.out.println("Obrigado por usar meu sistema");
    }
}
