import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media <=4){
            System.out.println("Reprovado");
        } else if (media > 4 && media <= 7){
            System.out.println("Exame");
        } else {
            System.out.println("Aprovado");
        }
    }
}
