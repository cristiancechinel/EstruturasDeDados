
package com.mycompany.estruturasdedados;


public class ArvoreBinaria {
    private NodoArvore raiz;
    
    ArvoreBinaria(){
        raiz = null;
    }

    int altura(){
        if (raiz == null) return -1;
        else return raiz.altura(raiz);
    
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
    
    void retira(Integer v){
        if (this.raiz != null)
           raiz = raiz.retiraValor(raiz, v);
    }
    
}
