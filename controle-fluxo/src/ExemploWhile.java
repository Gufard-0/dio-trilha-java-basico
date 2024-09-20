import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 10.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                /* 
                // para sobrar mesada caso o proximo doce seja mais caro do que o restante do dinheiro

                break;
                */
                // torna o valor do ultimo doce o restante da mesada
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;

        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou toda mesada em doces");
 
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
