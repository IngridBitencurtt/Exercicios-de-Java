import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        // faca um algoritmo que receba o numero do usario que imprima o seu antecessor e o seu sucessor
        int numero;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um numero");
        numero =  entrada.nextInt();

        System.out.println("O sucessor e "+  (numero + 1)  +" o antecessor e " + (numero - 1));





    }
}