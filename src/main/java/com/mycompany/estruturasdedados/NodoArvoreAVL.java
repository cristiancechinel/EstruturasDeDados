
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

    NodoArvoreAVL rotacaoDireitaEsquerda(NodoArvoreAVL atual){
        atual.nodoDireito = atual.rotacaoDireita(atual.nodoDireito);
        atual = atual.rotacaoEsquerda(atual);
        return atual;
    }
    
    
    NodoArvoreAVL rotacaoEsquerdaDireita(NodoArvoreAVL atual){
        atual.nodoEsquerdo = atual.rotacaoEsquerda(atual.nodoEsquerdo);
        atual = atual.rotacaoDireita(atual);
        return atual;
    }
    
    
    NodoArvoreAVL rotacaoEsquerda(NodoArvoreAVL atual){
        NodoArvoreAVL temp = atual.nodoDireito;
        atual.nodoDireito = temp.nodoEsquerdo;
        temp.nodoEsquerdo = atual;
        return temp;
    
    
    }
    
    
    NodoArvoreAVL insereBalanceado(NodoArvoreAVL atual, Integer v){
        if (atual == null)
            atual = new NodoArvoreAVL(v, null, null);
        
        else if (v < atual.valor){
            atual.nodoEsquerdo = insereBalanceado(atual.nodoEsquerdo, v);
            
            if (atual.altura(atual.nodoEsquerdo) - 
                atual.altura(atual.nodoDireito) == 2){
            //desbalanceamento
                if (v < atual.nodoEsquerdo.valor) // rotacaoSimples
                    atual = atual.rotacaoDireita(atual);
                else // rotação dupla
                    atual = atual.rotacaoEsquerdaDireita(atual);
            }
        }
        else {
            atual.nodoDireito = insereBalanceado(atual.nodoDireito, v);
            
            if (atual.altura(atual.nodoEsquerdo) -
                atual.altura(atual.nodoDireito) == -2){
             //desbalanceamento
             if (v > atual.nodoDireito.valor) //rotacaoSimples
                 atual = atual.rotacaoEsquerda(atual);
             else//rotação dupla
                 atual = atual.rotacaoDireitaEsquerda(atual);
            
            }
        }

        return atual;
    }
    
    
    NodoArvoreAVL retiraValorAVL(NodoArvoreAVL a, Integer valor){
    
        if (a == null) return null;
        else if (valor < a.valor){//retirar da esquerda
            
            a.nodoEsquerdo = retiraValorAVL(a.nodoEsquerdo, valor);
            
            if (altura(a.nodoEsquerdo)- altura(a.nodoDireito) == -2){
                if (altura(a.nodoDireito.nodoEsquerdo) 
                    - altura(a.nodoDireito.nodoDireito) == -1 )//rotacao simples
                    a = a.rotacaoEsquerda(a);
                else //rotacao dupla
                    a = a.rotacaoDireitaEsquerda(a);
            }
        }
        else if (valor > a.valor){//retirar da direita
            a.nodoDireito = retiraValorAVL(a.nodoDireito, valor);
            if (altura(a.nodoEsquerdo) - altura(a.nodoDireito) == 2) {
                if (altura(a.nodoEsquerdo.nodoEsquerdo)
                    - altura(a.nodoEsquerdo.nodoDireito) == 1)//rotacao simples
                    a = a.rotacaoDireita(a);
                else
                    a = a.rotacaoEsquerdaDireita(a);
            }
        }
        
        
        
        
        
        
        
        else {//elemento encontrado  - verificar quantos filhos
            //sem filhos
            if (a.nodoDireito == null && a.nodoEsquerdo == null) {
                return null;
            }
            if (a.nodoDireito == null) {// 1 filho na esquerda
                return a.nodoEsquerdo;
            }
            if (a.nodoEsquerdo == null){// 1 filho direita
                return a.nodoDireito;
            }
            // tem dois filhos 
            // busca pelo mais à direita do filho da esquerda
            NodoArvoreAVL temp = a.nodoEsquerdo;
            while (temp.nodoDireito != null)
                temp = temp.nodoDireito;
            //troca valor 
            a.valor = temp.valor;
            temp.valor = valor;
            //reinicia a retirada da subarvore em que valor foi trocado
            a.nodoEsquerdo = retiraValorAVL(a.nodoEsquerdo, valor);
        }
        return a;
    
    
    
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
