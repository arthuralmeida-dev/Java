package JavaTreino;
import java.util.Scanner;
public class ExVetor3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int x,r;
        System.out.println("Qual o primeiro termo da PA?");
        x = sc.nextInt();
        System.out.println("Qual a razao da PA?");
        r = sc.nextInt();

        vet[0] = x;

        for (int i = 1; i < 10; i++){
            vet[i] = vet[i-1] + r;
        }

        System.out.println("PA com 10 termos:");

        for (int i = 0; i < 10; i++){
            System.out.println(vet[i] + " ");
        }
    }
}
