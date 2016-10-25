/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

/**
 *
 * @author acomesanavila
 */
public class Numero {
    private float num1;
    public Numero () {
        
    }
    public Numero (float n1){
        num1=n1;
        
    }
    public void signo (float n1){
        if (n1>0)
            System.out.println("+");
        else if (n1==0)
            System.out.println("0");
        else 
          System.out.println("-");        
    }
}
