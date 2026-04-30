package JavaTreino;
import java.util.Scanner;
public class Modularizacao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quais serão os primeiros numeros primos? ");
        int N = sc.nextInt();
        int x = 2, soma = 0,cont = 0;
        while (cont < N) {
            if (primo(x)) {
                soma += x;
                cont++;
            }
            x++;
        }
        System.out.println("A soma dos numeros primos = " + soma);
    }


    public static boolean primo(int N) {
        int divisores = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisores++;
            }
        }
        return divisores == 2;
    }
}