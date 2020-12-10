/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numramdom;

/**
 *
 * @author Hernandez
 */
public class NumRamdom {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int [] numeros = new int [1000000];
       for (int x=0;x<numeros.length;x++){
       numeros[x] = (int) (Math.random()*1000000)+1;
       }
       for  (int y=0; y<numeros.length; y++)
            System.out.print(numeros[y]+",");
    }
    
    
}
