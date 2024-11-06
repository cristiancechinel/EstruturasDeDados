
package com.mycompany.estruturasdedados;

public class TestaArvoreAVL {
    
    public static void main(String[] args){
    
        NodoArvoreAVL a = new NodoArvoreAVL(50, null, null);
        
        a = a.insere(a, 45);
        a = a.insere(a, 60);
        a.imprimeSim(a);
        System.out.println();
        a = a.rotacaoDireita(a);
        a.imprimeSim(a);
        System.out.println();

        a = a.rotacaoEsquerda(a);
        a.imprimeSim(a);
//System.out.println("altura = " + a.altura());

    }
       
}
