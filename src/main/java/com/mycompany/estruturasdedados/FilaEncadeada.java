
package com.mycompany.estruturasdedados;

public class FilaEncadeada {
    
        ListaDuplamenteEncadeada lista;
        
        FilaEncadeada(){
            lista = new ListaDuplamenteEncadeada();
        }
        
        void insereFinal(Integer valor){
            lista.insereFinal(valor);
        }
        
        Integer removeInicio(){
             return lista.removeInicio();
        
        }

        boolean filaVazia(){
            return lista.vazia();
        }
        
        void imprimeFila(){
            lista.imprimeLista();
        
        }
        
    
}
