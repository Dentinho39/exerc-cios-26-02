import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota");
        nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota");
        nota2 = ler.nextDouble();

        System.out.println("Digite a terceira nota");
        nota3 = ler.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das três notas é de: %.2f", media);

    }
}
