package cuaduiiejercicio1;

public class CuadUIIEjercicio1 {
    public static void main(String[] args) {
        int pagoXHoras = 20, horasTrabajadas = 35;

        int salarioNeto = (horasTrabajadas >= 40)
                ? (pagoXHoras * horasTrabajadas) + 500
                : pagoXHoras * horasTrabajadas;

        System.out.println("El salario del empleado es " + salarioNeto);
    }
}
