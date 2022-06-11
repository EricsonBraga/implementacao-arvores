
package arvorebinaria;


public class NoAVL extends Node {
    private int alturaE, alturaD,posPai;

    public int getAlturaE() {
        return alturaE;
    }

    public void setAlturaE(int alturaE) {
        this.alturaE = alturaE;
    }

    public int getAlturaD() {
        return alturaD;
    }

    public void setAlturaD(int alturaD) {
        this.alturaD = alturaD;
    }

    public int getPosPai() {
        return posPai;
    }

    public void setPosPai(int posPai) {
        this.posPai = posPai;
    }
    
    
    public NoAVL(int elemento, Node pai, Node esquerda, Node direita){
        super(elemento, pai, esquerda, direita);
        alturaE = 0;
        alturaD = 0;
        if(pai ==null)
            posPai=0;
        else if (pai.getElemento()>elemento)
            posPai=-1;
        else posPai=1;
    }
    
    public int getAltura(){
        return Integer.max(this.getAlturaE(), this.getAlturaD());
    }
    
    
    @Override
    public void setEsquerda(Node esquerda){
        if(esquerda == null){
            alturaE = 0;
        }else{
            NoAVL no = (NoAVL) esquerda;
            alturaE = no.getAltura()+1;
            no.setPosPai(-1); //filho a esqueda é -1, filho a direita é 1.
            
        }
        
    }
    
     @Override
    public void setDireita(Node direita){
        if(direita == null){
            alturaD = 0;
        }else{
            NoAVL no = (NoAVL) direita;
            alturaD = no.getAltura()+1;
            no.setPosPai(1); //filho a esqueda é -1, filho a direita é 1.
            
        }
        
    }
    
    public int getFB(){ //fator de balanceamento
        return this.alturaD-this.getAlturaE();
    }
    
    
    
}
