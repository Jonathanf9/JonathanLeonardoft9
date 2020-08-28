/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaloteria90;

import java.util.Arrays;

/**
 *
 * @author jonathanfb
 */
public class DatosUnicos {
    
     private int vector[];
    private EntradaLoteria90 entrada1;
   
    public DatosUnicos(){
        vector=new int[36];
        entrada1= new EntradaLoteria90();
    }
    public int generarAle(int min,int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    public int buscar(int n){
        for(int i=0;i<vector.length;i++){
            if(vector[i]==n){
                System.out.println("Elija otro numero, este numero ya fue ingresado : ");
                return i;
            }
        }
        return -1;
    }
    public void llenarDatosAle(){
        vector=new int[9];
        int n;
        for(int i=0;i<vector.length;i++){
            do{
                n=generarAle(1,49);
            }while(buscar(n)!=-1);
            vector[i]=n;
        }
    }
    public void llenarDatos(){
        vector=new int[9];
        System.out.println("Elije 9 numeros entre el 1 y el 49.");
        int n;
        for(int i=0;i<vector.length;i++){
            System.out.print("Elije el numero " + (i + 1) + ": ");
            do{
                entrada1.setEntradaInt();
                n=entrada1.getEntradaInt();
            }while(buscar(n)!=-1);
            vector[i]=n;
        }
    }
    public String mostrarDatos(){
        return Arrays.toString(vector);
    }
    public int getVectorElemento(int e){
        return vector[e];
    }
    public void ordenar(){
        Arrays.parallelSort(vector);
    }

   
}
    

