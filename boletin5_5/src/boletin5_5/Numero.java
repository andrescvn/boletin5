/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_5;

/**
 *
 * @author acomesanavila
 */
public class Numero {
    private float num1, num2, num3;
    public Numero(){
        
    }
    public Numero(float n1,float n2,float n3){
        num1=n1;
        num2=n2;
        num3=n3;          
    }
    public void maior (float n1, float n2, float n3){
     if (n1>n2&&n1>n3)
            System.out.println("o maior e " +n1);
     else if (n2>n1&&n2>n3)
            System.out.println("o maior e "+ n2);
     else 
            System.out.println("o maior e "+ n3);
        
    }
}
 