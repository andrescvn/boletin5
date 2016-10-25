/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1=new Producto();
        float cant;
        cant=Float.parseFloat(JOptionPane.showInputDialog("cantidad"));
        producto1.tipo(cant);
                
    }
    
}
