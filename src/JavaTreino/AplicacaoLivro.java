package JavaTreino;

public class AplicacaoLivro {
    public static void main(String[] args){

        Livro l1 = new Livro();

        System.out.println("Titulo: " + l1.titulo);
        System.out.println("Autor: " + l1.autor);
        System.out.println("Ano da publicacao: " + l1.anoPublicacao);
        System.out.println("preço: " + l1.preco);
        System.out.println();

        Livro l2 = new Livro("Pequeno Principe", "Arthur");

        System.out.println("Titulo: " + l2.titulo);
        System.out.println("Autor: " + l2.autor);
        System.out.println("Ano da publicacao: " + l2.anoPublicacao);
        System.out.println("preço: " + l2.preco);
        System.out.println();

        Livro l3 = new Livro("Rei","Mendonça",1990,20.04);

        System.out.println("Titulo: " + l3.titulo);
        System.out.println("Autor :" + l3.autor);
        System.out.println("Ano da publicacao: " + l3.anoPublicacao);
        System.out.println("preço: " + l3.preco);


    }
}
