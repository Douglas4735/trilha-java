import java.util.Locale;
import java.util.Scanner;

public class ScannerTeste {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("DIGITE SEU NOME: ");
        String nome = sc.next();

        System.out.println("DIGITE SEU SOBRENOME: ");
            String sobreNome = sc.next();

        System.out.println("DIGITE SUA IDADE");
        int idade = sc.nextInt();

        System.out.println("DIGITE SUA ALTURA: ");
        double altura = sc.nextDouble();


        System.out.println("Seu nome "+nome+" sobre nome "+sobreNome+" idade "+idade+" anos e altura de "+ altura+" cm.");
    }
    
}
