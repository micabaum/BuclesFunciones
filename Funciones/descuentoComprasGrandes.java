package Funciones;
/* Ejercicio 7: Descuento por compras grandes*/

public class descuentoComprasGrandes{
    public static void main (String[]args){
        double [] compras = {1500.34, 145.20, 48920, 432.45, 789.45, 1475, 345.78, 1327.55, 4340, 2345};
        aplicarDescuento(compras);
    }

public static void aplicarDescuento(double[]compras){
        double descuento = 0.15;
        for (int i = 0; i < compras.length; i++){
            if (compras[i]>500){
               double totalConDescuento = compras[i] * (1-descuento);
                System.out.println("El total con el 15% de descuento es: $ " + totalConDescuento);

            }
        }
}
}
