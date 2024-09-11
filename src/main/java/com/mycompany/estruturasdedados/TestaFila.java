package com.mycompany.estruturasdedados;


public class TestaFila {
    
       public static void main(String[] args){
       
       
           FilaVetor f = new FilaVetor(5);
           f.insereFinal(5);
           f.insereFinal(6);
           f.insereFinal(7);
           f.insereFinal(8);
           f.insereFinal(9);
           f.imprimeFila();
           int r = f.removeInicio();
           System.out.println("removeu " + r);
           f.imprimeFila();
           r = f.removeInicio();
           System.out.println("removeu " + r);
           f.imprimeFila();
           f.insereFinal(66);
           f.imprimeFila();
           f.insereFinal(100);
           f.imprimeFila();
           r = f.removeInicio();
           System.out.println("removeu " + r);
           f.imprimeFila();

       
       
       }
    
}
