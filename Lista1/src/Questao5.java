import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o numero de lados: ");
        int numeroLados = scanner.nextInt();

        System.out.println("Digite a medida dos lafos em cm: ");
        double medidaLado = scanner.nextDouble();

        if (numeroLados == 3){
            double areaTriangulo = (medidaLado * medidaLado * Math.sqrt(3)) / 4;
            System.out.println("TRIÂNGULO");
            System.out.println("Área: " + areaTriangulo);
        } else if (numeroLados == 4) {
            double areaQuadrado = medidaLado * medidaLado;
            System.out.println("QUADRADO");
            System.out.println("Área: " + areaQuadrado);
        } else if (numeroLados == 5) {
            double areaPentagono = (5 * Math.pow(medidaLado, 2) * (Math.PI / 5)) / 4;
            System.out.println("PENTÁGONO");
            System.out.println("Área: " + areaPentagono);
        } else{
            System.out.println("Polígono não suportado");
        }
    }
}

