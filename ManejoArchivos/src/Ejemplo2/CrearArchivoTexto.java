/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

/**
 *
 * @author SALAS
 */
public class CrearArchivoTexto
{
   public static void main( String args[] )
   {
      ArchivoTexto aplicacion = new ArchivoTexto();

      aplicacion.abrir_archivo();
      aplicacion.agregar_informacion();
      aplicacion.cerrar_archivo();
   } // fin de main
} // fin d
