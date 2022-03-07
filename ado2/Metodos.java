package ado2;

import java.util.Random;
import java.util.Scanner;

public class Metodos {
    private static Musica[] lista = new Musica[5];
    private static Scanner leitor = new Scanner(System.in);
    private static int indice = 0;
    

    public static int aleatorio(){
    //Passagem de parametro por referencia
    Random random=new Random();
    int id = random.nextInt(1000);
    return id;
    }
    public static boolean inserir(Musica musica){
        if(indice == lista.length){
            lista = arrayRedimensionado();
        }
        if(indice<lista.length){
            lista[indice] = musica;
            indice++;
            return true;
        }
        return false;
    }
    
    public static Musica[] arrayRedimensionado(){
        Musica[] newList = new Musica[indice + 5];
        for(int k=0;k<indice;k++){
        newList[k]=lista[k];
        }
        return newList;
    }
    
    private static void selectionSort(Musica[] v) {
        Musica temp;
        for (int j = 0; j < indice - 1; j++) { //Varreduras
            int menor=j;//Ã­ndice
            for(int i=j+1;i<indice;i++){//ComparaÃ§Ãµes
                if(v[menor].getNome().compareTo(v[i].getNome())>0){
                    menor=i;
                }
            }
            //Troca
            temp=v[menor];
            v[menor]=v[j];
            v[j]=temp;
        }
    }
    public static Musica pesquisaBinaria(String nome) {
        
        int inicio = 0, fim = indice-1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (nome.equalsIgnoreCase(lista[meio].getNome())) {
                return lista[meio];
            }
            else if (nome.compareToIgnoreCase(lista[meio].getNome()) > 0) {
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }
        return null;
    }
    
    public static void exibir(){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] != null){
            System.out.println(lista[i]);
            }
        }
    }
    
    public static void removerMusica(Musica musica){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == musica){
                for (int j = i; j < lista.length; j++) {
                    if(j != lista.length - 1){
                    lista[j] = lista[j + 1];
                    }
                    else{
            //lista[lista.length - 1] = null;
                    }
                }
                exibir();
                System.out.println("Musica encontrada");
            }
        }
    }
}
    
    
/*
* Outra logica do projeto:
*
*   
*    public static void menu(){
*        int cond;
*        System.out.println("--------Bem vindo!--------");
*        System.out.println("1 - Adicionar musica\n2 - Pesquisar musica\n3 - Apagar musica\n4 - Exibir musicas\n0 - Para fechar o menu");
*        cond = leitor.nextInt();
*        if(cond == 1){
*           for(int i = 0; cond == 1; i++){
*                leitor.nextLine();
*                System.out.println("Digite nome da musica: ");
*                String nome = leitor.nextLine();
*                System.out.println("Digite nome do artista: ");
*                String artista = leitor.nextLine();
*             System.out.println("Digite a duracao da musica: ");
*                double duracao = leitor.nextDouble();
*               int codigo = i + 1;
*                Musica musica1=new Musica(nome, artista, duracao, codigo);
*                inserir(musica1);
*                System.out.println("Quer adicionar outra musica?");                
*                int cond2 = leitor.nextInt();
*                if(cond2 == 1){
*                    System.out.println("Ok!");
*                }
*                else if(cond2 == 0){
*                    cond = 0;
*               }
*            }
*            menu();
*        }
*        if(cond == 2){
*            System.out.println("Digite o nome da musica que voce quer pesquisar: ");
*            String nome = leitor.nextLine();
*            pesquisaBinaria(nome);
*        }
*        if(cond == 3){
*            leitor.nextLine();
*            System.out.println("Digite o nome da musica que quer excluir: ");
*            String nome = leitor.nextLine();
*            Musica musica = Metodos.pesquisaBinaria(nome);
*            if(musica!=null){
*                System.out.println(musica);
*                System.out.println("Deseja excluir essa musica?");
*                int cond3 = leitor.nextInt();
*                if(cond3 == 1){
*                  Metodos.removerMusica(musica);
*                 System.out.println("Musica removida");
*                }
*                else{
*                  System.out.println("Obrigado!");
*                }
*           }
*            else{
*                System.out.println("Nao existe!");
*            }
*            menu();
*      }
*        if(cond == 4){
*            exibir();
*            menu();
*        }
*        if(cond == 0){
*            System.out.println("Obrigado, volte sempre!");
*       }
*        
*   }
*
*/  