public class TreinoJava {
    public static void main(String[] args) {
        

        double saldo = 25.0;
        double valorSolicitado = 150.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println("Novo saldo = "+saldo);
        }else{
            System.out.println("O valor que você solicitou é: "+valorSolicitado);
            System.out.println("Seu saldo é: "+saldo);

        }

    }
    
}
