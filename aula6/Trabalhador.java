
package aula6;

class Trabalhador {
    
    int id;
    String nome;
    double salario;
    
    public Trabalhador(String nome, double salario, int id){
        this.id = id;
        this.nome =  nome;
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "ID: "  + id + "\nNome: " + nome + "\nSalario: " + salario;
    }
}
