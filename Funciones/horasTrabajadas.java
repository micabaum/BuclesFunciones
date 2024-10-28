package Funciones;
/*Ejercicio 8: Control de horas trabajadas*/

public class horasTrabajadas {
    public static void main(String[]args){
        String[] empleados = {"María", "Juan", "Sofía", "Rosario", "Camila", "Andrés", "Pablo", "Victor"};
        int [] horasTrabajadas = {12, 5, 3, 6, 6, 8, 8, 10};
        calcularPagoSemanal (empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[]empleados, int[]horasTrabajadas){
        int valorHora = 15;
        for(int i=0; i<empleados.length;i++){
            for(i=0; i<horasTrabajadas.length;i++){
                int salarioSemanal = horasTrabajadas[i] * valorHora;

                System.out.println("El salario de semanal de " + empleados[i] + " es de $ " + salarioSemanal);

            }
        }
    }
}
