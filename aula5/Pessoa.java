package aula5;

class Pessoa {
    //Atributos - Caracteristicas
    int id;
    String nome;
    int idade;
    
    
    
    @Override
    public String toString() {
        return "Nome: "  + nome + "\nID: " + id + "\nIdade: " + idade;
    }
}