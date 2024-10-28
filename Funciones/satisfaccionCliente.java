package Funciones;
/* Ejercicio 5: Promedio de satisfacción del cliente
Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.

**Instrucciones**:
- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.
*/

public class satisfaccionCliente {
    public static void main (String[]args){
        int [] calificaciones = {1, 4, 5, 3, 3, 3, 1};
        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción es " + promedio);

    }
    public static double calcularPromedioSatisfaccion(int[] calificaciones){
        int total = 0;
        for (int calificacion : calificaciones) {
            total += calificacion;
        }
        double promedio = total/calificaciones.length;
        return promedio;
    }
}


