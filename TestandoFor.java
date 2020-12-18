public class TestandoFor{
    public static void main(String args[]){
        int valor;

        valor++; // valor += 1; valor = valor + 1;
        valor--; // valor -= 1; valor = valor - 1; 
        valor += 10; // valor = valor + 10;
        valor *= 2;  // valor = valor *  2;
        //   inicio      condicao      mudança
        for (valor=0 ;  valor <= 10  ; valor++){
            System.out.println("Valor = "+valor);
        }
    }
}