
package com.mycompany.estruturasdedados;


public class TesteListaEncadGen {
    
    public static void main(String[] args){
        PilhaGenerica<Character> p = new PilhaGenerica<Character>();
        p.empilha('c');
        p.empilha('a');
        p.empilha('s');
        p.empilha('t');
        
        p.imprimePilha();
    }
    
    
}
