import java.util.Scanner;
public class Uri1050V2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int ddd = teclado.nextInt();

        switch(ddd){
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 61:
                System.out.println("Brasilia");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }
    }
}