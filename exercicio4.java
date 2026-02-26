import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2;


        System.out.println("Digite dois números inteiros: ");

        num1 = ler.nextInt();
        num2 = ler.nextInt();

        System.out.printf("Você digitou %d e %d", num1, num2);

    }
}