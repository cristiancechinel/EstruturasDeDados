
package com.mycompany.estruturasdedados;

public class TestaArvoreBinaria {
    
    public static void main(String[] args){
    
        ArvoreBinaria a = new ArvoreBinaria();
        
        a.insere(50);
        a.insere(45);
        a.insere(60);
        a.insere(65);
        a.insere(43);
        a.insere(47);
        a.insere(68);
        a.imprimeSim();
        System.out.println("altura = " + a.altura());

    }
       
}
