/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gto.openclosedcalculator;

import gto.openclosedcalculator.calculator.Calculator;
import java.util.Arrays;

/**
 *
 * @author gtool
 */
public class Openclosedcalculator {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[2]);
        
        char op = args[1].charAt(0);
        
        Calculator calculator = new Calculator();
        System.out.println(x + " " + op + " " + y + " = " + calculator.calculate(op, x, y));
        
    }
    
}
