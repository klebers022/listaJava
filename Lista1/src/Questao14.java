public class Questao14 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Número do termo desejado
        int resultado = fibonacci(n);

        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + resultado);
    }
}
