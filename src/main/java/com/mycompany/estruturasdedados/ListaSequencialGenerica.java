
package com.mycompany.estruturasdedados;
import java.lang.IndexOutOfBoundsException;

public class ListaSequencialGenerica<Item>{
    private int quantidade;
    private Item[] dados; //declarando como vetor-array
    
   
    
    public ListaSequencialGenerica(int tam){
        dados = (Item[]) new Object[tam];    
    }
    
    public int getTamanho(){//metodo acessório não faz parte da estrutura
        return this.dados.length;
    
    }
    
    public void redimensionar(int max){
    
        Item temp[] = (Item[]) new Object[max];
        for (int i = 0; i < this.quantidade; i++){
            temp[i] = this.dados[i];
        }
        
        this.dados = temp;
    }
    
    
    public boolean vazia(){
        return this.quantidade == 0;
    
    }
    
    public void insere(Item n){
        
        if (dados.length == quantidade){//vetor está cheio
            redimensionar(dados.length * 2);
          
        }
        dados[quantidade] = n;
        quantidade++;
        
        
    }
    
    public void insereFixo(Item n){
        if (dados.length != quantidade){
            dados[quantidade] = n;
            quantidade++;
        }
    }
    
    public void imprime(){
        for (int i = 0; i < this.quantidade; i++)
            System.out.print(dados[i] + " -> ");
        System.out.println();
    
    }
    
    public Item removeInicio(){
        if (this.quantidade > 0 ){
            Item n = dados[0];
            this.quantidade--;

            for (int i = 1; i <= quantidade; i++){
                dados[i-1] = dados[i];
            }
            return n;
        }
        return null;
    }
    
    public Item remove(){
        if (this.quantidade > 0){
            Item n = dados[quantidade-1];
            quantidade--;
            if (quantidade > 0 && quantidade == dados.length/4){
                redimensionar(dados.length/2);
            }
            return n;
        }
        return null;
    }
    
    
    public Item removeFixo(){
        if (this.quantidade > 0){
            Item n = dados[quantidade-1];
            quantidade--;
            return n;
        }
        return null;
    }
}
