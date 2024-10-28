package Funciones;
/* Ejercicio 1: Cálculo de ingresos mensuales*/

public class ingresosMensuales {
    public static void main(String[] args) {
        double[]ventas = {20.60, 30.59, 304.43, 458.32, 506, 655, 778.90, 80.24, 91.20, 100, 151, 11.22, 15.3, 140, 125, 11.56, 21.7, 10.18, 61.9, 25.10, 32.1, 12.52, 23.5, 15.24, 10.25, 100.26, 85.27, 22.38, 12.19, 15.70};
        double ingresoTotal = calculorIngresosMensuales(ventas);
        System.out.println("El monto total ingresado en el mes fue de: " + ingresoTotal);
    }
    public static double calculorIngresosMensuales(double [] ventas) {
        double ingresosMensuales= 0;
        for (double venta : ventas) {
            ingresosMensuales+= venta;
        }
        return ingresosMensuales;
    }
}