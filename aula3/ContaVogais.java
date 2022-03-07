package aula3;

public class ContaVogais {
    
    public static void main(String[] args) {
        String nome = "Pedro Domingues";
        nome = nome.toLowerCase();        
        String vogais = "aeiou";
        contaVogal(nome,vogais);
    }      
    
    public static void contaVogal(String nome, String vogais) {
        
        int cont = 0;
        
        for(int i=0; i<nome.length(); i++) {
            for(int j=0; j<vogais.length(); j++) {
                if(nome.charAt(i) == vogais.charAt(j)) {
                    cont++;
                    break;
                }
            }
        }
        
        System.out.println("Quantidade de vogais: " + cont);
    }
}