
package com.mycompany.estruturasdedados;

public class TestaGrafo {

    public static void main(String[] args){
    
    
        Grafo g = new Grafo(4);
        System.out.println(g);
        
        g.setAresta(0, 1);
        g.setAresta(1, 2);
        g.setAresta(1, 3);
        

        System.out.println(g);
        
        BuscaLargura bl = new BuscaLargura(g);
        bl.busca(0);
        bl.imprimeVetores();
    
    }
    
}
