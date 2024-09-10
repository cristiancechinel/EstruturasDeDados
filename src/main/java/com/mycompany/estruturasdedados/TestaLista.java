
package com.mycompany.estruturasdedados;

public class TestaLista {

    public static void main(String[] args){
        
        ListaSequencial lista = new ListaSequencial(5);
        System.out.println("lista vazia = " + lista.vazia());
        
        lista.insere(7);
        lista.insere(10);
        lista.insere(15);
        lista.insere(20);
        lista.insere(25);

        lista.insere(6);
        lista.insere(88);
        lista.imprime();
        System.out.println("tam" + lista.getTamanho());
     //   lista.redimensionar(10);
        
        lista.remove();
        lista.remove();
        lista.remove();
        lista.remove();
        lista.remove();

       
        lista.imprime();
        System.out.println("tam" + lista.getTamanho());        
      
        
    }
   
}
