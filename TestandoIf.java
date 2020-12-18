import java.util.Scanner;

public class TestandoIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Por favor, digite sua nota n1");
        n1 = teclado.nextDouble();
        System.out.println("Agora digite sua nota n2");
        n2 = teclado.nextDouble();

        media = (n1 + n2)/2;

        System.out.println("Sua media final ficou em "+media);

        if ( media >= 7.0 ) {
            System.out.println(" PARABENS VOCE FOI APROVADO!");
        }
        else {
            System.out.println(" PARABENS VOCE GANHOU UM VOUCHER PARA OUTRO CURSO IGUAL!");
        }
    

        System.out.println("*** FIM DO PROGRAMA *** ");
    }
}