/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gto.openclosedcalculator.calculator;

import gto.openclosedcalculator.interfaces.Ioperation;
import gto.openclosedcalculator.operation.Division;
import gto.openclosedcalculator.operation.Exponentiation;
import gto.openclosedcalculator.operation.Multiplication;
import gto.openclosedcalculator.operation.Subtraction;
import gto.openclosedcalculator.operation.Sum;

/**
 *
 * @author gtool
 */
public class Calculator {
    private char operator;
    private double x;
    private double y;
    
    public double calculate(char operator, double x, double y) {
        this.setValues(operator, x, y);
        Ioperation operation = getOperation();
        return operation.calculate();
    }
    
    private void setValues(char operator, double x, double y) {
        this.operator = operator;
        this.x = x;
        this.y = y;
    }
    
    private Ioperation getOperation() {
        Ioperation operation = null;
        
        switch(this.operator) {
            case '+':
                operation = new Sum(this.x, this.y);
                break;
            case '-':
                operation = new Subtraction(this.x, this.y);
                break;
            case '/':
                operation = new Division(this.x, this.y);
                break;
            case '*':
                operation = new Multiplication(this.x, this.y);
                break;
            case '^':
                operation = new Exponentiation(this.x, this.y);
                break;
        }
        return operation;
    }
        
}
