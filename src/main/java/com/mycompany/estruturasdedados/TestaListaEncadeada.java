// git add * 
// git commit -m "Aula 24.09.2024"  
// git push 
package com.mycompany.estruturasdedados;

import com.mycompany.estruturasdedados.ListaSimplesmenteEncadeada;

public class TestaListaEncadeada {
    public static void main(String[] args){
        
        PilhaEncadeada p = new PilhaEncadeada();
        FilaEncadeada f = new FilaEncadeada();
        
        p.empilha(7);
        p.empilha(8);
        p.empilha(20);
        
        p.imprimePilha();
        
        
        f.insereFinal(p.desempilha());
        p.imprimePilha();

        f.insereFinal(p.desempilha());
        p.imprimePilha();
    
        f.insereFinal(p.desempilha());
        p.imprimePilha();
   
        f.insereFinal(p.desempilha());
        p.imprimePilha();

        
        f.imprimeFila();
   
        
        
    }
}
