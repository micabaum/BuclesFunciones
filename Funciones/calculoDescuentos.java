package Funciones;
/* Ejercicio 4: Cálculo de descuentos para fidelización*/


public class calculoDescuentos {
    public static void main(String[] args) {
        String[] clientes = {"María", "Juan", "Sofía", "Andrés", "Rocío"};
        double[] compras = {11, 27, 2, 15, 30};
        calculoDescuentos(clientes, compras);
    }

    public static void calculoDescuentos(String[] clientes, double[] compras) {
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println("Aplicar descuento del 10% a: " + clientes[i]);

            }
        }
    }
}

