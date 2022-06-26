
package arvores;


public class ArvoreAVL extends ABB{
    
    public int altura(Node no) {  //altura um nó
        if (no == null) {         //Se o nó for nulo, sua altura será -1
            return -1;
        }
        if (!temEsquerda(no) && !temDireita(no)) { //não tem filhos: altura 0
            return 1;
        } else if (!temEsquerda(no)) {      //Se o nó tiver apenas um filho, sua altura será 1 + a altura do nó filho
            return 1 + altura(no.getDireita());
        } else if (!temDireita(no)) {
            return 1 + altura(no.getEsquerda());
        } else {                           //Se ele tiver dois filhos, temos q verificar qual filho é mais "alto"
            if (altura(no.getEsquerda()) > altura(no.getDireita())) {
                return 1 + altura(no.getEsquerda());
            } else {
                return 1 + altura(no.getDireita());
            }
        }
    }
    
    public int getBalanceamento(Node no){
        return altura(no.getDireita()) - altura(no.getEsquerda());
    }
    
    @Override
    public Node inserirElemento(int elemento) throws Exception{
        return super.inserirElemento(elemento);
    }
    
    @Override
    public void remover(int elemento) throws Exception{
        super.remover(elemento);
    }
    
    public void prefixado(Node no) {
        if(no != null){
            System.out.print(no.getElemento() + " ");
            prefixado(no.getEsquerda());
            prefixado(no.getDireita());
        }
    }
   
    
    
    
}
