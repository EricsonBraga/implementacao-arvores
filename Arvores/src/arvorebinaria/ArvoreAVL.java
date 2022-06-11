
package arvorebinaria;


public class ArvoreAVL extends ABB{
    
    @Override
    public Node adicionarNo(int elemento, Node pai){
        NoAVL noAVL = new NoAVL(elemento, pai, null, null);
        return noAVL;
    }
    
    
    @Override
    public Node inserirElemento(int elemento) throws Exception{
        //incluir o calculo de balanceamento da arvore
        return super.inserirElemento(elemento);
    }
    
    @Override
    public void remover(int elemento) throws Exception{
        //incluir calculo de balanceamento
        //return super.remover(elemento);
    }
    
    
    //entregar ABB
    //prova até rotação simples da AVL
    
    
    
}
