
package com.mycompany.estruturasdedados;

public class BuscaLargura {

    private int cor[], pai[], distancia[];
    private static final int BRANCO = -1;
    private static final int CINZA = 0;
    private static final int PRETO = 1;
    private Grafo grafo;
    
    
    private int origem;
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
        this.origem = origem;
        //para poder utilizar a origem em outros métodos
        
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
    
    void imprimeCaminhoInverso(int destino){
        System.out.println("origem = "+ origem + " destino = "+destino);
        System.out.println
        ("distancia de "+ origem + " para " + destino + " = " + distancia[destino]);
        imprimeCaminhoRec(destino);
        System.out.print(destino);
    }
    
    void imprimeCaminhoRec(int destino){
        int temp = destino;
        if (pai[temp] != -1){
            imprimeCaminhoRec(pai[temp]);
            System.out.print(pai[temp]  + "->");
        }
      }
    
   /* void imprimeCaminho(int destino){
        int temp = destino;
        System.out.print(temp + "<-");
        while (pai[temp] != -1){
            System.out.print(pai[temp] + "<-");
            temp = pai[temp];
        }
     //   System.out.print(destino);
    
    }
    
    */
    
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
