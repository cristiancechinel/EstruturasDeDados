
package com.mycompany.estruturasdedados;

public class TestaDuplamenteEncadeada {
    
    public static void main(String[] args){
    
        ListaDuplamenteEncadeada lis = new ListaDuplamenteEncadeada();
        lis.insereInicio(7);
        lis.insereInicio(8);
        lis.insereInicio(9);
        lis.imprimeLista();
        
        lis.insereFinal(10);
        lis.insereFinal(15);
        lis.imprimeLista();

    }
    
}
