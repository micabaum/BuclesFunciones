package Funciones;
/*Ejercicio 3: Gestión de clientes*/

public class gestionClientes {
public static void main(String[] args) {
    String[] clientes = {"María", "Juan", "Sofía", "Andrés", "Rocío"};
    double[] facturasPendientes = {550, 700, 200, 1000, 300};
            enviarFacturas(clientes, facturasPendientes);
        }

        public static void enviarFacturas(String[] clientes, double[] facturas) {
            for (int i = 0; i < clientes.length; i++) {
                if (facturas[i] > 500) {
                    System.out.println("Enviar factura a: " + clientes[i]);
                }
            }
        }
    }


