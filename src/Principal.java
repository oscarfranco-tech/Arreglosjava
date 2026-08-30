/*
 * ============================================================
 * ARCHIVO: Principal.java
 * CLASE: Principal
 * DESCRIPCIÓN: Contiene el main y el menú principal.
 * ============================================================
 *
 * ORGANIZACIÓN DEL PROYECTO:
 *
 *      Arreglo.java   -> Clase padre
 *      Vector.java    -> Clase hija
 *      Matriz.java    -> Clase hija
 *      Principal.java -> Main y menú
 *
 * ============================================================
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] objArgs) {

        /*
         * Utilizamos explícitamente Scanner.
         *
         * El Scanner se encuentra declarado en la clase padre
         * Arreglo y es accesible debido a que es protected static.
         */
        Scanner objLector = Arreglo.objLector;


        /*
         * Creamos el objeto Vector.
         */
        Vector objVector = new Vector();


        /*
         * Variable para controlar el menú.
         */
        int opcionSeleccionada = 0;


        /*
         * Variable que permite saber si el vector
         * ya fue creado y llenado.
         */
        boolean vectorCreado = false;


        // ========================================================
        // MENÚ PRINCIPAL
        // ========================================================

        do {

            System.out.println();
            System.out.println(
                "================================================"
            );
            System.out.println(
                "          MENÚ PRINCIPAL - VECTORES"
            );
            System.out.println(
                "================================================"
            );

            System.out.println(
                "1. Crear y llenar Vector de 15 números"
            );

            System.out.println(
                "2. Ver vector completo"
            );

            System.out.println(
                "3. Buscar un número en el Vector"
            );

            System.out.println(
                "4. Mostrar número mayor y menor"
            );

            System.out.println(
                "5. Mostrar múltiplos de X"
            );

            System.out.println(
                "6. Calcular suma de los valores"
            );

            System.out.println(
                "7. Mostrar valores por encima del promedio"
            );

            System.out.println(
                "8. Salir"
            );

            System.out.println(
                "================================================"
            );

            System.out.print(
                "Seleccione una opción: "
            );

            opcionSeleccionada =
                objLector.nextInt();


            // ====================================================
            // SWITCH DEL MENÚ
            // ====================================================

            switch (opcionSeleccionada) {


                // =================================================
                // OPCIÓN 1
                // Crear y llenar el vector
                // =================================================

                case 1:

                    System.out.println();
                    System.out.println(
                        "--- CREAR Y LLENAR VECTOR ---"
                    );

                    objVector.crear(15);

                    objVector.ingresarDatos();

                    System.out.println();
                    System.out.println(
                        "El vector fue llenado correctamente."
                    );

                    objVector.mostrar();

                    vectorCreado = true;

                    break;


                // =================================================
                // OPCIÓN 2
                // Ver vector completo
                // =================================================

                case 2:

                    System.out.println();
                    System.out.println(
                        "--- VER VECTOR COMPLETO ---"
                    );

                    if (vectorCreado == false) {

                        System.out.println(
                            "Primero debe crear y llenar el vector."
                        );

                    } else {

                        objVector.mostrar();

                    }

                    break;


                // =================================================
                // OPCIÓN 3
                // Buscar un número
                // =================================================

                case 3:

                    System.out.println();
                    System.out.println(
                        "--- BUSCAR UN NÚMERO ---"
                    );

                    if (vectorCreado == false) {

                        System.out.println(
                            "Primero debe crear y llenar el vector."
                        );

                    } else {

                        System.out.print(
                            "Ingrese el número que desea buscar: "
                        );

                        int valorBuscado =
                            objLector.nextInt();

                        objVector.buscar(
                            valorBuscado
                        );
                    }

                    break;


                // =================================================
                // OPCIÓN 4
                // Mayor y menor
                // =================================================

                case 4:

                    System.out.println();
                    System.out.println(
                        "--- MAYOR Y MENOR VALOR ---"
                    );

                    if (vectorCreado == false) {

                        System.out.println(
                            "Primero debe crear y llenar el vector."
                        );

                    } else {

                        int mayor =
                            objVector.mayor();

                        int menor =
                            objVector.menor();

                        System.out.println(
                            "El número mayor es: "
                            + mayor
                        );

                        System.out.println(
                            "El número menor es: "
                            + menor
                        );
                    }

                    break;


                // =================================================
                // OPCIÓN 5
                // Múltiplos
                // =================================================

                case 5:

                    System.out.println();
                    System.out.println(
                        "--- MÚLTIPLOS DE X ---"
                    );

                    if (vectorCreado == false) {

                        System.out.println(
                            "Primero debe crear y llenar el vector."
                        );

                    } else {

                        System.out.print(
                            "Ingrese el número X: "
                        );

                        int numeroX =
                            objLector.nextInt();

                        objVector.mostrarMultiplos(
                            numeroX
                        );
                    }

                    break;


                // =================================================
                // OPCIÓN 6
                // Suma
                // =================================================

                case 6:

                    System.out.println();
                    System.out.println(
                        "--- SUMA DE LOS VALORES ---"
                    );

                    if (vectorCreado == false) {

                        System.out.println(
                            "Primero debe crear y llenar el vector."
                        );

                    } else {

                        int suma =
                            objVector.suma();

                        System.out.println(
                            "La suma total de los valores es: "
                            + suma
                        );
                    }

                    break;


                // =================================================
                // OPCIÓN 7
                // Valores por encima del promedio
                // =================================================

                case 7:

                    System.out.println();
                    System.out.println(
                        "--- VALORES POR ENCIMA DEL PROMEDIO ---"
                    );

                    if (vectorCreado == false) {

                        System.out.println(
                            "Primero debe crear y llenar el vector."
                        );

                    } else {

                        /*
                         * Calculamos el promedio.
                         */
                        double promedio =
                            objVector.promedio();

                        System.out.println(
                            "El promedio del vector es: "
                            + promedio
                        );


                        /*
                         * Creamos el nuevo vector con los valores
                         * que están por encima del promedio.
                         */
                        Vector objVectorMayores =
                            objVector.crearVectorSobrePromedio();


                        /*
                         * Verificamos si existen elementos
                         * superiores al promedio.
                         */
                        if (
                            objVectorMayores.cantidadElementos()
                            == 0
                        ) {

                            System.out.println(
                                "No hay números mayores "
                                + "que el promedio."
                            );

                        } else {

                            System.out.println(
                                "Los números que están "
                                + "por encima del promedio son:"
                            );

                            objVectorMayores.mostrar();

                            System.out.println(
                                "Cantidad de números por "
                                + "encima del promedio: "
                                + objVectorMayores.cantidadElementos()
                            );
                        }
                    }

                    break;


                // =================================================
                // OPCIÓN 8
                // Salir
                // =================================================

                case 8:

                    System.out.println();
                    System.out.println(
                        "Programa finalizado."
                    );

                    System.out.println(
                        "Gracias por utilizar el programa."
                    );

                    break;


                // =================================================
                // OPCIÓN NO VÁLIDA
                // =================================================

                default:

                    System.out.println();
                    System.out.println(
                        "Opción no válida."
                    );

                    System.out.println(
                        "Por favor, seleccione una opción "
                        + "del menú."
                    );

                    break;

            } // Fin del switch


        } while (opcionSeleccionada != 8);


        /*
         * Cerramos el Scanner al finalizar el programa.
         */
        objLector.close();

    } // Fin del método main

} // Fin de la clase Principal

