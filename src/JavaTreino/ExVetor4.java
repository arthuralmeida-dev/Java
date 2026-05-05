package JavaTreino;
import java.util.Random;
public class ExVetor4 {
    public static void main(String[] args) {
        int[] vet=new int[5];
        preenche(vet);
        mostra(vet);
        System.out.println(max(vet));
    }

    public static void preenche(int[] v) {
        Random rand=new Random();
        for(int i=0; i<v.length; i++) {
            v[i]=rand.nextInt(10);
        }
    }

    public static void mostra(int[] v) {
        for(int i=0; i<v.length; i++) {
            System.out.print(v[i]+" ");
        }
        System.out.println();
    }

    public static int max(int[] v) {
        int maior=0;

        for(int i=1; i<v.length; i++) {
            if(v[i]>v[maior]) {
                maior=i;
            }
        }
        return maior;
    }

}
