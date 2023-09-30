package EstruturasDecicao;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");

        double numero = leitor.nextDouble();

        if (numero > 0) {
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("neutro");
        }
    }

}
