
package com.mycompany.estruturasdedados;

public class NodoArvore {
    private NodoArvore nodoEsquerdo;
    private Integer valor; 
    private NodoArvore nodoDireito;
    
    
    NodoArvore(Integer valor, NodoArvore esq, NodoArvore dir){
        this.valor = valor;
        nodoEsquerdo = esq;
        nodoDireito = dir;
    }
    
    boolean busca(NodoArvore nodo, Integer valor){
        if (nodo == null) return false;
        else 
            if (nodo.valor == valor) return true;
            else {
                return 
                 busca(nodo.nodoEsquerdo, valor) ||
                 busca(nodo.nodoDireito, valor);
            }
    }
    
}
