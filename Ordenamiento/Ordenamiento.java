package Ordenamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordenamiento {
    public static ArrayList <Integer>lista = new ArrayList();
 Scanner leer = new Scanner(System.in);
    int num ;
    String xl;
    public static void main(String[] args) {
       Ordenamiento obj= new Ordenamiento ();
       Scanner leer=new Scanner (System.in);
       boolean continuar = true;
              Object Procesos;
       int  menu=0; 
              
    
        while(continuar){
    
        System.out.println("\n BIENVENIDOS A LOS METODOS DE ORDENAMIENTO \n"
                   + "1: INSERTAR NUMEROS A LA LISTA \n"
                   + "2: ORDENAMIENTO CON METODO shellSort "+"\n"
                   + "3: ORDENAMIENTO CON EL METODO  Ralix"+"\n"
                   + "4: SALIR DEL PROGRAMA.. ");
        menu=leer.nextInt();
        
          switch(menu){
            case 1:  
                  System.out.println(obj.insertar());
                break;
            case 2: 
                System.out.println(" ***********LISTA ORDENADA CON EL METODO shellSort ****************");
                Ordenamiento.shellSort(Ordenamiento.lista);
           
               break;
            case 3:
              System.out.println(" ***********LISTA ORDENADA CON EL METODO RADIX ****************");
                obj.radixSort(Ordenamiento.lista);
                break;
           
            case 4:
               System.out.println("fuera");
                    continuar =false;
                break;
                 default:
                 System.out.println("fuera de rango");
                 break;
           
          }
     }
  }
    
    public List<Integer>insertar (){
        for(int i=0;i<10;i++){
            System.out.println("INGRESE NUMEROS  A LA LISTA ");
           lista.add(num=leer.nextInt());
      
        }
    return lista;
  }
    public static void shellSort(ArrayList Lista){
    int divicion= Lista.size()/2,aux,salto,i;
     for(salto=divicion;salto !=0;salto/=2){
         boolean cambio = true;
         while(cambio){
             cambio=false;
         for(i=salto;i<Lista.size();i++){
        int A=(int) Lista.get(i-salto);
        int B=(int) Lista.get(i);
     if( A > B){
     aux=(int) Lista.get(i);
     Lista.set(Lista.indexOf(Lista.get(i)),Lista.get(i-salto));
     Lista.set(Lista.indexOf(Lista.get(i-salto)), aux);
     cambio=true;
         }
       }
     }  
    }
    Mostrar(Lista);  
  }
   
   
    public  void radixSort(ArrayList<Integer> Lista) {
        int i,j,x;
         
         for(x=Integer.SIZE-1;x>=0;x--){
         
         int Aux[]=new int[ Lista.size()];
         j=0;
         for(i=0;i< Lista.size();i++){
         
         boolean mover =  Lista.get(i)<<x>=0;
         if(x==0 ? !mover:mover){
          Aux[j]= Lista.get(i);
         j++;
         }else{
         Lista.set(Lista.indexOf(Lista.get(i-j)), Lista.get(i)); 
          
         }
       }
         for(i=j;i<Aux.length;i++){
         Aux[i]=Lista.get(i-j);
         }
         Lista.clear();
         for(i=0; i<Aux.length;i++){
            Lista.add(Aux[i]);
           
             }   
      }
         for(i=0;i<Lista.size();i++){
            System.out.print("   ["+Lista.get(i)+"]");
   }
}
    public static void Mostrar(ArrayList lista) {
     for(int i=0;i<lista.size();i++){
            System.out.print("   ["+lista.get(i)+"]");
    }
    }
}
   
