package com.mycompany.estruturasdedados;

public class ListaSimplesmenteEncadeada {
    
    Nodo inicio;
    
    private class Nodo{
        int dado;
        Nodo prox;
    
    }
    
    void insereInicio(int n){
        Nodo novo = new Nodo();
        novo.dado = n;
        novo.prox = inicio;
        inicio = novo;
    }
   
    
    int removeInicio(){
        if (inicio != null){
            int temp = inicio.dado;
            inicio = inicio.prox;
            return temp;
        
        }
        return -1;
    
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
