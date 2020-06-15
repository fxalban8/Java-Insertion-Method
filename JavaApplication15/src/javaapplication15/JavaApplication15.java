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
        int array1[] = {3,2,3,4,8,29,34,12,24,56,78,12,21,6,3,63,56,99,145,23,12,89,23,45,23,14,15,23,45,78,99,123,18,3,6,23,46,23,12,67,43,56,78,1,5,4,6,99,12,8,67,43,21,89,123,56,21,56,12,123,56,23,34,56,12,12,1,89,23,56,12,85,89,12,34,56,23,45,97,67,24,56,12,5,8,23,45,11,72,49,109,185,122,2,2,23,341,237,112,109};
        
        ordenarArregloPorInsercion(array1);

        for(int i: array1){
            System.out.print(i+" ");
        }
        System.out.println("\n"+(System.nanoTime()-start_time));
    }
}
