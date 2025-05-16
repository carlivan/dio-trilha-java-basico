import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Informe o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser menor que o segundo!!!!");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        } 
        

        int contador = parametroDois - parametroUm;

        for(int x=1; x <= contador; x++){
            System.out.println("Imprimindo o número " + x);
        }
    }
}
