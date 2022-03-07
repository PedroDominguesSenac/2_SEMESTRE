package aula_10.metodobusca;

public class Produto {
    
    private String nome, categoria;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() { // metodos assessores
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(UsaProduto.buscar(id)) { 
            System.out.println("ID ja existe");
        }else{
          this.id = id;  
        } 
    }

    @Override
    public String toString() {
        return "Produto{" + "nome = " + nome + ", categoria=" + categoria + ", id=" + id + '}';
    }        
}