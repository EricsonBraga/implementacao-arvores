
package arvores;


public class Node {
    
    private int elemento;
    private Node pai;
    private Node esquerda;
    private Node direita;
    
    public Node(){
        this.elemento = 0;
        this.pai = null;
        this.esquerda = null;
        this.direita= null;
    }
    public Node(int elemento, Node pai, Node esquerda, Node direita){
        this.elemento = elemento;
        this.pai = pai;
        this.direita = direita;
        this.esquerda = esquerda;
    }
    
   
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Node getPai() {
        return pai;
    }

    public void setPai(Node pai) {
        this.pai = pai;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }
    
    public boolean ehExterno(){
        return esquerda == null &&direita == null;
    }
     
    public boolean naoEhInterno(){
        return !ehExterno();
    }
    
    public int substituirElemento(int elemento){
        int antigo = this.getElemento();
        this.setElemento(elemento);
        return antigo;
    }
    
    @Override
    public String toString(){
        return "["+this.elemento+"]";
    }
}
