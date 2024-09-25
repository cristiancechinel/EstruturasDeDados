
package com.mycompany.estruturasdedados;

public class TestaDuplamenteEncadeada {
    
    public static void main(String[] args){
    
        ListaDuplamenteEncadeada lis = new ListaDuplamenteEncadeada();
         
        lis.insereInicio(8);
        lis.insereInicio(9);      
        lis.insereFinal(10);
        lis.insereFinal(15);

        lis.imprimeLista();
        
        System.out.println("removeu " + lis.removeMeio(10));
        lis.imprimeLista();   
        
        System.out.println("removeu " + lis.removeMeio(77));
        lis.imprimeLista();   
        
        System.out.println("removeu " + lis.removeMeio(9));
        lis.imprimeLista();          
         
         System.out.println("removeu " + lis.removeMeio(15));
        lis.imprimeLista();          
                
              System.out.println("removeu " + lis.removeMeio(8));
        lis.imprimeLista();          
                
           
        
       // System.out.println("removeu " + lis.removeInicio());
    }
    
}
