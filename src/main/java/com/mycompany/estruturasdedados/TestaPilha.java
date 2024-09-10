
package com.mycompany.estruturasdedados;


public class TestaPilha {
    
    public static void main(String[] args){
    
        
        //int Integer
        //float Float
        
        PilhaVetorGenerica<String> p = new PilhaVetorGenerica<String>(5);
        
        p.empilha("a");
        p.empilha("b");
        p.empilha("c");
        p.empilha("d");
        p.empilha("e");
        p.empilha("f");
        
        p.imprimePilha();
    
        System.out.println(p.desempilha());
        System.out.println(p.desempilha());

    }
    
    
}
