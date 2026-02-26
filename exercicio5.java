import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2, num3, num4, result;


        System.out.println("Digite quatro números: ");

        num1 = ler.nextInt();
        num2 = ler.nextInt();
        num3 = ler.nextInt();
        num4 = ler.nextInt();

        result = num1 + num2 + num3 + num4;

        System.out.printf("O resultado da soma dos 4 números foi de: %d" , result);

    }
}