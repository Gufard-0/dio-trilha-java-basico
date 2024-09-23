import java.util.InputMismatchException;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        /* Excessoes previstas:
         * Nao informar o nome/sobrenome
         * O valor da idade nao ser numerico
         * O valor da altura ter uma virgula ao inves de ser um ponto (conforme padrao americano)
         */

        try {
            // Criando o objeto scanner
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite seu idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();


            // Imprimindo os dados do usuario

            System.out.println("Ola me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
        } catch (InputMismatchException e) {
            System.out.println("Os campos de idade e altura devem ser numericos, digite a altura utilizando virgula");
            
        }

        
        
    }
    
}
