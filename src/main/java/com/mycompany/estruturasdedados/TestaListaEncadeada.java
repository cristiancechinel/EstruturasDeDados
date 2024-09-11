
package com.mycompany.estruturasdedados;

import com.mycompany.estruturasdedados.ListaSimplesmenteEncadeada;

public class TestaListaEncadeada {
    public static void main(String[] args){
        
        ListaSimplesmenteEncadeada lis = new ListaSimplesmenteEncadeada();
        lis.insereInicio(8);
        lis.insereInicio(10);
        lis.insereInicio(15);
        
        lis.imprimeLista();
        int x = lis.removeInicio();
        lis.imprimeLista();
        
        x = lis.removeInicio();
        lis.imprimeLista();
        x = lis.removeInicio();
        lis.imprimeLista();
        x = lis.removeInicio();
        lis.imprimeLista();
        
        
    
    
    }
}
