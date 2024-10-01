/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturasdedados;

public class PilhaEncadeada {

        private ListaDuplamenteEncadeada lista;
        
        PilhaEncadeada(){
            lista = new ListaDuplamenteEncadeada();
        }
        
        void empilha(Integer valor){
            lista.insereFinal(valor);
        
        }

        Integer desempilha(){
            return lista.removeUltimo();
        }
        
        void imprimePilha(){
            lista.imprimeLista();
        }
}
