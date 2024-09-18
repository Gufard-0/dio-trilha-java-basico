public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 26;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            
        } else {
            System.out.println("Saldo insuficiente");
            
        }
        System.out.println("Saldo: " + saldo);
    }
    
}
