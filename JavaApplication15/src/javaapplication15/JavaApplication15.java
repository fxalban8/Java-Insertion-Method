/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author dell
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void ordenarArregloPorInsercion(int [] arreglo){

        int pos, aux;
        
        for (int i=0; i<arreglo.length;i++){   
            pos=i;  //guarda la posicion
            aux=arreglo[i]; //guarda el número de esa posicion
            
            while((pos>0)&&arreglo[pos-1]>aux){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double start_time= System.nanoTime();
        int array1[] = {29,34,23,45,6};
        
        ordenarArregloPorInsercion(array1);

        for(int i: array1){
            System.out.print(i+" ");
        }
        System.out.println("\n"+(System.nanoTime()-start_time));
    }
}
