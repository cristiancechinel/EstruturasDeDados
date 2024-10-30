
package com.mycompany.estruturasdedados;


public class ArvoreBinaria {
    private NodoArvore raiz;
    
    ArvoreBinaria(){
        raiz = null;
    }

    void insere(Integer v){
        if (this.raiz == null) 
            raiz = new NodoArvore(v, null, null);
        else
            raiz = raiz.insere(raiz, v);
    }
    
    void imprimeSim(){
        if (raiz != null){
            raiz.imprimeSim(raiz);
        }
        System.out.println();
    
    }
}
