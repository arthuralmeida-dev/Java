package JavaTreino;
import empresa.Carro;
public class Aplicacao {
    public static void main(String[]args){
        
        Carro c1 = new Carro();
        c1.exibirDetalhes();

        Carro c2 = new Carro("Toyota", "Sedan", 2016);
        c2.exibirDetalhes();

        Carro c3 = new Carro("Ram", "SUV");
        c3.exibirDetalhes();
    }
}
