package JavaTreino;
import java.util.Scanner;
public class Udemy {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int x;

        do {
            System.out.println("Digite um numero de 1 a 7: ");
             x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("segunda");
                    break;
                case 2:
                    System.out.println("Terça");
                    break;
                case 3:
                    System.out.println("Quarta");
                    break;
                case 4:
                    System.out.println("Quinta");
                    break;
                case 5:
                    System.out.println("Sexta");
                    break;
                case 6:
                    System.out.println("sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }


        } while (x != 0);

            System.out.println("Fim do programa");
            sc.close();


    }
}

