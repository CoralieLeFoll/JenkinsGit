/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunitaire;

/**
 *
 * @author coralie
 */
public class TestUnitaire {

public static int add(int n1, int n2) {
    return n1 + n2;
}

public static int divInt(int n1, int n2) {
    if(n2 == 0) {
        throw new IllegalArgumentException("Cannot divide by 0");
    }
    return n1/n2;
}

public static double divReal(int n1, int n2) {
    if(n2 == 0) {
        throw new IllegalArgumentException("Cannot divide by 0");
    }
    return (double)n1/n2;
}
    
}
