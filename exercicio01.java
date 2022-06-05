import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        int anos;
        int meses;
        int dias;
        int diasDoMes = 30;
        int diasDoAno = 365;
        int total;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos anos voce tem?");
        anos = entrada.nextInt();

        System.out.println("Quantos meses voce tem?");
        meses = entrada.nextInt();

        System.out.println("Quantos dias voce tem?");
        dias =  entrada.nextInt();

        total = (anos * diasDoAno) + (meses * diasDoMes) +dias;

        System.out.println("Voce tem "+ total + " dias");










    }
}