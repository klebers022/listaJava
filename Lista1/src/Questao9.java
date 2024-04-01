import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a valor do primeiro angulo");
        int angulo1 = scanner.nextInt();

        System.out.println("Digite a valor do segundo angulo");
        int angulo2 = scanner.nextInt();

        System.out.println("Digite a valor do terceiro angulo");
        int angulo3 = scanner.nextInt();

        int soma = angulo1 + angulo2 + angulo3;

        if (soma == 180 && angulo1 == 90 || angulo2 == 90 || angulo3 == 90 ) {
            System.out.println("Triângulo Retângulo");
        } else if (soma == 180 && angulo1 > 90 || angulo2 > 90 || angulo3 > 90 ) {
            System.out.println("Triângulo Obtusângulo");
        } else  {
            System.out.println("Triângulo Acutângulo");
        }
    }
}
