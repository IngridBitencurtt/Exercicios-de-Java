import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //quanto o usuario ganha?
        //imprimir qnt ele ganha com reajuste de 1%
        float salario;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto tu ganha?");
        salario =  entrada.nextFloat();
        System.out.println("com o reajuste teu salario passou a ser:");
        System.out.println((salario * 0.01)  + salario);


    }
}