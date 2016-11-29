/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo3;

/**
 *
 * @author SALAS
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("calificaciones2.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {

        double promedio;
        double prom_mayor = 0;

        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                
                System.out.println(linea_partes.get(0) + linea_partes.get(1) + 
                        linea_partes.get(2) + linea_partes.get(3) + "\n");
                
                double nota1 = Double.parseDouble(linea_partes.get(2));
                double nota2 = Double.parseDouble(linea_partes.get(3));

                promedio = (nota1 + nota2) / 2;

                System.out.printf("Nombre: %s| Apellido: %s | Promedio: %.2f\n ",
                        linea_partes.get(0), linea_partes.get(1), promedio);

                if (promedio > prom_mayor) {
                    prom_mayor = promedio;
                }

            } // fin de while

            System.out.printf("El mayor promedio es: %.2f", prom_mayor);
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto
