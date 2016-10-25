/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

/**
 *
 * @author acomesanavila
 */
public class Producto {
    private float cant;
   public Producto(){
       cant=0;
       
   }
   public Producto(float cant){
       this.cant=cant;
   }
   public void tipo (float n1){
       String mensaxe;
       if (n1<=100)
           mensaxe="baixa";                
       else if (n1<=500)
       mensaxe="media";
       else if (n1<=1000)
           mensaxe="alta";
      else 
           mensaxe="primeira";
       System.out.println("o producto e de " + mensaxe +" necesidade");
}
   }

