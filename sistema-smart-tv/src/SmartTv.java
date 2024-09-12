/**
 * SmartTv
 */
public class SmartTv {
    private boolean ligada = false;
    int canal = 1;
    int volume = 25;



    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void status(){
        System.out.println(ligada);
        System.out.println(volume);
        System.out.println(canal);
        
    }

}