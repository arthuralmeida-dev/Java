package JavaTreino;
import java.util.Scanner;
public class Modularizacao1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
       // int resultado = meme(x,y);
        System.out.println(meme(x,y));
        //System.out.println ("O mmc de " + x + " e " + y + " = " + resultado);



    }

    public static int meme(int x, int y){
        int mmc = x;
        while (mmc%y!=0) {
            mmc += x;
        }
        return mmc;

    }
}
