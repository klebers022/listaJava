import java.util.Scanner;


public class Questão5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("insira o numero de lados do poligono regular: ");
        int quantidadedeLados = scanner.nextInt();

        System.out.println("Insira a medida do lado do polgono regular");
        int medidaLado = scanner.nextInt();

        double area = calcularArea(medidaLado, quantidadedeLados);

        String classificao = classificarPoligono(quantidadedeLados);

        System.out.println("Seu poligono é um " + classificarPoligono(quantidadedeLados));
        System.out.println("A area é " + calcularArea(medidaLado, quantidadedeLados));




    }

    private static String classificarPoligono(int quantidadedelados) {
        String nome;
        if (quantidadedelados <3){
            nome = "NÃO É UM POLÍGONO";
        } else if (quantidadedelados == 3){
             nome = "triangulo";
        } else if (quantidadedelados == 4) {
             nome = "quadrado";
        } else if (quantidadedelados == 5) {
             nome = "pentagono";
        } else {
             nome = "POLÍGONO NÃO IDENTIFICADO.";
        }

        return nome;




    }


    static double  calcularArea(int medidalado, int quantidadedelados){
        double perimetro = quantidadedelados * medidalado;
        double semiperimetro = perimetro/2;
        double apotema = medidalado / (2 * Math.tan(Math.PI / quantidadedelados));
        double resultado = apotema * semiperimetro;
        return resultado;
    }

}
