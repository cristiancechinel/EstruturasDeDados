package com.mycompany.estruturasdedados;

public class FilaVetor {
    
    private int ini, qt; 
    private Integer[] dados;
    
    FilaVetor(int tam){
        ini = qt = 0;
        dados = new Integer[tam];
    }
    
    void insereFinal(int n){
        if (qt != dados.length){
            int pos = (ini + qt) % dados.length;
            dados[pos] = n;
            qt++;
            System.out.println("inseriu " + n);
            //pode inserir
        }
        //não pode inserir
    }
    
    Integer removeInicio(){
        if (qt != 0){
            Integer n = dados[ini];
            // retirar proxima linha depois
            //dados[ini] = null;
            ini = (ini + 1) % dados.length;
            qt--;
            return n;
            //pode remover
        }
        //não pode remover
        return null;
        
    }
    
    void imprimeFila(){
        int tam = dados.length;
        int fim = (ini + qt) % tam;
        for (int i = ini; i != fim; i = (i + 1)%tam){
            System.out.print(dados[i] + "->");
        }
    
    }
    
    void imprimeFilaNovo(){
       int i = ini;
       int j = 0;
       while(j < qt){
           System.out.print(dados[i] + "->");
           i = (i + 1) % dados.length;
           j++;
       }
           
           
    }
    
    void imprimeFilaBackup(){
        for (int i = 0; i < dados.length; i++){
            System.out.print(dados[i]+ "->");
        }
        System.out.println();

    
    }
    
}
