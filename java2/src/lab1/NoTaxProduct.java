/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author macos
 */
public class NoTaxProduct extends Product{

    @Override
    public double getImportTax() {
        return 0; 
    }
    
}
