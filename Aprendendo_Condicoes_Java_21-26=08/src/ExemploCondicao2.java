import java.util.Scanner;

public class ExemploCondicao2 {

        /* Quero adicionar um desconto gradativo
         Valor Maior que 1000 - 10%
         Valor Maior que 2000 - 20%
         Valor Maior que 3000 - 30%
         Valor Menor igual a 1000 - 0%
         */

    public static void main(String[] args) {

        double jorgeBruto = 0.0;
        double desconto = 0.0;

        Scanner picas = new Scanner(System.in);
        System.out.println("Informe o valor bruto: ");
        jorgeBruto = picas.nextDouble();


        /* Operadores Lógicos
        && significa "E"
        || significa "OU"
         */

        if (jorgeBruto > 1000 && jorgeBruto <= 2000) {
            desconto = jorgeBruto * 0.10;
        }
        else if (jorgeBruto > 2000 && jorgeBruto <= 3000) {
            desconto = jorgeBruto * 0.20;
        }
        else {
            desconto = jorgeBruto * 0.30;
        }
        System.out.println("O valor bruto é " + jorgeBruto);
        System.out.println("O valor de desconto é " + desconto);
        System.out.println("O valor com desconto é " + (jorgeBruto-desconto));
    };


}