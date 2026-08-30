/*
 * ============================================================
 * ARCHIVO: Vector.java
 * CLASE: Vector
 * DESCRIPCIÓN: Clase hija de Arreglo
 * ============================================================
 *
 * Esta clase contiene las operaciones necesarias para trabajar
 * con un vector de números enteros.
 *
 * PUNTOS DE LA ACTIVIDAD:
 *
 * 1. Crear y llenar vector
 * 2. Buscar un valor
 * 3. Encontrar mayor y menor
 * 4. Encontrar múltiplos
 * 5. Calcular suma
 * 6. Crear vector con valores sobre el promedio
 * ============================================================
 */

public class Vector extends Arreglo {

    /*
     * Arreglo donde se almacenan los datos.
     */
    private int[] objDatos;


    // ============================================================
    // MÉTODO crear
    // Crea el arreglo con el tamaño indicado.
    // ============================================================

    public void crear(int tamano) {

        objDatos = new int[tamano];

        System.out.println(
            "-> Se creó un vector de "
            + tamano
            + " posiciones."
        );

    } // Fin del método crear


    // ============================================================
    // MÉTODO ingresarDatos
    // Solicita los números al usuario.
    //
    // Los valores deben estar entre 10 y 100.
    // ============================================================

    public void ingresarDatos() {

        for (int i = 0; i < objDatos.length; i++) {

            int numero;

            /*
             * Se utiliza do-while para volver a solicitar
             * el número cuando está fuera del rango.
             */
            do {

                System.out.print(
                    "Ingrese valor para la posición ["
                    + i
                    + "] entre 10 y 100: "
                );

                numero = objLector.nextInt();

                if (numero < 10 || numero > 100) {

                    System.out.println(
                        "El número está fuera del rango."
                    );

                    System.out.println(
                        "Debe ingresar un número entre 10 y 100."
                    );
                }

            } while (numero < 10 || numero > 100);

            /*
             * Guardamos el número en el vector.
             */
            objDatos[i] = numero;

        } // Fin del for

    } // Fin del método ingresarDatos


    // ============================================================
    // MÉTODO mostrar
    // Muestra todos los datos del vector en una sola línea.
    // ============================================================

    public void mostrar() {

        System.out.print(
            "VECTOR COMPLETO : ["
        );

        for (int i = 0; i < objDatos.length; i++) {

            System.out.print(
                objDatos[i]
            );

            if (i < objDatos.length - 1) {

                System.out.print(" ");
            }

        } // Fin del for

        System.out.println("]");

    } // Fin del método mostrar


    // ============================================================
    // MÉTODO buscar
    // Busca un número dentro del vector.
    // ============================================================

    public void buscar(int valorBuscado) {

        boolean encontrado = false;

        for (int i = 0; i < objDatos.length; i++) {

            if (objDatos[i] == valorBuscado) {

                System.out.println(
                    "El número "
                    + valorBuscado
                    + " se encuentra en la posición ["
                    + i
                    + "]."
                );

                encontrado = true;
            }

        } // Fin del for

        if (encontrado == false) {

            System.out.println(
                "El número "
                + valorBuscado
                + " no se encuentra en el vector."
            );
        }

    } // Fin del método buscar


    // ============================================================
    // MÉTODO mayor
    // Encuentra el número mayor del vector.
    // ============================================================

    public int mayor() {

        int mayor = objDatos[0];

        for (int i = 1; i < objDatos.length; i++) {

            if (objDatos[i] > mayor) {

                mayor = objDatos[i];
            }

        } // Fin del for

        return mayor;

    } // Fin del método mayor


    // ============================================================
    // MÉTODO menor
    // Encuentra el número menor del vector.
    // ============================================================

    public int menor() {

        int menor = objDatos[0];

        for (int i = 1; i < objDatos.length; i++) {

            if (objDatos[i] < menor) {

                menor = objDatos[i];
            }

        } // Fin del for

        return menor;

    } // Fin del método menor


    // ============================================================
    // MÉTODO mostrarMultiplos
    // Muestra los elementos que son múltiplos de X.
    // ============================================================

    public void mostrarMultiplos(int numeroX) {

        /*
         * Validamos que X no sea cero.
         */
        if (numeroX == 0) {

            System.out.println(
                "No se pueden buscar múltiplos de 0."
            );

            return;
        }

        boolean hayMultiplos = false;

        System.out.println(
            "\nMúltiplos de "
            + numeroX
            + ":"
        );

        for (int i = 0; i < objDatos.length; i++) {

            /*
             * Si el residuo es cero, es múltiplo.
             */
            if (objDatos[i] % numeroX == 0) {

                System.out.println(
                    "Posición ["
                    + i
                    + "] = "
                    + objDatos[i]
                );

                hayMultiplos = true;
            }

        } // Fin del for

        if (hayMultiplos == false) {

            System.out.println(
                "No hay múltiplos de "
                + numeroX
                + " en el vector."
            );
        }

    } // Fin del método mostrarMultiplos


    // ============================================================
    // MÉTODO suma
    // Calcula la suma de todos los valores.
    // ============================================================

    public int suma() {

        int suma = 0;

        for (int i = 0; i < objDatos.length; i++) {

            suma = suma + objDatos[i];

        } // Fin del for

        return suma;

    } // Fin del método suma


    // ============================================================
    // MÉTODO promedio
    // Calcula el promedio de los elementos.
    // ============================================================

    public double promedio() {

        double promedio;

        promedio =
            (double) suma() / objDatos.length;

        return promedio;

    } // Fin del método promedio


    // ============================================================
    // MÉTODO crearVectorSobrePromedio
    //
    // Crea un nuevo vector con los valores que son mayores
    // que el promedio.
    // ============================================================

    public Vector crearVectorSobrePromedio() {

        /*
         * Calculamos el promedio.
         */
        double promedio = promedio();

        /*
         * Contamos cuántos valores están por encima
         * del promedio.
         */
        int cantidadMayores = 0;

        for (int i = 0; i < objDatos.length; i++) {

            if (objDatos[i] > promedio) {

                cantidadMayores++;
            }

        } // Fin del for


        /*
         * Creamos un nuevo objeto Vector.
         */
        Vector objNuevoVector = new Vector();


        /*
         * Creamos el arreglo con el tamaño exacto
         * de los valores encontrados.
         */
        objNuevoVector.crear(cantidadMayores);


        /*
         * Variable para controlar la posición
         * del nuevo vector.
         */
        int posicion = 0;


        /*
         * Recorremos nuevamente el vector original.
         */
        for (int i = 0; i < objDatos.length; i++) {

            if (objDatos[i] > promedio) {

                objNuevoVector.asignar(
                    posicion,
                    objDatos[i]
                );

                posicion++;
            }

        } // Fin del for

        return objNuevoVector;

    } // Fin del método crearVectorSobrePromedio


    // ============================================================
    // MÉTODO asignar
    // Permite almacenar un valor en una posición.
    // ============================================================

    public void asignar(int posicion, int valor) {

        objDatos[posicion] = valor;

    } // Fin del método asignar


    // ============================================================
    // MÉTODO cantidadElementos
    // Retorna la cantidad de elementos del vector.
    // ============================================================

    public int cantidadElementos() {

        return objDatos.length;

    } // Fin del método cantidadElementos


} // Fin de la clase Vector

