/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author SALAS
 */
public class CalculoFactorial {

    public double factorial(double numero) {

        if (numero <= 1) {
            return 1;
        } else {
            return numero * factorial (numero - 1);
        }
    }
    
    public void mostrarFactoriales(){
    
        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("%d! = %.0f\n", contador, factorial(contador));
        }
    }
}
