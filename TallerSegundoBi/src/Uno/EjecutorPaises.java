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
public class EjecutorPaises {

    public static void main(String args[]) {
        Paises a = new Paises();

        a.abrirArchivo();
        a.leer_informacion();
        a.cerrarArchivo();
    }
}
