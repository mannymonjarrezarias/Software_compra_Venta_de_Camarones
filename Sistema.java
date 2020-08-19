package registro_compra_venta_de_camarón;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *  @author Manny_Monjarrez_Arias
 */
public class CamaronContador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto = new Producto();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ");
        System.out.println("+++++++++++++++++++++++ CAMARON CONTADOR VRS 1 +++++++++++++++++++++++ ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ");
        System.out.println();
        
        for (TipoCamaron tipo : TipoCamaron.values()) {
            int cantidadKilos = 0;

            try {
                do {
                    System.out.print("Ingrese la cantidad de kilos que desea de camaron " + tipo.name() + ":");
                    //taking value as command line argument.
                    Scanner in = new Scanner(System.in);
                    cantidadKilos = in.nextInt();
                } while (cantidadKilos < 0);
            } catch (InputMismatchException e) {
                //System.err.println(" InputMismatchException: " + e.getMessage());
                System.out.println(" ERROR  ===== Ingreso un valor no numérico ===== " );
            }
            producto.setNombre("Camaron "  + tipo.name());
            producto.setTipo(tipo.name());
            producto.setCantidad(cantidadKilos);
            producto.setPrecio(tipo.value() * cantidadKilos);
            
            System.out.println();
            System.out.println("Usted solicito  " + producto.getCantidad() + " Kilos de Camaron " + tipo.name() + " por un precio de " + tipo.value() + " por kilo " );
            System.out.println("TOTAL " + producto.getPrecio());
            System.out.println("TOTAL con Descuento " + producto.getPrecioConDescuento() );
            System.out.println(" *********************************************************************************** " );
            System.out.println();
        }

    }
    
    
}
