
package com.mycompany.estruturasdedados;

public class Calculadora {
    private PilhaGenerica<Float> valores;
    private PilhaGenerica<Character> operadores;
    
    
    Calculadora(){
        valores = new PilhaGenerica<Float>();
        operadores = new PilhaGenerica<Character>();
    
    }
}
