/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuaduiiejercicio1;

/**
 *
 * @author sergi
 */
public class CuadUIIEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int salarioNeto;
        int pagoXHoras = 20, horasTrabajadas = 35;

        if (horasTrabajadas >= 40) {
            salarioNeto = (pagoXHoras * horasTrabajadas) + 500;
        } else {
            salarioNeto = pagoXHoras * horasTrabajadas;
        }

        System.out.println("El salario del empleado es " + salarioNeto);
    }
    
}
