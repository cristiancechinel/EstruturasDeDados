package com.mycompany.estruturasdedados;


public class TestaFila {
    
       public static void main(String[] args){
       
       
           FilaVetorGenerica<String> f = new FilaVetorGenerica<String>(5);
           f.insereFinal("casa");
           f.insereFinal("comida");
           f.insereFinal("compras");
           f.insereFinal("carro");
           f.insereFinal("edifício");
           f.imprimeFila();
           String r = f.removeInicio();
           System.out.println("removeu " + r);
           f.imprimeFila();
           r = f.removeInicio();
           System.out.println("removeu " + r);
           f.imprimeFila();
           f.insereFinal("animal");
           f.imprimeFila();
           f.insereFinal("avião");
           f.imprimeFila();
           r = f.removeInicio();
           System.out.println("removeu " + r);
           f.imprimeFila();

       
       
       }
    
}
