package ado2;

public class Musica {
    String nome;
    String artista;
    double duracao;
    int codigo;

    public Musica(String nome, String artista, double duracao, int codigo) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
    return "Musica{" + "nome = " + nome + ", artista = " + artista
    + ", duracao = " + duracao + ", codigo = " + codigo + "}";
    }
}