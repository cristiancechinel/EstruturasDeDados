
package com.mycompany.estruturasdedados;

public class PilhaVetorGenerica<Item> {
    
    private int qt;
    private Item[] dados;
    
    PilhaVetorGenerica(int tam){
        this.dados =  (Item[]) new Object[tam];
        this.qt = 0;
    }
    
    boolean eh_vazia(){  //is_empty
        if (this.qt == 0)
            return true;
        return false;
    
    }
        
    void empilha(Item n){ //push
        if (this.qt != this.dados.length){//verifica se está cheia
            this.dados[qt] = n;
            this.qt++;
        }
    }
    
    Item desempilha(){ //pop
        if (!eh_vazia()){
            Item n = this.dados[this.qt-1];
            this.qt--;   
            return n;
            // this.qt--;
            // int n = this.dados[this.qt];
        }
        return null;
    }
    
    void imprimePilha(){
        for (int i = 0; i < this.qt; i++)
            System.out.print(this.dados[i] + " ");
        System.out.println();
    }
}
