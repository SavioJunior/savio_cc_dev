package ExercicioRevisao;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        System.out.println("Parte 02 ...");
double valorfolhas;

        System.out.println("Digite o numero de folhas" );
        Scanner numerofolhas = new Scanner(System.in);
        double resultadodefolhas = numerofolhas.nextDouble();
        if (resultadodefolhas < 101 ){
            valorfolhas = 0.25;
        } else {
            valorfolhas = 0.20;
        }
        System.out.println(valorfolhas * resultadodefolhas);






    }
}
