package EstruturasDecicao;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro: ");
        double valor1 = leitor.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2= leitor.nextDouble();

        if (valor1 > valor2) {
            System.out.println(valor1);
        } else if (valor2 > valor1) {
            System.out.println(valor2);
        } else {
            System.out.println("os números são iguais");
        }
    }

}
