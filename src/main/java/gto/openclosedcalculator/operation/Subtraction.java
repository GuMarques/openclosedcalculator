/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gto.openclosedcalculator.operation;

import gto.openclosedcalculator.interfaces.Ioperation;

/**
 *
 * @author gtool
 */
public class Subtraction implements Ioperation {
    
    private double x;
    private double y;
    
    public Subtraction (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculate() {
        return x - y;
    }
    
}
