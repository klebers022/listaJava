import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu conceito: ");
        String conceito = scanner.next();

        switch (conceito) {
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Otimo");
                break;
            case "C":
                System.out.println("Bom");
                break;
            case "D":
                System.out.println("Regular");
                break;
            case "E":
                System.out.println("Ruim");
                break;

            case "F":
                System.out.println("Reprovado");

            default:
                System.out.println("Conceito inválido");
                break;
        }


    }
}
