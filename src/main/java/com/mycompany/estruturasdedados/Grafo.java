
package com.mycompany.estruturasdedados;


public class Grafo {
    private int V;
    private int matriz[][];
    
    Grafo(int v){
        setVertice(v);
        setMatriz();
       //setVertice
       //setMatriz
    }
    void setVertice(int v){
        //recebe a quantidade de vertices e seta V
        if (v >= 1) this.V = v;
        else this.V = 1;
    }
    
    int getVertice(){
        return this.V;
    }
    void setMatriz(){
        //cria a matriz VxV e zerar a mesma 
        this.matriz = new int[this.V][this.V];
        for (int i = 0; i < this.V; i++)
            for (int j= 0; j < this.V; j++)
                this.matriz[i][j] = 0; 
    }
    
    boolean isAdjacente(int v1, int v2){
        return (this.matriz[v1][v2] == 1 && this.matriz[v2][v1] ==1);
    }
    
    void removeAresta(int v1, int v2){
        this.matriz[v1][v2] = 0;
        this.matriz[v2][v1] = 0;
    }
    
    void setAresta(int v1, int v2){
        this.matriz[v1][v2] = 1;
        this.matriz[v2][v1] = 1;
        //inserir controles para garantir q v1 e v2 existam
        //coloca a posicao da matriz em 1 
    }
    
    
    void imprimeGrafo(){
        for (int i = 0; i < this.V; i++){
            for (int j = 0; j< this.V; j++){
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    @Override
    public String toString(){
        String linha = "";
        
        for (int i = 0; i < this.V; i++){
            for (int j = 0; j< this.V; j++){
                linha = linha + this.matriz[i][j] + " ";
            }
            linha = linha + "\n";
        }
        linha = linha + "\n";
        return linha;
    }
}


