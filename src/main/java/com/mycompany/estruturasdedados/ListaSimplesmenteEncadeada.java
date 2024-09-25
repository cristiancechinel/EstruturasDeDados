package com.mycompany.estruturasdedados;

public class ListaSimplesmenteEncadeada {
    
    Nodo inicio;
    
    private class Nodo{
        Integer dado;
        Nodo prox;
    
    }
    
    void insereInicio(int n){
        Nodo novo = new Nodo();
        novo.dado = n;
        novo.prox = inicio;
        inicio = novo;
    }
   
    
    Integer removeInicio(){
        if (inicio != null){
            int temp = inicio.dado;
            inicio = inicio.prox;
            return temp;
        
        }
        return null;
    
    }
    
    Integer removeMeio(int n){
    
        Nodo atual = inicio;
        Nodo anterior = null;
        //enquanto não chegou no final da lista
        //e não encontrou n
        while (atual != null && atual.dado != n){
            anterior = atual;
            atual = atual.prox;
        }
        //não encontrou encontrou - se chegou no final da lista
        // se o atual == null
        if (atual == null)
            return null;
        
        //nesse ponto sabemos que o n foi encontrado
        //verificar a posição - inicio da lista
        if (anterior == null){
            int x = atual.dado;
            inicio = inicio.prox;
            return x;
        }
        else {
            int x = atual.dado;
            anterior.prox = atual.prox; 
            return x;
        }

    }
    
    void imprimeLista2(){
    
        for (Nodo temp = inicio; temp != null; temp = temp.prox)
            System.out.print(temp.dado + "->");
        
        System.out.println();
    
    }
    
    void imprimeLista(){
    
        Nodo temp = inicio;
        
        while (temp != null){
            System.out.print(temp.dado + "->");
            temp = temp.prox;
        
        }
        System.out.println();
    
    
    }
    
}
