import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas maças foram compradas: ");
        int quantidade = scanner.nextInt();

        if (quantidade < 12) {
            System.out.println("O valor total da compra é: " + quantidade * 0.30);
        } else {
            System.out.println("O valor total da compra é: " + quantidade * 0.25);
        }
    }
}
