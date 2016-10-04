/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            float tariza;
        float pagado, descuento;
        pagado=Float.parseFloat(JOptionPane.showInputDialog("pagado "));
        tariza=Float.parseFloat(JOptionPane.showInputDialog("tariza"));
        descuento=100*(pagado-tariza)/pagado;
        JOptionPane.showMessageDialog(null, "descuento ="+ descuento);
    }
    
}
