
package com.mycompany.estruturasdedados;

public class TestaArvoreAVL {
    
    public static void main(String[] args){
    
        ArvoreAVL a = new ArvoreAVL();
        
        a.insere(10);
        a.insere(5);
        a.insere(8);
        
        a.imprimeSim();
        
//System.out.println("altura = " + a.altura());

    }
       
}
