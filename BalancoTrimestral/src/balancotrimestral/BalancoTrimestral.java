/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancotrimestral;

/**
 *
 * @author 1700164
 */
public class BalancoTrimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gastosJaneiro = 150000;
        int gastosFevereiro = 230000;
        int gastosMarco = 170000;        
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("O gasto Trimestral foi de: " + gastosTrimestre);
    }
    
}
