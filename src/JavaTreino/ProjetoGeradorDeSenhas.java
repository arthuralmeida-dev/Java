package JavaTreino;
import java.security.SecureRandom;
import java.util.Scanner;
public class ProjetoGeradorDeSenhas {

    private static final String CARACTERES =  "abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ0123456789!@#$%¨&*()_-+=";

    public static String gerarSenha(int comprimento){
        SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento);

        for (int i = 0; i < comprimento; i++){
            int indice = geradorDeNumeroAleatorio.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(indice));
        }
        return senha.toString();
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int compriementoSenha;
        do {
            System.out.print("Quantas caracteres a senha vai ter? ");
            compriementoSenha = sc.nextInt();

            if (compriementoSenha != 0) {
                String senha = gerarSenha(compriementoSenha);
                System.out.println("A senha gerada é: " + senha);
            }

        } while(compriementoSenha != 0);
        System.out.println("Fim do sistema");
    }
}
