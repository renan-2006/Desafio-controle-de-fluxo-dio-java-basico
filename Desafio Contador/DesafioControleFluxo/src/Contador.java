import java.util.Locale;
import java.util.Scanner;

public class Contador{
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = Scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = Scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
          
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            System.out.println("O número de ocorrências é " + contagem);

            for(int i = 0; i <= contagem; i++)
            System.out.println(i);
        }
    }

    private static void ParametrosInvalidosException() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
    }

}
