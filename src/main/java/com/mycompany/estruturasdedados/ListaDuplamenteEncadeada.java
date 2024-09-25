
package com.mycompany.estruturasdedados;

public class ListaDuplamenteEncadeada {
    
    Nodo inicio, ultimo;
    
    private class Nodo {
        Nodo proximo, anterior;
        Integer dado;
    }
    
    ListaDuplamenteEncadeada(){
        inicio = null;
        ultimo = null;
    }
    
    void insereInicio(Integer n){
        Nodo novo = new Nodo();
        novo.dado = n;
        novo.anterior = null;
        
        //verifica se a lista está vazia
        //se estiver vazia 
        if (inicio == null){
            novo.proximo = null;
            inicio = novo;
            ultimo = novo;
        
        }//lista já possui elementos
        else {
            inicio.anterior = novo;
            novo.proximo = inicio;
            inicio = novo;  
        }
    }
    
    void insereFinal(Integer n){
        Nodo novo = new Nodo();
        novo.dado = n;
        novo.proximo = null;
        //a lista está vazia 
        if (inicio == null){
            novo.anterior = null;
            inicio = novo;
            ultimo = novo;
        }
        else {
            novo.anterior = ultimo;
            ultimo.proximo = novo;
            ultimo = novo;
        
        
        }
    }
    
    
    void imprimeLista(){
    
        Nodo temp = inicio;
        
        while (temp != null){
            System.out.print(temp.dado + "->");
            temp = temp.proximo;
        
        }
        System.out.println();
    
    
    }
    
     
}
