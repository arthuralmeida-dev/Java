package JavaTreino;
import java.util.Scanner;
public class ExVetor2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x, menor;

        int[] vet = new int[10];

        for (int i = 0; i <10; i++) {
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 9; j++) {
                if (vet[j] > vet[j+1]){
                    int temp = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++){
            System.out.println(vet[i] + " ");
        }


    }
}
