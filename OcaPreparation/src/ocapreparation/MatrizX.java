/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocapreparation;

import java.util.Random;

public class MatrizX {
private int m [][];
private int n;

    public MatrizX(int n) {
        this.n = n;
        m =new int[n][n];
        fill();
    }

private void fill (){
    Random rd = new Random();
    for (int i = 0;i < n; i++){
        for (int j = 0;j< n; j++){
            m[i][j] = rd.nextInt(100);
        }
    } 
}

    @Override
    public String toString() {
        String aux = "";
        
        for (int i = 0; i < n; i++){
            for (int j = 0;j< n; j++){
                aux += m[i][j] + "\t";
        }
            aux += "\n";
    } 
        return aux;
    }
    
    
}
