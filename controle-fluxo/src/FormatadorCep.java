import java.util.Scanner;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            // criando scanner
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o seu CEP: ");
            String cepFormatado = formatarCep(scanner.nextLine());
            
            
            scanner.close();
            
            System.out.println("");
            System.out.println("Seu CEP é: " + cepFormatado);



        } catch (CepInvalidoException e) {
            System.out.println("");
            System.out.println("O cep deve ter 8 digitos");
            
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) {
            throw new CepInvalidoException();

        }

        // simulando cep formatado
            return cep.substring(0, 5) + "-" + cep.substring(5);
            /*
             * Substring: A função substring é usada para extrair partes específicas de uma string.
             
                cep.substring(0, 5): Extrai os primeiros 5 dígitos do CEP.
                cep.substring(5):    Extrai os últimos 3 dígitos do CEP.
             */

    }
}
