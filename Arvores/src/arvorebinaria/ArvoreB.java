
package arvorebinaria;


public class ArvoreB {
    
    private Node raiz;
    private int size;
    
    public boolean ehVazia(){
        return size==0;
    }
    
    public Node adicionarNo(int elemento, Node pai){
        Node no = new Node(elemento, pai, null, null);
        return no;  
    }
    
    public Node inserirRaiz(int elemento) throws Exception{
        if(raiz == null){
            raiz = new Node();
            raiz.setElemento(elemento);
            raiz.setPai(null);
            
            size++;
        }else{
            throw new Exception ("Já possui raiz");
        }
            
     
        return raiz;
    }
    
    public Node inserirEsquerda(Node no, int valor) throws Exception{
        
        Node esquerda = new Node();
        if(no.getEsquerda() == null){
            
            esquerda.setPai(no);
            no.setEsquerda(esquerda);
            esquerda.setElemento(valor);
            //System.out.println("filho à esquerda: " +esquerda.getElemento());
            size++;
        }else{
            throw new Exception ("Já possui filho à esquerda");
        }
        return esquerda;
    }
    
    public Node inserirDireita(Node no, int valor) throws Exception{
        
        Node direita = new Node();
        if(no.getDireita()== null){
            
            direita.setPai(no);
            no.setDireita(direita);
            direita.setElemento(valor);
           // System.out.println("filho à direita: " +direita.getElemento());
            size++;
        }else{
            throw new Exception ("Já possui filho à direita");
        }
        return direita;
    }
    
    
    public void removerDireita(Node no) throws Exception{
        Node filho = no.getDireita();
        Node neto = new Node();
        if(filho.getDireita()!=null && filho.getEsquerda()==null){
            neto = filho.getDireita();
            neto.setPai(no);
            no.setDireita(neto);
            size--;
        }
        if(filho.getEsquerda()!=null && filho.getDireita()==null){
            neto = filho.getEsquerda();
            neto.setPai(no);
            no.setDireita(neto);
            size--;
        }
        if(filho.getDireita()==null && filho.getEsquerda()==null){
            no.setDireita(null);
            size--;
        }
        if(filho.getDireita()!=null && filho.getEsquerda()!=null){
            throw new Exception("Não é possível excluir nó com dois filhos");
        }
    
    
    }
    
     public void removerEsquerda(Node no) throws Exception{
        Node filho = no.getEsquerda();
        Node neto = new Node();
        if(filho.getDireita()!=null && filho.getEsquerda()==null){
            neto = filho.getDireita();
            neto.setPai(no);
            no.setEsquerda(neto);
            size--;
        }
        if(filho.getEsquerda()!=null && filho.getDireita()==null){
            neto = filho.getEsquerda();
            neto.setPai(no);
            no.setEsquerda(neto);
            size--;
        }
        if(filho.getDireita()==null && filho.getEsquerda()==null){
            no.setEsquerda(null);
            size--;
        }
        if(filho.getDireita()!=null && filho.getEsquerda()!=null){
            throw new Exception("Não é possível excluir nó com dois filhos");
        }
    
    
    }
    
      
    public void printRaiz(){
        System.out.println("raiz: " +raiz.getElemento());
    }
    

    public Node getRaiz() {
        return raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
   
    
    
}
