/*
 * ============================================================
 * ARCHIVO: Matriz.java
 * CLASE: Matriz
 * DESCRIPCIÓN: Clase hija de Arreglo
 * ============================================================
 */

public class Matriz extends Arreglo {

    /*
     * Arreglo de dos dimensiones.
     */
    private int[][] objDatos;


    // ============================================================
    // MÉTODO crear
    // Crea la matriz con filas y columnas.
    // ============================================================

    public void crear(int filas, int columnas) {

        objDatos = new int[filas][columnas];

        System.out.println(
            "-> Se creó una matriz de "
            + filas
            + " x "
            + columnas
            + "."
        );

    } // Fin del método crear


    // ============================================================
    // MÉTODO ingresarDatos
    // Solicita los datos de la matriz.
    // ============================================================

    public void ingresarDatos() {

        for (int fila = 0; fila < objDatos.length; fila++) {

            for (
                int columna = 0;
                columna < objDatos[fila].length;
                columna++
            ) {

                System.out.print(
                    "Ingrese valor para ["
                    + fila
                    + "]["
                    + columna
                    + "]: "
                );

                objDatos[fila][columna] =
                    objLector.nextInt();

            } // Fin del for columna

        } // Fin del for fila

    } // Fin del método ingresarDatos


    // ============================================================
    // MÉTODO mostrar
    // Muestra todos los datos de la matriz.
    // ============================================================

    public void mostrar() {

        System.out.println(
            "\n--- MATRIZ COMPLETA ---"
        );

        for (int fila = 0; fila < objDatos.length; fila++) {

            for (
                int columna = 0;
                columna < objDatos[fila].length;
                columna++
            ) {

                System.out.print(
                    objDatos[fila][columna]
                    + "\t"
                );

            } // Fin del for columna

            System.out.println();

        } // Fin del for fila

    } // Fin del método mostrar


} // Fin de la clase Matriz

