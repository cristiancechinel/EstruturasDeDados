/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturasdedados;

public class PilhaGenerica<Item> {
    private ListaDuplamenteEncadeadaGen<Item> lista;
    
    
    PilhaGenerica(){
        lista  = new ListaDuplamenteEncadeadaGen<Item>();
    }
    
    void empilha(Item valor){
        lista.insereFinal(valor);
    
    }
    
    Item desempliha(){
        return lista.removeUltimo();
    
    }
    
    void imprimePilha(){
        lista.imprimeLista();
    
    }
}
