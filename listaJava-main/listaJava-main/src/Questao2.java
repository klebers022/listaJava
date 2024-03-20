import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insira seu ano de nascimento para validar o seu direito de voto");
        int anoDenascimento = scanner.nextInt();

        int idade = 2024 - anoDenascimento;

        boolean podeVotar = idade >= 16;

        String resultado = podeVotar ? "Pode votar" : "Não pode votar";

        System.out.println(resultado);




    }
}
