package JavaTreino;
import java.util.Scanner;
public class ExVetor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        String[] nomes = new String[5];

        for(int i = 0; i<5 ; i++) {
            System.out.println("Qual sua idade? ");
            vet[i] = sc.nextInt();

            sc.nextLine();

            System.out.println("Qual seu nome?");
            nomes[i] = sc.nextLine();
        }

        int soma = 0;
        for (int i = 0; i<5; i++){
            soma+= vet[i];
        }

        double media = soma/ 5;
        System.out.println("A media é = " + media);

        System.out.println("pessoas acima da media: ");
        for(int i = 0;i<5;i++){
            if (vet[i] > media){
                System.out.println(nomes[i] + "-" + vet[i] + " anos");
            }
        }
    }
}
