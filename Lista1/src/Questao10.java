import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo do produto: ");
        int codigo = scanner.nextInt();

        if (codigo == 1){
            System.out.println("O produto é: Alimento não-perecível");
        } else if (codigo == 2 ) {
            System.out.println("O produto é: Alimento perecível");
        } else if (codigo == 3) {
            System.out.println("O produto é de vestiario");
        } else if (codigo == 4) {
            System.out.println("O produto é de higiene pessoal");
        } else if (codigo >= 8 && codigo <= 15) {
            System.out.println("O produto é de limpeza e utensílios domésticos");
        } else {
            System.out.println("Código inválido");
        }
    }
}
