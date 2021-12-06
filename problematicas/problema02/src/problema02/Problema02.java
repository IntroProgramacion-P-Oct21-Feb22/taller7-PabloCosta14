/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author DELL
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int limite = 110;
        int val = 2;
        int suma = 4;
        String cadena = "";

        while (val <= limite) {
            cadena = String.format("%s %s", cadena, val);
            val = val + suma;
            suma = suma + 2;

        }
        System.out.println(cadena);
    }

}
