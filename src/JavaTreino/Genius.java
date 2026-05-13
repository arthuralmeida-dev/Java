package JavaTreino;
import java.util.Scanner;
import java.util.Random;
public class Genius {
    public static void main(String[]args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int[] sequencia = new int[10]; // Array para armazenar a sequência
        int tamanho=0; // Controla quantos números temos
        Random rand = new Random();

        int nivel = 1;
        int maximo = 3;
        boolean continuar = true;

        System.out.println("===== BEM VINDO AO GENIUS ====\n");

        while(continuar){
            sequencia[tamanho] = rand.nextInt(maximo) + 1;
            tamanho++;

            System.out.println("Nivel: " + nivel + "| Sequencia: " + tamanho);
            System.out.println("Numeros de 1 a " + maximo + "\n");

            // Mostra a sequência
            System.out.println("Vendo a sequencia...");
            for(int i = 0; i<tamanho ; i ++){
                System.out.println(sequencia[i] + " ");
                Thread.sleep(800);
            }
            System.out.println("\n");

            // Pede para o usuário digitar
            System.out.println("Digite a sequência: ");
            boolean acertou = true;

            for(int i = 0; i < tamanho; i ++){
                int entrada = sc.nextInt();

                if (entrada != sequencia[i]){
                    acertou = false;
                    break;
                }
            }

            if(!acertou){
                System.out.println("\n ERROU! Gamer over!");
                System.out.println("Você chegou ate a sequencia: " + tamanho);
                continuar = false;
            }else{
                System.out.println("Acertou!\n");

                // Se completou 10 números, passa de nível
                if(tamanho == 10){
                    System.out.println("PARABENS! Você passou de nivel!");
                    nivel++;
                    maximo = 3 + (nivel - 1) * 3;

                    // Limpa a sequência (reseta o tamanho)
                    tamanho = 0;

                    System.out.println("NOVO NIVEL: " + nivel + "\n");
                    Thread.sleep(2000);
                }
            }
        }

    }
}
