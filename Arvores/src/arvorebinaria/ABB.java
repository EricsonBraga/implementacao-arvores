
package arvorebinaria;


public class ABB  extends ArvoreB{
    
    public boolean temEsquerda(Node no){
        return no.getEsquerda() != null;
    }
    
    public boolean temDireita(Node no){
        return no.getDireita() != null;
    }
    
    public Node buscaPai(int elemento){
        if(ehVazia())
            return null;
        Node no = getRaiz();
               
        while(true){
            if(no.getElemento()==elemento)
                return no.getPai();
            
            if(elemento>no.getElemento()){
                if(temDireita(no)){
                    no = no.getDireita();
                }else{
                    return no;
                }
            }else 
                if(temEsquerda(no))
                    no = no.getEsquerda();
                else 
                    return no;
        }
    }
    
    public Node buscaElemento(int elemento) throws Exception{
        Node pai = buscaPai(elemento);
        if(pai ==null){
            //return null;
            return getRaiz();
        }
        if(pai.getElemento()>elemento){
            if(!temEsquerda(pai)){
                throw new Exception ("ERRO AO BUSCAR: Elemento não está na árvore");
            }
            return pai.getEsquerda();
            
        }else
            if(!temDireita(pai)){
                throw new Exception ("ERRO AO BUSCAR: Elemento não está na árvore");
            }
        return pai.getDireita();
                       
    }
    
    
    public Node inserirElemento(int elemento) throws Exception{
        if(ehVazia())
            return inserirRaiz(elemento);
        
        Node pai = buscaPai(elemento);
        if(pai == null)
            throw new Exception ("Este elemento já existe!");
          
        if(pai.getElemento()>elemento){
            return inserirEsquerda(pai, elemento);
        }else{
            return inserirDireita(pai, elemento);
        }
        
      
    
    }
    
    //extrema esquerda do filho a direita
    public Node menor(Node no){
        if(!temEsquerda(no)){
            return no;
        }
        no = no.getEsquerda();        
        return menor(no);
    }
      
    
    //extrema direita do filho a esquerda
    public Node maior(Node no){
        if(!temDireita(no)){
            return no;
        }
        no = no.getDireita();
        return maior(no);
    }
    
    
    public void remover(int elemento) throws Exception{
       
        Node no = buscaElemento(elemento);
        Node pai = no.getPai();
        Node filho = no.getEsquerda();
        filho = maior(filho);
       
        //nó não é raiz
        if(pai != null){ 
            if(!temEsquerda(no) || !temDireita(no) ){    //nó tem 0 ou 1 filho
                if(pai.getElemento()>elemento) { //Elemento está à esquerda do pai
                    removerEsquerda(pai);
                }
                if(pai.getElemento()< elemento){ //Elemento está à direita do pai
                    removerDireita(pai);
                }
            }
                       
            //nó tem dois filhos  //substituiremos pelo maior(extrema direita do filho à esquerda)
            if(temDireita(no) && temEsquerda(no)){
                if(no.getEsquerda().getElemento() == filho.getElemento()){  //filho esquerdo do nó é o maior elemento
                    int aux = filho.getElemento();
                    no.substituirElemento(aux);                             
                    pai = filho.getPai();
                    removerEsquerda(pai);                                   
                }else{                                                      //filho esquerdo não é o maior elemento e tem filhos à direita
                    int aux = filho.getElemento();
                    no.substituirElemento(aux);
                    pai = filho.getPai();
                    removerDireita(pai);
                }
            }
        }
        
        //nó é raiz
        if(pai == null){
            if(!temEsquerda(no) && !temDireita(no)){
                setRaiz(null);
            }
            if(temEsquerda(no) && !temDireita(no)){
                Node esquerda = no.getEsquerda();
                esquerda.setPai(null);
                setRaiz(esquerda);
            }
            if(!temEsquerda(no) && temDireita(no)){
                Node direita = no.getDireita();
                direita.setPai(null);
                setRaiz(direita);
            }
            if(temEsquerda(no) && temDireita(no)){
                if(no.getEsquerda().getElemento() == filho.getElemento()){  //filho esquerdo do nó é o maior elemento
                    int aux = filho.getElemento();
                    no.substituirElemento(aux);                             
                    pai = filho.getPai();
                    removerEsquerda(pai);                                   
                }else{                                                      //filho esquerdo não é o maior elemento e tem filhos à direita
                    int aux = filho.getElemento();
                    no.substituirElemento(aux);
                    pai = filho.getPai();
                    removerDireita(pai);
                }
            }
            
        }
    }
    
}
