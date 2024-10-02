
package com.mycompany.estruturasdedados;


public class TestaNodoArvore {
    
    public static void main(String[] args){
    
        NodoArvore d = new NodoArvore(20,null, null );
        NodoArvore e = new NodoArvore(35,null, null);
        NodoArvore f = new NodoArvore(50,null, null);
        NodoArvore g = new NodoArvore(16,null, null);
        
        NodoArvore b = new NodoArvore(10, d, e);
        NodoArvore a = new NodoArvore(8, f, g);
        NodoArvore h = new NodoArvore(15, b, a);

        System.out.println(h.busca(h, 16));
        

    }
}
