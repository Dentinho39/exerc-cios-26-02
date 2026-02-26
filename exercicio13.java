import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double numero,quadrado,cubo,raizQuadrada,potencia10;

        System.out.println("Digite um número positivo: ");
        numero = ler.nextDouble();

        quadrado = Math.pow(numero, 2);

        cubo = Math.pow(numero, 2) * numero;

        raizQuadrada = Math.sqrt(numero);

        potencia10 = Math.cbrt(numero);

        System.out.printf("%.2f Ao quadrado é igual à: %.2f%n",numero , quadrado);
        System.out.printf("%.2f Ao cubo é igual à: %.2f%n",numero , cubo);
        System.out.printf("A raiz quadrada de %.2f é igual a %.2f%n" , numero, raizQuadrada);
        System.out.printf("a potencia de %.2f elevado a 10 é igual a %.2f%n " , numero, potencia10);

    }
}
