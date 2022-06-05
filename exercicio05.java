import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        // quantas balas a pessoa comprou e quanto custa cada bala
        // quantos pirulitos a pessoa comprou e quanto custa cada pirulito
        // desconto de 10% do valor total

        int qtdBala;
        int qtdPirulito;
        float valorBala;
        float valorPirulito;
        double total;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de balas");
        qtdBala =  entrada.nextInt();

        System.out.println("Quantidade de pirulitos");
        qtdPirulito =  entrada.nextInt();

        System.out.println("Quanto custa cada bala?");
        valorBala =  entrada.nextFloat();

        System.out.println("Quanto custa cada pirulito?");
        valorPirulito =  entrada.nextFloat();

        total = (valorBala * qtdBala) + (valorPirulito * qtdPirulito);

        System.out.println( "O total e de: "+  total );

        System.out.println("O valor do desconto e de: " +  total * 0.10 );










    }
}