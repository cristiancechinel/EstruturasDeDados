
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
    
    boolean vazia(){
        if (inicio == null) return true;
        else return false;
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
    
    Integer removeUltimo(){
        if (inicio != null){
            Integer n = ultimo.dado;
            if (inicio == ultimo){//somente um elemento
                inicio = ultimo = null;
            }
            else {
                ultimo = ultimo.anterior;
                ultimo.proximo = null;
            }
            return n;
        }
        else{
            return null;
        }   
    
    
    }
    
    Integer removeMeio(int n){
    
       Nodo atual = inicio;
       while (atual != null && atual.dado != n){
           atual = atual.proximo;
        }
        if (atual == null)
            return null;

        //tratar quando é o único elemento 
        
        if (inicio == ultimo){
            Integer x = atual.dado;
            inicio = ultimo = null;
            return x; 
        }
       //primeiro elemento
        if (atual.anterior == null){
            Integer x = atual.dado;
            inicio = inicio.proximo;
            inicio.anterior = null;
            //falta atualizar o anterior do proximo
            return x;
        }
        else{//remove ultimo elemento
            if (atual.proximo == null){
                Integer x = atual.dado;
                atual.anterior.proximo = null;
                ultimo = ultimo.anterior;
                return x; 
                
            }
            //elemento no meio
            else {
                Integer x = atual.dado;
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
                return x;
            }
        }
        //falta tratar quando é o último elemento
    }
    
    
    
    
    Integer removeInicio(){
        
        if (inicio != null){
            Integer n = inicio.dado;
            if (inicio == ultimo){
                inicio = ultimo = null;
            }
            else {
                inicio.proximo.anterior = null;
                inicio = inicio.proximo;        
            }
            return n;
        }
        else{
            return null;
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
