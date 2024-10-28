package Funciones;
/* Ejercicio 6: Cálculo de impuestos*/


public class calculoImpuestos {
    public static void main(String[] args) {
        double[] facturas = {140, 327, 4830, 23.43, 124.23, 3453.05};
        calcularImpuesto(facturas);

    }

    public static void calcularImpuesto(double[] facturas) {
        double impuesto = 0.21;
        for (int i = 0; i<= facturas.length ; i++) {
            double total_con_impuesto = (facturas[i]*impuesto)+facturas[i];
            System.out.println("Se ha aplicado el 21% sobre la factura, el total es: " + total_con_impuesto);
        }
    }
}