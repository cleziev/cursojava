import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        if (valor % 2 ==0){
                valor +=1;
        }

        for (int cont=1; cont<=6; cont+=1){
        System.out.println(valor);
        valor +=2;
        }

    }
}

   