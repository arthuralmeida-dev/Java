package JavaTreino;
import java.util.Scanner;
public class Modularizacao4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dois numeros desejados:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Qual a operação desejada?");
        System.out.println("1-soma" + " 2-subtração "+" 3-multiplicacao "+" 4-divisao "+" 5-trocar valores "+" 6-sair");
        int opcao = sc.nextInt();
        while (opcao != 6){
            if (opcao == 5){
                System.out.println("Digite os novos valores: ");
                x = sc.nextInt();
                y = sc.nextInt();
            } else {
            switch (opcao) {
                case 1 -> soma(x, y);
                case 2 -> subtracao(x, y);
                case 3 -> multiplicacao(x, y);
                case 4 -> divisao(x, y);
                default -> System.out.println("opção invalida");
            }
            System.out.println("Digite outros dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();
            }
            System.out.println("Qual a operação desejada? ");
            System.out.println("1-soma" + " 2-subtração "+" 3-multiplicacao "+" 4-divisao "+" 5-trocar valores "+" 6-sair");
            opcao = sc.nextInt();
        }

    }

        public static void soma(int x,int y){
          System.out.println(x + y);
        }

        public static void subtracao(int x,int y){
           System.out.println(x-y);
        }

        public static void multiplicacao(int x, int y){
            System.out.println(x*y);
        }

        public static void divisao(double x,double y){
            System.out.printf("%.2f%n",x/y);
        }

}
