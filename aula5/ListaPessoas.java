package aula5;

import java.util.Scanner;

public class ListaPessoas {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        Metodos.inserir("Sandra",70);
        Metodos.inserir("Pedro",29);
        Metodos.inserir("Gerson",50);     
        Metodos.exibir();
        System.out.println("============");
        Metodos.remover(2);
        Metodos.exibir();
    }
}
  
    






/*
    public static void main(String[] args) {
              
        System.out.print("Tamanho: ");
        
        int n = teclado.nextInt();
        Pessoa[] lista = new Pessoa[n];
        ler(lista);
        exibir(lista);
        teclado.close();
    }
    */
              
    /**
     * Instancia a classe Pessoas e recebe dados via teclado
     * @param lista Pessoa[]
     */
    /*
    public static void ler(Pessoa[] lista) {
          
        System.out.println(" ======== ENTRADA DE DADOS ======== ");
        for(int i=0; i<lista.length; i++) {
        lista[i] = new Pessoa();
            
        teclado.nextLine();
        System.out.print("Nome: ");
        lista[i].nome = teclado.nextLine();
        System.out.print("ID: ");
        lista[i].id = teclado.nextInt();
        System.out.print("Idade: ");
        lista[i].idade = teclado.nextInt();
         
        }
    }
        
         /**
         * Exibeo conteudo de array de objetos
         * @param lista Pessoa[]
         */
       /* 
    public static void exibir(Pessoa [] lista) {
            
        System.out.println(" ======== SAIDA DE DADOS ======== ");
        for (Pessoa p:lista) {
            
        System.out.println(p);
            
        }
       */ 

 //for(int i=0; i<lista.length; i++) {
            //lista[i] = new Pessoa();
       // }
        /*System.out.println(" ======== ENTRADA DE DADOS ======== ");
        for (int i=0; i < lista.length; i++) {
        teclado.nextLine();
        System.out.print("Nome: ");
        lista[i].nome = teclado.nextLine();
        System.out.print("ID: ");
        lista[i].id = teclado.nextInt();
        System.out.print("Idade: ");
        lista[i].idade = teclado.nextInt();
    }*/
            
        /*
        lista[0] = new Pessoa();
        lista[1] = new Pessoa();
        lista[2] = new Pessoa();
        
        lista[0].nome = "Pedro";
        lista[0].id = 1;
        lista[0].idade = 29;
        
        System.out.println(lista[0].nome);
                
        //Tipo Abstrato de dadaos
        
        
        //Cadastramento de duas pessoas. Precisa criar outrar classe, exemplo
        //Pessoas para nao ter erro
                
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p.nome = "Pedro";
        p.id = 1;
        p.idade = 29;
        
        p2.nome = "Gabraiel";
        p2.id = 2;
        p2.idade = 25;
          
        // para fazer um vetor de 100 numeros
        //Pessoa[] lista = new Pessoa[100];
        
        //lista[0].nome = "Pedro";
        
        System.out.println(p.nome);
        System.out.println(p.id);
        System.out.println(p.idade);
        
        System.out.println(p2.nome);
        System.out.println(p2.id);
        System.out.println(p2.idade);
        */