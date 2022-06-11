
package arvorebinaria;




public class Main {

   
    public static void main(String[] args){
        
       
        ABB arvore = new ABB();
        try{
        arvore.inserirElemento(15);
        arvore.inserirElemento(13);
        arvore.inserirElemento(16);
        arvore.inserirElemento(12);
        arvore.inserirElemento(14);
        arvore.inserirElemento(17);
        arvore.inserirElemento(18);
        //arvore.inserirElemento(13); //exceção nó repetido
        
         /*              [15]
                   [13]      [16]
                 [12][14]  [17] [18]
                
        */
                
        Node busca = arvore.buscaElemento(14); //testando método busca elemento
        System.out.println("elemento " +busca.getElemento()+ " encontrado");
        System.out.println("pai: " +busca.getPai().getElemento());
        
        
        Node pai = busca.getPai(); //testando metodo busca pai
        System.out.println("filho esquerdo: " +pai.getEsquerda().getElemento());
        System.out.println("filho direito: " +pai.getDireita().getElemento());
        
        System.out.println("tamanho: " +arvore.getSize());
        arvore.printRaiz();
        
        arvore.remover(13); //testando remoção de nó com 2 filhos
        Node raiz = arvore.getRaiz();
        System.out.println("raiz:" +raiz.getElemento()+
                    "\nesquerda: " +raiz.getEsquerda().getElemento()+
                    "\ndireita: " +raiz.getDireita().getElemento());
        Node no12 = raiz.getEsquerda();
        System.out.println("filho do 12: " +no12.getDireita().getElemento());
        
        /*
                            [15]
                       [12]      [16]
                     [ ] [14]  [17]  [18]
        
        */
        
        
        arvore.remover(15); //testando remover raiz
        System.out.println("nova raiz: " +raiz.getElemento());
        //System.out.println("filho do 12: " +no12.getDireita().getElemento());
        
        /*
                            [14]
                       [12]      [16]
                     [ ] [ ]  [17]  [18]
        
        */
         
         
        
        
        }
        catch (Exception e){
            System.out.println(e);
            
        }
        
        
        
    }      
        
}
    
