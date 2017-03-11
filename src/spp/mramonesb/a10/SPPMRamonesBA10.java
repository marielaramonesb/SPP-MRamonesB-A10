/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.a10;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int tamaño = tamaño();
    int [][] A = arreglo ("A", tamaño);
    int [][] B = arreglo ("B", tamaño);
        
        restamatriz (A,B);
       
    }
    public static int tamaño(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int A = 0;
        do{
            try{
                System.out.println("Teclea el tamaño del arreglo: ");
                A = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("ERROR");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return A;
    }
    public static int solicitarentero(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int A = 0;
        do{
            try{
                System.out.println("Teclea el entero: ");
                A = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("ERROR");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return A;
    }
    public static int [][] arreglo (String A, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + A);
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitarentero();
        }
        }
        return arreglo;
    }
    //resta de matrices en un metodo
    
    public static int [][] restamatriz (int [][]A, int[][]B){
        int [][] resultado = new int [A.length] [A.length];
        System.out.println("Resta: ");
        for (int i = 0; i < A.length; i++){
        for (int j = 0; j < A[i].length; j++){
        resultado[i][j] = A[i][j] - B[i][j];
        System.out.println("["+resultado[i][j]+"]");   
    }
        System.out.println("");   
    }
        return resultado; 
    }
    
}