
package arvores;

/*
Entrega de árvore com as seguintes funções na classe principal:

Inserir elemento

Apresentar o fator de Balanceamento de um elemento (Para a próxima entrega)

Remover elemento

Imprimir a árvore
*/


public class Main {

   
    public static void main(String[] args){
       try{ 
       
            ArvoreAVL arvore = new ArvoreAVL();

            arvore.inserirElemento(25);  //insere elementos
            arvore.inserirElemento(15);
            arvore.inserirElemento(30);
            arvore.inserirElemento(20);
            arvore.inserirElemento(27);
            arvore.inserirElemento(12);

            Node raiz = arvore.getRaiz();

            System.out.println("raiz: " +raiz.getElemento());
            System.out.println("altura: " +arvore.altura(raiz));
            System.out.println("fator de balanceamento: " +arvore.getBalanceamento(raiz)); //apresenta fator de balanceamento
            System.out.println("tamanho: " +arvore.getSize());

            /*
                         [25]
                    [15]      [30]
                 [12] [20]  [27]

            */

            arvore.inserirElemento(11);
            arvore.inserirElemento(10);

            System.out.println("\nnova altura: " +arvore.altura(raiz));
            System.out.println("novo fator de balanceamento: " +arvore.getBalanceamento(raiz));
            System.out.println("novo tamanho: " +arvore.getSize());

            /*
                         [25]
                    [15]      [30]
                 [12] [20]  [27]
               [11]
             [10]


            */


            arvore.remover(15);  //remove elemento

            System.out.println("\núltima altura: " +arvore.altura(raiz));
            System.out.println("último fator de balanceamento: " +arvore.getBalanceamento(raiz));
            System.out.println("último tamanho: " +arvore.getSize());

            /*
                         [25]
                    [12]      [30]
                 [11] [20]  [27]
               [10]

            */


            System.out.println("\nImpressão em ordem prefixada: \n"); //imprime árvore
            arvore.prefixado(raiz);



       }catch (Exception ex){
           System.out.println(ex);
       }
       
        
    }      
        
}
    
