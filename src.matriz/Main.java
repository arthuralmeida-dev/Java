import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Você quer a tabuada de qual numero? ");
        int n = sc.nextInt();

      for (int item = 1; item <= 10 ;item++){
          int resultado = n * item;
          System.out.printf("%d x %d = %d%n",n ,item,resultado);
      }






         sc.close();
    }
}
