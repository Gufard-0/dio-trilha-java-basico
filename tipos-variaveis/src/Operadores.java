public class Operadores {

    public static void main(String[] args) {

        /*
        String nomeCompleto = "Linguagem " + "Java ";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        */



        /* 
        int numero = 5;
        numero = - numero;

        System.out.println(- numero);
        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);
        */



        /* 
        boolean variavel = true;
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);
        */



        



        /*
        int a, b;
        a = 5;
        b = 6;

        //Exemplo de condicional utilizando ?:
        String resultado = a == b ? "Verdadeiro" : "Falso";

        String resultado = a == null ? (): a;
        

        System.out.println(resultado);
        */

        /* Exemplo de condicional utilizando if/else 
        String resultado = "";

        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
        */



        /*
        String nomeUm = "Gustavo";
        String nomeDois = new String ("Gustavo");

        System.out.println(nomeUm.equals(nomeDois));

        /////
         
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);
        */

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && (7 > 4)) {
            System.out.println("as duas sao verdadeiras");
        } 
        if (condicao1 || condicao2) {
            System.out.println("uma das duas é verdadeira");
        }
        
        System.out.println("fim");


    }
    
}
