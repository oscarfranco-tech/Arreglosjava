/**
 * ENUNCIADO DEL PROGRAMA:
 * Crear un sistema en Java que gestione estructuras de datos (Vectores y Matrices) 
 * utilizando Herencia. Se debe implementar:
 * 1. Clase Arreglo (Padre) con lector de datos.
 * 2. Clase Vector (Hija) con métodos para crear, llenar, mostrar, búsqueda secuencial, 
 * inserción al final y borrado por índice.
 * 3. Clase Matriz (Hija) con métodos para crear, llenar y mostrar en formato 2D.
 * 4. Un menú principal interactivo para el usuario.
 */

import java.util.Scanner; // Importamos la librería para capturar datos desde el teclado

// ==========================================
// CLASE PADRE: Arreglo
// ==========================================
class Arreglo {
    // Definimos un Scanner protegido (protected) para que las clases hijas lo hereden
    // Le ponemos prefijo 'obj' porque el Scanner es un Objeto complejo
    // 'static' significa que existe UNA SOLA copia compartida por todo el programa.
    // Es indispensable: si cada objeto creara su propio Scanner sobre el teclado,
    // cada uno guardaría su propio búfer y se perderían los datos ingresados.
    protected static Scanner objSc = new Scanner(System.in);
} // Fin de la clase Arreglo

// ==========================================
// CLASE HIJA: Vector (Hereda de Arreglo)
// ==========================================
class Vector extends Arreglo {
    // Atributo privado: un arreglo de enteros. (Aún no tiene tamaño definido)
    private int[] datos;

    // MÉTODO: Define cuántos espacios de memoria tendrá el vector
    public void crear(int tamano) {
        // El comando 'new' reserva el espacio real en la memoria RAM
        datos = new int[tamano]; 
        System.out.println("-> Memoria reservada para " + tamano + " elementos.");
    } // Fin del método crear

    // MÉTODO: Pide al usuario los números para llenar cada cajón del vector
    public void ingresarDatos() {
        // Ciclo 'for' que recorre desde el índice 0 hasta el final del arreglo
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Ingrese valor para posición [" + i + "]: ");
            // Usamos el objeto objSc (heredado del padre) para leer el entero
            datos[i] = objSc.nextInt(); 
        } // Fin del ciclo for
    } // Fin del método ingresarDatos

    // MÉTODO: Búsqueda Secuencial (Revisa uno por uno hasta encontrar el dato)
    public void buscar(int valorBuscado) {
        // Variable booleana 'bandera' para marcar si lo encontramos
        boolean encontrado = false; 

        for (int i = 0; i < datos.length; i++) {
            // Comparamos el contenido de la posición actual 'i' con lo que buscamos
            if (datos[i] == valorBuscado) {
                System.out.println("¡Lo encontré! El dato " + valorBuscado + " está en el índice " + i);
                encontrado = true; // Cambiamos el estado a verdadero
                break; // Detenemos el ciclo for inmediatamente (optimización)
            } // Fin del if
        } // Fin del for

        // Si al terminar el ciclo la bandera sigue en falso, el dato no existe
        if (encontrado == false) {
            System.out.println("El dato " + valorBuscado + " no existe en este vector.");
        } // Fin del if de control
    } // Fin del método buscar

    // MÉTODO: Insertar al final
    // (En Java los arreglos son fijos, para "crecer" hay que crear uno nuevo y mudar todo)
    public void insertarUltimo(int nuevoDato) {
        // 1. Creamos un arreglo 'temporal' con un espacio extra (+1)
        int[] temporal = new int[datos.length + 1];

        // 2. Ciclo para copiar los datos del vector viejo al nuevo arreglo temporal
        for (int i = 0; i < datos.length; i++) {
            temporal[i] = datos[i];
        } // Fin del copiado

        // 3. Colocamos el nuevo dato en la última posición recién creada
        temporal[temporal.length - 1] = nuevoDato;

        // 4. Decimos que nuestro arreglo original 'datos' ahora es el 'temporal'
        datos = temporal;
        System.out.println("-> Dato insertado con éxito al final.");
    } // Fin del método insertarUltimo

    // MÉTODO: Borrar un dato por su índice (posición)
    public void borrar(int indiceABorrar) {
        // Validamos que el índice esté dentro del rango (no negativo y menor al tamaño)
        if (indiceABorrar < 0 || indiceABorrar >= datos.length) {
            System.out.println("Error: Esa posición no existe.");
        } else {
            // 1. Creamos un arreglo nuevo con un espacio menos (-1)
            int[] nuevoArreglo = new int[datos.length - 1];

            // 2. Usamos un contador 'j' para controlar la posición en el nuevo arreglo
            int j = 0; 
            for (int i = 0; i < datos.length; i++) {
                // Si el índice actual 'i' NO es el que queremos borrar, lo movemos al nuevo
                if (i != indiceABorrar) {
                    nuevoArreglo[j] = datos[i];
                    j++; // Solo avanzamos el índice del nuevo arreglo si copiamos algo
                } // Fin del if de exclusión
            } // Fin del for de copiado

            // 3. Reemplazamos el arreglo original con el nuevo ya reducido
            datos = nuevoArreglo;
            System.out.println("-> El dato en la posición " + indiceABorrar + " ha sido eliminado.");
        } // Fin del else de validación
    } // Fin del método borrar

    // MÉTODO: Imprimir el vector completo en pantalla
    public void mostrar() {
        System.out.print("VECTOR ACTUAL: [ ");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " "); // Imprime el número y un espacio a la derecha
        } // Fin del for
        System.out.println("]"); // Cierre visual decorativo
    } // Fin del método mostrar
} // Fin de la clase Vector

// ==========================================
// CLASE HIJA: Matriz (Hereda de Arreglo)
// ==========================================
class Matriz extends Arreglo {
    // Declaración de arreglo bidimensional (doble corchete: filas y columnas)
    private int[][] tabla;

    // MÉTODO: Define las dimensiones de la cuadrícula
    public void crear(int filas, int columnas) {
        // Reservamos el espacio en memoria para la matriz
        tabla = new int[filas][columnas];
        System.out.println("-> Matriz de " + filas + "x" + columnas + " lista.");
    } // Fin del método crear

    // MÉTODO: Llena la matriz recorriendo fila por fila y columna por columna
    public void ingresarDatos() {
        // El primer ciclo (f) recorre las FILAS (horizontales)
        for (int f = 0; f < tabla.length; f++) {
            // El segundo ciclo (c) recorre las COLUMNAS (verticales) de cada fila
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print("Dato en Fila:" + f + " Columna:" + c + " -> ");
                // Guardamos el entero en la coordenada exacta [f][c]
                tabla[f][c] = objSc.nextInt(); 
            } // Fin del for de columnas
        } // Fin del for de filas
    } // Fin del método ingresarDatos

    // MÉTODO: Muestra la matriz en pantalla con formato de tabla
    public void mostrar() {
        System.out.println("MATRIZ ACTUAL:");
        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                // Usamos '\t' (Tabulador) para que los números queden alineados en columnas
                System.out.print(tabla[f][c] + "\t");
            } // Fin del for de columnas
            System.out.println(); // Salto de línea obligatorio al terminar cada fila
        } // Fin del for de filas
    } // Fin del método mostrar
} // Fin de la clase Matriz

// ==========================================
// CLASE PRINCIPAL: Arreglos
// IMPORTANTE: el nombre de esta clase DEBE ser igual al nombre del archivo
// (Arreglos.java), de lo contrario Java no compila.
// ==========================================
public class Arreglos {
    public static void main(String[] args) {
        // Reutilizamos el MISMO Scanner declarado en la clase padre.
        // OJO: no se crea uno nuevo con 'new Scanner(System.in)'. Si hubiera dos
        // Scanner leyendo el teclado, uno se quedaría con los datos del otro.
        Scanner objTeclado = Arreglo.objSc;

        // INSTANCIAMOS (creamos) los objetos de nuestras clases hijas
        Vector objVector = new Vector();
        Matriz objMatriz = new Matriz();

        int opcionSeleccionada = 0; // Variable para almacenar la opción del menú

        // Ciclo 'do-while' para repetir el menú hasta que el usuario elija Salir (7)
        do {
            System.out.println("\n========= MENÚ DE ARREGLOS (HERENCIA) =========");
            System.out.println("1. Llenar Vector (Definir tamaño e ingresar)");
            System.out.println("2. Buscar un número en el Vector");
            System.out.println("3. Agregar número al FINAL (Crecer)");
            System.out.println("4. Eliminar número por POSICIÓN (Reducir)");
            System.out.println("5. Mostrar el Vector completo");
            System.out.println("6. Crear y mostrar una Matriz (2D)");
            System.out.println("7. Salir");
            System.out.print("Elija su opción: ");

            // Capturamos la opción elegida
            opcionSeleccionada = objTeclado.nextInt(); 

            // Estructura 'switch' para ejecutar el código según la opción
            switch (opcionSeleccionada) {
                case 1:
                    System.out.print("¿De qué tamaño quiere el vector?: ");
                    int t = objTeclado.nextInt();
                    objVector.crear(t); // Inicializa memoria
                    objVector.ingresarDatos(); // Pide datos
                    break; // Sale del switch
                case 2:
                    System.out.print("Número que desea localizar: ");
                    int b = objTeclado.nextInt();
                    objVector.buscar(b); // Ejecuta búsqueda secuencial
                    break;
                case 3:
                    System.out.print("Ingrese el nuevo número para el final: ");
                    int n = objTeclado.nextInt();
                    objVector.insertarUltimo(n); // Ejecuta lógica de crecimiento
                    break;
                case 4:
                    System.out.print("¿Qué índice desea eliminar?: ");
                    int p = objTeclado.nextInt();
                    objVector.borrar(p); // Ejecuta lógica de borrado y reducción
                    break;
                case 5:
                    objVector.mostrar(); // Imprime la lista
                    break;
                case 6:
                    System.out.print("¿Cuántas filas?: ");
                    int fil = objTeclado.nextInt();
                    System.out.print("¿Cuántas columnas?: ");
                    int col = objTeclado.nextInt();
                    objMatriz.crear(fil, col); // Inicializa matriz
                    objMatriz.ingresarDatos(); // Llena cuadrícula
                    objMatriz.mostrar(); // Imprime tabla
                    break;
                case 7:
                    System.out.println("Finalizando programa. ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Error: Opción no válida, intente de nuevo.");
            } // Fin del switch

        } while (opcionSeleccionada != 7); // Condición de salida: mientras no sea 7

        objTeclado.close(); // Cerramos el objeto teclado por buena práctica
    } // Fin del método main (Punto de entrada)
} // Fin de la clase Arreglos (Punto de cierre)
