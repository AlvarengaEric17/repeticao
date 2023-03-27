import java.util.Scanner;

public class tabuada {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        int numero, resultado;
        System.out.print("Digite um número para imprimir a tabuada: ");
        numero = input.nextInt();

        for (int i = 0 ; i <= 10; i++){
        resultado = numero * i;
        System.out.print(numero + " X " + i + " = " + resultado + "\n");
        }


    }
}