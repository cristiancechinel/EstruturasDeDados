
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
    
    NodoArvore insere(NodoArvore atual, Integer v){
        if (atual == null)
            atual = new NodoArvore(v, null, null);
        else if (v < atual.valor)
            atual.nodoEsquerdo = insere(atual.nodoEsquerdo, v);
        else atual.nodoDireito = insere(atual.nodoDireito, v);
        
        return atual;
    }
    
    void imprimeSim(NodoArvore atual){
        if (atual != null) {
            System.out.print("<");
            imprimeSim(atual.nodoEsquerdo);
            System.out.print(atual.valor);
            imprimeSim(atual.nodoDireito);
            System.out.print(">");
       
        
        }
            
    
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
