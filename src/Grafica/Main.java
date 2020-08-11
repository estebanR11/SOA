/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Estructural.Universidad;

/**
 *
 * @author Cristian Devia
 */
public class Main {

    static Universidad uni = new Universidad();    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GUIPrincipal interfaz = new GUIPrincipal();
        interfaz.setVisible(true);
    }
    
}
