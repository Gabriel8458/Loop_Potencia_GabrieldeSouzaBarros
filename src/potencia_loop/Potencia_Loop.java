package potencia_loop;
import java.util.Scanner;
public class Potencia_Loop {

    public static void main(String[] args) {
        Scanner entrada;
        double result, num;
        int i;
        entrada = new Scanner(System.in);
         
        System.out.print("Digite seu número: ");
        num = entrada.nextDouble();
        
        for (i=0; i<16; i++)
        {
            result = Math.pow(num, i);
            System.out.println(num +" elevado a "+ i +"= " + result);
        }
        
        
    }
    
}
