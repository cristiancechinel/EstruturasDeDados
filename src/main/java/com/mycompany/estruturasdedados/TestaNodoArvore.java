
package com.mycompany.estruturasdedados;


public class TestaNodoArvore {
    
    public static void main(String[] args){
    
        NodoArvore arv = new NodoArvore(50, null, null);

        arv.insere(arv, 40);
        
        arv.insere(arv, 60);
        
        arv.imprimeSim(arv);
        
        
        

    }
}
