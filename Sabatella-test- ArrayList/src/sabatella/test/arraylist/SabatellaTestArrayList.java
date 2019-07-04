/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabatella.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SabatellaTestArrayList {

   

 
    public static void main(String[] args) {
      /* System.out.println("Hola");
       Scanner teclado=new Scanner(System.in);
       ArrayList elem= new ArrayList();
       ArrayList <Integer> elem2=new ArrayList();
     int dato=teclado.nextInt();
       elem.add("perro");
       elem.add(4);
      elem.add("edad");
       System.out.println(elem);
      /*while(dato>=0) {
          elem2.add(dato);
          dato=teclado.nextInt();
       }
       System.out.println(elem2);*/
      /* try {
           dato=teclado.nextInt();
           System.out.println(dato);
       } catch(Exception e) {
           System.out.println(e.toString());*/
       
      
        ArrayList <Mascotas> mascotas =new ArrayList();
        mascotas.add(new Mascotas("pichulo",4,13));
        System.out.println(mascotas);
        Mascotas gato1=new Mascotas("mishi",4,10);
        Mascotas loro1=new Mascotas("paco",2,25);
        mascotas.add(new Mascotas("mishi",4,10));
        mascotas.add(new Mascotas("paco",2,25));
        System.out.println(mascotas);
        Scanner entrada= new Scanner(System.in);
        String nombre;
        System.out.println("ingrese el nombre de su mascota y si desea salir,escriba salir");
        nombre=entrada.nextLine();
        int patas,edad;
      // while(!nombre.equals("salir")){
      while(!nombre.toUpperCase().equals("salir".toUpperCase())){
             patas=entrada.nextInt();
             edad=entrada.nextInt();
             System.out.println(new Mascotas(nombre,patas,edad));
             System.out.println("ingrese el nombre de su mascota y si desea salir,escriba salir");
             entrada.nextLine();
             nombre=entrada.nextLine();
        }
            //System.out.println(mascotas);
            Iterator it=mascotas.iterator();
            //it.hasNext()
            while(it.hasNext()){
                Mascotas mascota=(Mascotas) it.next();
               //System.out.println(((Mascotas) it.next()).getNombre());
               System.out.println(mascota.getNombre() + mascota.getPatas() + mascota.getEdad());
        
        
        
        

         
          }
          
        
              
          
            
        }
       
        
        
        
        
           
       }
      
 
       }
       
    
       
    

           
       
       
                                                                                                    
    
   

