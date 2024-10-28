package Funciones;
/* Ejercicio 9: Calcular el precio final con descuentos*/

public class precioFinal {
    public static void main (String[]args){
        double [] preciosOriginales = {1500, 3000, 15350, 327, 2300};
        calcularPrecioFinal(preciosOriginales);
    }
    public static void calcularPrecioFinal(double[]preciosOriginales){
        double descuento = 0.10;
        for (int i=0; i<preciosOriginales.length;i++) {
            double totalFinal = preciosOriginales[i] * (1-descuento);
            System.out.println("El precio del producto " + i + " con descuento es de: $ "+totalFinal);
        }
    }
}
