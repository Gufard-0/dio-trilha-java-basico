import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Bem vindo !!! Por favor, digite as informações solicitadas a seguir");


            System.out.println("Nome do Cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.println("Número da agência: ");
            String agencia = scanner.nextLine();

            System.out.println("Número da conta: ");
            int numeroConta = scanner.nextInt();
            
            System.out.println("Saldo: ");
            double saldo = scanner.nextDouble();


            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponivel para saque.");
        

    }
}
