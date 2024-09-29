public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        System.out.println("Volume Atual? " +smartTv.volume);

        System.out.println("Tv ligada? " +smartTv.ligada);
        System.out.println("Canal Atual? " +smartTv.canal);
        

        smartTv.ligar();
        //smartTv.aumentarVolume();
        //smartTv.aumentarVolume();
        //smartTv.aumentarVolume();
        System.out.println("Novo Status Tv ligada? " +smartTv.ligada);
        System.out.println("Aumentando volume "+smartTv.volume);

        //smartTv.desligar();
        //smartTv.diminuirVolume();
        //System.out.println("Novo Status Tv ligada? " +smartTv.ligada);
        //System.out.println("diminuido o volume "+smartTv.volume);


        
    }
}
