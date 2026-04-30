package JavaTreino;
import java.util.Scanner;
public class Modularizacao3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char resp;
        int n;
        System.out.println("Quer ver uma tabuada?");
        resp = sc.next().charAt(0);
        while(resp=='s'){
            do {
                System.out.println("Qual a tabuada?");
                n = sc.nextInt();
            }while ((n<=1)||(n>10));
            tabuada(n);
            System.out.println("Quer ver uma tabuada?");
            resp = sc.next().charAt(0);

        }
    }

    public static void tabuada(int n){
        System.out.println("Tabuada do "+n);
        for(int i = 0 ; i <= 10;i++){
            System.out.println(n + "x" +i+ "=" +(n*i));

        }

    }
}
