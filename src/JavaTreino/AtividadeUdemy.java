package JavaTreino;
import empresa.dados.Produto;
public class AtividadeUdemy {
    public static void main (String[]args) {

        Produto tabela = new Produto();
        tabela.setNome("Arthur");
        tabela.setPreco(200);
        tabela.setQntd(10);

        System.out.println("Nome: "+ tabela.getNome());
        System.out.println("Preço: " + tabela.getPreco());
        System.out.println("Quantidade: " + tabela.getQntd());





    }
}
