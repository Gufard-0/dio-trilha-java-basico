public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
            System.out.println("NEW -> Tv ligada? " + smartTv.ligada);
        smartTv.desligar();
            System.out.println("NEW -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
            System.out.println("NEW -> Volume: " + smartTv.volume);

        
        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("Canal: " + smartTv.canal);



    }
}
