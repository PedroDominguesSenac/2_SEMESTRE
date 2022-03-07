package ado1;
  
public class MetodoEx3 {
    static ProdutoEx3[] lista = new ProdutoEx3[10];
    static int i = 0;
    static float preco = 0;
    static int l = 0;
    static float preco2 = 0;
    static float[] array2 = new float[10];
    
    public static void InserirProdutoEx3(String nome, String categoria, int codigo, float preco) {
        
        lista[i] = new ProdutoEx3();
        lista[i].nome = nome;
        lista[i].Categoria = categoria;
        lista[i].codigo = codigo;
        lista[i].preco = preco;
        i++;
    }
    public static void ProdutoEx3() {
        
        InserirProdutoEx3("Lanterna", "Ferramenta", i, 3.0F);
        InserirProdutoEx3("Martelo", "Ferramenta", i, 6.0F);
        InserirProdutoEx3("Furadeira", "Ferramenta", i, 10.0F);
        InserirProdutoEx3("Chave Inglesa", "Ferramenta", i, 8.0F);
        InserirProdutoEx3("Alicate", "Ferramenta", i, 9.0F);
        InserirProdutoEx3("Camiseta", "Roupa", i, 10.0F);
        InserirProdutoEx3("Calça", "Roupa", i, 2.0F);
        InserirProdutoEx3("Moletom", "Roupa", i, 7.0F);
        InserirProdutoEx3("Meia", "Roupa", i, 8.0F);
        InserirProdutoEx3("Sueter", "Roupa", i, 9.0F);
        
    }
    public static void Compra(String nome) {
        int a = 0;
        String[] array = new String[10];
        
        for(int j = 0; j < 10; j++){
            if(nome.equals(lista[j].nome)){
                a = lista[j].codigo;
               break;
            }
        }
        array2[l] = Soma(a);
        l++;
        if(l == 10){
            for(int h = 0; h < 10; h++){
            preco2 += array2[h];
            }
            System.out.println("Valor total da sua compra: " + preco2);
       };
        
    }
    public static float Soma(int num) {
        
        preco  = lista[num].preco;
        int codigo = lista[num].codigo;
        Exibicao(codigo);
        
        return preco;
        
    }
    public static void Exibicao(int codigo) {
        
        System.out.println(lista[codigo]);
        
    }
    
    
}
