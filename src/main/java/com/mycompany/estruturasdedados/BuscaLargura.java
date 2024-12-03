
package com.mycompany.estruturasdedados;

public class BuscaLargura {

    private int cor[], pai[], distancia[];
    private static final int BRANCO = -1;
    private static final int CINZA = 0;
    private static final int PRETO = 1;
    private Grafo grafo;
    
    //cores -1 = branco, 0 = cinza, 1 = preto
    
    BuscaLargura(Grafo g){
        int v = g.getVertice();
        cor = new int[v];
        pai = new int[v];
        distancia = new int[v];
        for (int i = 0; i < v; i++){
            cor[i]  = BRANCO;
            pai[i]  = -1;
            distancia[i] = 0;
        }
        this.grafo = g;
    }
    
    public void busca(int origem){
        cor[origem] = CINZA;
        FilaEncadeada fila = new FilaEncadeada();
        fila.insereFinal(origem);
    
        while (!fila.filaVazia()){
            int u = fila.removeInicio();
            
            for (int v = 0; v < grafo.getVertice(); v++) {
                if (grafo.isAdjacente(u, v)){
                   if (cor[v] == BRANCO){
                       cor[v] = CINZA;
                       distancia[v] = distancia[u] + 1;
                       pai[v] = u;
                       fila.insereFinal(v);
                   }     
                }
            }
            cor[u] = PRETO;
        }
    }
    
    
    
    
    void imprimeVetores(){
        
        
        for (int i = 0; i < this.grafo.getVertice(); i++){
            System.out.print(cor[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < this.grafo.getVertice(); i++){
            System.out.print(pai[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < this.grafo.getVertice(); i++){
            System.out.print(distancia[i] + " ");
        }
        System.out.println();
    }
    
    
}
