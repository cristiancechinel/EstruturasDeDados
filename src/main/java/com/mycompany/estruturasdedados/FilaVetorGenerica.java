package com.mycompany.estruturasdedados;

public class FilaVetorGenerica<Item> {
    
    private int ini, qt; 
    private Item[] dados;
    
    FilaVetorGenerica(int tam){
        ini = qt = 0;
        dados = (Item[]) new Object[tam];
        //instancia um objeto do tipo Object e 
        // transforma esse objeto em um vetor de itens
    }
    
    void insereFinal(Item n){
        if (qt != dados.length){
            int pos = (ini + qt) % dados.length;
            dados[pos] = n;
            qt++;
            System.out.println("inseriu " + n);
            //pode inserir
        }
        //não pode inserir
    }
    
    Item removeInicio(){
        if (qt != 0){
            Item n = dados[ini];
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
    

    
}
