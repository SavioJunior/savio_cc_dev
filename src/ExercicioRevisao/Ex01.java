package ExercicioRevisao;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("entre com o valor: ");
        Scanner sc = new Scanner(System.in);
        double valorvenda = sc.nextDouble();
        double resultadodaconta = valorvenda * 0.1;
        System.out.println(resultadodaconta);



    }
}
