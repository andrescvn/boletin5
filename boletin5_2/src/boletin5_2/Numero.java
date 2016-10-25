/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

/**
 *
 * @author acomesanavila
 */
public class Numero {
    private short num1,num2;
    public Numero (){
        num1=0;
        num2=0;
    }
    public Numero(short n1, short n2){
        num1=n1;
        num2=n2;               
    }
    public void cuentas (short n1,short n2){
        if (n1>=n2)
            System.out.println("resta =" + (n1-n2)); 
            System.out.println("suma = "+ (n1+n2));
    }        
    
}
