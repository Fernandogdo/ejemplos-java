/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuatro;

import java.io.FileNotFoundException;

/**
 *
 * @author SALAS
 */
public class EjecutorVentas {
    public static void main( String args[] ) throws FileNotFoundException
   {
      ventas aplicacion = new ventas();

      aplicacion.abrir_archivo();
      aplicacion.agregar_informacion();
      aplicacion.cerrar_archivo();
   } // fi
}
