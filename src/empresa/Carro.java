package empresa;

public class Carro {
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    public Carro(){
    marcaDoCarro = "Desconhecida";
    modeloDoCarro = "Desconhecido";
    anoDoCarro = 0
    }

    public Carro (String marcaDoCarro, String modeloDoCarro){
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
    }
    public Carro (String marcaDoCarro, String modeloDoCarro, int anoDoCarro){
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    public void exibirDetalhes (){
        System.out.println("Marca do carro: " + marcaDoCarro);
        System.out.println("Modelo do carro: " + modeloDoCarro);
        System.out.println("Ano do carro: " + anoDoCarro);
        System.out.println();
    }


}
