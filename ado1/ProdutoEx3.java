package ado1;

class ProdutoEx3 {
    String nome;
    String Categoria;
    int codigo;
    float preco;
    
    
    @Override
    public String toString() {
        return "Nome: "  + nome + "\nCategoria: " + Categoria + "\nCodigo: " + codigo + "\nPreço:" + preco;
    }
}
