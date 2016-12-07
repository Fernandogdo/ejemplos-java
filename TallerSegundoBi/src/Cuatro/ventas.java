/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuatro;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */

public class ventas {

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrir_archivo() throws FileNotFoundException {
        try {
            salida = new Formatter("ventas.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrir_archivo

    // agrega registros al archivo
    public void agregar_informacion() {
        // el archivo permite el ingreso
        // de edad, nombre, apellido de una persona

        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cabecera = "";
        String producto = "";
        
        double precio = 0;

        while (bandera) // itera hasta que bandera sea false
        {
            try // envía valores al archivo
            {
                // obtiene los datos que se van a enviar
                System.out.println("1 Arroz; costo del kilo $2.50\n"
                        + "2 Azúcar; costo del kilo $1.50\n"
                        + "3 Aceite; costo $ 1.30 por unidad\n"
                        + "4 Tallarines; costo $ 1.50 por unidad\n"
                        + "5 Sal; costo del kilo $1.00\n");
                

                System.out.println("Ingrese la opcion del producto que desea comprar:");
                int opcion = entrada.nextInt(); // lee la edad 
                
                System.out.println("Ingrese la cantidad que desea:");
                int cantidad = entrada.nextInt(); // lee el nombre
                
                System.out.println("Ingrese el nombre de la persona");
                String nombre = entrada.next(); // lee el apellido
                
                System.out.println("Ingrese la ciudad:");
                String ciudad = entrada.next();
                
                salida.format("\t\tComercial Ventas y Reventas\nNombre: %s\nCiudad: %s\n"
                        + "-----------------------------------\n"
                        + "Producto\t\tCantidad\t\tPrecio\n", nombre, ciudad);
                
                if (opcion == 1) {
                    precio = 2.50 * cantidad;
                    producto = "Arroz";
                }
                if (opcion == 2) {
                    precio = 1.50 * cantidad;
                    producto = "Azúcar";
                }
                if (opcion == 3) {
                    precio = 1.30 * cantidad;
                    producto = "Aceite";
                }
                if (opcion == 4) {
                    precio = 1.50 * cantidad;
                    producto = "Tallarines";
                }
                if (opcion == 5) {
                    precio = 1 * cantidad;
                    producto = "Sal";
                }

                // escribe el nuevo registro (escribe en el archivo
                 salida.format("%s\t\t%d\t\t%.2f\n", producto, cantidad, precio);
                 
                 double subtotal = 0;
                 double iva;
                 double total;
                 
                 subtotal = subtotal + precio;

                System.out.println("Desea ingresar más datos si (1), no(2)");
                int datos = entrada.nextInt();
                if (datos == 2) {
                    bandera = false;
                }
                
                iva = subtotal * 0.14;
                total = subtotal + iva;
                
                salida.format("----------------------------------------\n"
                    + "\t\t\tSubtotal: %.2f\n"
                    + "\t\t\tIVA: %.2f\n"
                    + "\t\t\tTOTAL: %.2f\n\n", subtotal, iva, total);
                
                

            } // fin de try
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch

        } // fin de while
    } // fin del método agregarRegistros

    // cierra el arrchivo
    public void cerrar_archivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo

}
