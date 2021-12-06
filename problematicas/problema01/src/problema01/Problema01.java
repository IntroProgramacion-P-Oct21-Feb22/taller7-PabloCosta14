/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        boolean bandera = true;
        String salida;
        double edad;
        double estatura;
        String posicion;
        double promedio_edad;
        double promedio_estatura;
        String cadena_final = "";
        double suma_edad = 0;
        double suma_estatura = 0;
        double contador = 0;
        String listadoEdades = "";

        do {
            System.out.println("ingrese su nombre y el apellido");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();

            System.out.println("ingrese la edad del jugador");
            edad = entrada.nextDouble();

            System.out.println("Escribir la estatura del jugador");
            estatura = entrada.nextDouble();

            cadena_final = String.format("%s %s - %s - edad %s - estatura %.2f\n",
                    cadena_final, nombre, posicion, edad, estatura);

            contador = contador + 1;
            suma_edad = suma_edad + edad;
            suma_estatura = suma_estatura + estatura;

            listadoEdades = String.format("%s %s", listadoEdades, edad);

            System.out.println("Ingrese 'si' para dejar la entrada de datos ");
            salida = entrada.nextLine();

            salida = entrada.nextLine();

            if (salida.equals("si")) {
                bandera = false;
            }
        } while (bandera);

        promedio_edad = suma_edad / contador;
        promedio_estatura = suma_estatura / contador;

        System.out.println(cadena_final);
        System.out.printf("Listado edades %s", listadoEdades);
        System.out.printf("Promedio de edades es %s", promedio_edad);
        System.out.printf("Promedio de estaturas %s", promedio_estatura);
    }

}
