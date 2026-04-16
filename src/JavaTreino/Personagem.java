package JavaTreino;

public class Personagem {
   public String nome;
   public int nivelDePoder;

    public Personagem(String nome, int nivelDePoder){
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }
    public void tentarAumentarNivelDePoder(int nivelDePoder){
        nivelDePoder+=10;
    }
    public void mudarNome(Personagem personagem){
        personagem.nome = "Guerreiro";
    }
    public void aumentarNivelDePoder(){
        this.nivelDePoder +=10;
    }
}
