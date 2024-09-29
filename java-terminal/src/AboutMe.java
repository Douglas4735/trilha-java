public class AboutMe {
    public static void main(String[] args) {
        
        //Os argumentos começam com o indice 0.

        String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[2]);// vamos falar sobre
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo "+ nome +" "+sobreNome);
        System.out.println("Tenho " +idade + " anos.");
        System.out.println("Minha altura "+altura + "cm.");

    }
    
}
