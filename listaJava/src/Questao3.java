import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        String senhaValida = "1234";


        System.out.println("Insira a senha: ");
        Scanner scanner= new Scanner(System.in);
        String senha =  scanner.next();


        if (senhaValida.equals(senha)){
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }


    }
}
