package empresa.dados;

public class Produto {
   private String nome;
   private double preco;
   private int qntd;

   public Produto (String nome, double preco, int qntd) {
       this.nome = nome;
       this.preco = preco;
       this.qntd = qntd;
   }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + qntd);
    }
}
