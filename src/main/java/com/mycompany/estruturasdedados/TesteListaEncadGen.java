/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturasdedados;

/**
 *
 * @author cechinel
 */
public class TesteListaEncadGen {
    
    public static void main(String[] args){
       ListaDuplamenteEncadeadaGen lista = 
                new ListaDuplamenteEncadeadaGen<Float>();
       
       lista.insereInicio(3.4);
       lista.insereInicio(8.5);
       lista.imprimeLista();
    
    }
    
    
}
