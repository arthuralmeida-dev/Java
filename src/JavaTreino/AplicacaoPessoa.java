package JavaTreino;
public class AplicacaoPessoa {
    public static void main(String[] args) {

    Pessoa p1 = new Pessoa("Arthur", 18,"Xique Xique", "75 9 92349");

        System.out.println("Nome : " + p1.nome);

        System.out.println("Idade = " + p1.getIdade());
        p1.setIdade(19);
        System.out.println("Nova idade = " + p1.getIdade());

        System.out.println("Endereço : " + p1.getEndereco());
        p1.setEndereco("Suiça");
        System.out.println("Novo endereço: " + p1.getEndereco());

        System.out.println("Telefone: " + p1.getTelefone());
        p1.setTelefone("71 9 828282");
        System.out.println("Novo telefone: " + p1.getTelefone());


    }
}
