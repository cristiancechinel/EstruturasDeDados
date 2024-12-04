
package com.mycompany.estruturasdedados;
//git add *
//git commit -m "Aula 03.12.2024" 
//git push 
public class TestaGrafo {

    public static void main(String[] args){
    
    
        Grafo g = new Grafo(5);
        System.out.println(g);
        
        g.setAresta(0, 1);
        g.setAresta(1, 2);
        g.setAresta(1, 3);
        g.setAresta(2, 4);
        g.setAresta(3, 4);
        
        

        System.out.println(g);
        
        BuscaLargura bl = new BuscaLargura(g);
        bl.busca(0);
        bl.imprimeVetores();
        
        for (int i = 0; i < 5; i++){
            bl.imprimeCaminhoInverso(i);
            System.out.println();
        }
    
    }
    
}
