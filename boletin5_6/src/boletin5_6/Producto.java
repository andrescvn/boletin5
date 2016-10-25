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
       if (n1<=100)
           System.out.println("baixo");
       else if (n1<=500)
           System.out.println("medio");
       else if (n1<=1000)
           System.out.println("alto");
      else 
           System.out.println("primeira necesidade"); 
}
   }

