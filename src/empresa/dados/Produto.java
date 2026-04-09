package empresa.dados;

public class Produto {
   private String nome;
   private double preco;
   private int qntd;

   public Produto () {

   }

    public void setNome(String nome){
       this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQntd(int qntd){
       this.qntd = qntd;
    }


    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQntd(){
        return qntd;
    }


}
