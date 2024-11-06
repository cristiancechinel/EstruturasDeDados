
package com.mycompany.estruturasdedados;

public class NodoArvoreAVL {
    private NodoArvoreAVL nodoEsquerdo;
    private Integer valor; 
    private NodoArvoreAVL nodoDireito;
   
    
    
    
    NodoArvoreAVL(Integer valor, NodoArvoreAVL esq, NodoArvoreAVL dir){
        this.valor = valor;
        nodoEsquerdo = esq;
        nodoDireito = dir;
    }
    
   
    NodoArvoreAVL rotacaoDireita(NodoArvoreAVL atual){
        NodoArvoreAVL temp = atual.nodoEsquerdo;
        atual.nodoEsquerdo = temp.nodoDireito;
        temp.nodoDireito = atual;
        return temp; 
    }
    
    
    NodoArvoreAVL rotacaoEsquerda(NodoArvoreAVL atual){
        NodoArvoreAVL temp = atual.nodoDireito;
        atual.nodoDireito = temp.nodoEsquerdo;
        temp.nodoEsquerdo = atual;
        return temp;
    
    
    }
    
    
    NodoArvoreAVL insere(NodoArvoreAVL atual, Integer v){
        if (atual == null)
            atual = new NodoArvoreAVL(v, null, null);
        else if (v < atual.valor)
            atual.nodoEsquerdo = insere(atual.nodoEsquerdo, v);
        else atual.nodoDireito = insere(atual.nodoDireito, v);
        
        return atual;
    }
    
    
    NodoArvoreAVL retiraValor(NodoArvoreAVL nodo, Integer valor){
    
        if (nodo == null) return null;
        else if (valor < nodo.valor)//retirar da esquerda
            nodo.nodoEsquerdo = retiraValor(nodo.nodoEsquerdo, valor);
        else if (valor > nodo.valor)//retirar da direita
            nodo.nodoDireito = retiraValor(nodo.nodoDireito, valor);
        else {//elemento encontrado  - verificar quantos filhos
            //sem filhos
            if (nodo.nodoDireito == null && nodo.nodoEsquerdo == null) {
                return null;
            }
            if (nodo.nodoDireito == null) {// 1 filho na esquerda
                return nodo.nodoEsquerdo;
            }
            if (nodo.nodoEsquerdo == null){// 1 filho direita
                return nodo.nodoDireito;
            }
            // tem dois filhos 
            // busca pelo mais à direita do filho da esquerda
            NodoArvoreAVL temp = nodo.nodoEsquerdo;
            while (temp.nodoDireito != null)
                temp = temp.nodoDireito;
            //troca valor 
            nodo.valor = temp.valor;
            temp.valor = valor;
            //reinicia a retirada da subarvore em que valor foi trocado
            nodo.nodoEsquerdo = retiraValor(nodo.nodoEsquerdo, valor);
        }
        return nodo;
    
    
    
    }
    
    int max(int a, int b){
        if (a > b) return a;
        else return b;
    }
    
    
    int altura(NodoArvoreAVL atual){
    
        if (atual == null) return - 1;
        else 
            return 1 + 
                    max(altura(atual.nodoEsquerdo), altura(atual.nodoDireito));
    
    
    }
    
    void imprimeSim(NodoArvoreAVL atual){
        if (atual != null) {
            System.out.print("<");
            imprimeSim(atual.nodoEsquerdo);
            System.out.print(atual.valor);
            imprimeSim(atual.nodoDireito);
            System.out.print(">");
       
        
        }
            
    
    }
    
    
    
    
    boolean busca(NodoArvoreAVL nodo, Integer valor){
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
