import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo numero inteiro: ");
        int num2 = scanner.nextInt();

        int maiorNumero;

        if(num1 > num2){
            maiorNumero = num1;
        } else{
            maiorNumero = num2;
        }
        System.out.println("O maior numero é o " + maiorNumero);


    }
}
