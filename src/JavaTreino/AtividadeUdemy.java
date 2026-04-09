package JavaTreino;
import empresa.dados.Produto;
public class AtividadeUdemy {
    public static void main (String[]args) {

        Produto produto1 = new Produto("Notebook", 2500.00,16);
        Produto produto2 = new Produto("Smartphone", 1500.00,20);

        produto1.exibirInformacoes();
        System.out.println();
        produto2.exibirInformacoes();




    }
}
