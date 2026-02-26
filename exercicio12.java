import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int anoDeNascimento, anoAtual, idade, idade2030;

        System.out.println("Digite o seu ano de nascimento: ");
        anoDeNascimento = ler.nextInt();

        System.out.println("Digite o ano atual: ");
        anoAtual = ler.nextInt();;

        idade = anoAtual - anoDeNascimento;
        idade2030 = 2030 - anoDeNascimento;

        System.out.printf("A idade atual é de %d%n" , idade);
        System.out.printf("A idade em 2030 será de %d" , idade2030);


    }
}
