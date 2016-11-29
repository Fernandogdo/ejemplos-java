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
public class PruebaLeerArchivoTexto
{
   public static void main( String args[] )
   {
      LeerArchivoTexto calificaciones2 = new LeerArchivoTexto();

      calificaciones2.abrirArchivo();
      calificaciones2.leer_informacion();
      calificaciones2.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoTexto
