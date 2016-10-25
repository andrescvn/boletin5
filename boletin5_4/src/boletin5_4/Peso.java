/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author acomesanavila
 */
public class Peso {
    private float peso1,peso2;
    public Peso (){
        
    }
    public Peso (float peso1,float  peso2){
        this.peso1=peso1;
        this.peso2=peso2;
    }
    public void maisPesado(float peso1, float peso2){
        if(peso1>peso2)
            System.out.println("el primero pesa mas");
        else
            System.out.println("el segundo pesa mas");
 
    }
       public void direfenciaPeso (float peso1, float peso2){
    float maior=(peso1>peso2)? (peso1-peso2):(peso2-peso1);
       System.out.println("diferencia = "+ maior );
  
}
}
