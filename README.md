# Evidencia de Aprendizaje - Manejo de Vectores en Java

## 1. Objetivo

Crear un Vector de Números Enteros:

Escribir un programa que cree un vector de 15 números enteros.
Que solicite al usuario que ingrese los valores para llenar el vector con números entre 10 y 100, si el número esta fuera de este rango debe mostrar que esta fuera del rango y volver a solicitar el numero hasta que se llene el vector.
Cuando esté lleno el Vector muestra los valores en la consola.
Buscar un Valor en el Vector:
Solicita al usuario que ingrese un número para buscar en el vector.
sa un ciclo para buscar el número en el vector.
Si el número se encuentra, muestra la posición en la que se encuentra.
Si el número no se encuentra, muestra un mensaje indicando que no está en el vector.
Determinar el Mayor y el Menor Valor dentro del vector:
Utiliza un ciclo para recorrer el vector y determinar cuál es el número mayor y cuál es el menor, podrías usar el mismo ciclo que busca el número del punto anterior para determinar esto.
Muestra el número mayor y el número menor en la consola.
Identificar Múltiplos de un Número:
Solicita al usuario que ingrese un número X.
Usa un ciclo para identificar y mostrar todos los elementos del vector que son múltiplos de X.
Si no hay múltiplos, muestra un mensaje indicando que no hay múltiplos de X en el vector.
Calcular la Suma de Todos los Valores:
Usa un ciclo para calcular la suma de todos los números en el vector.
Muestra la suma total en la consola.
Crear un Nuevo Vector con Números por Encima del Promedio:
Calcula el promedio de los valores del vector.
Crea un nuevo vector que contenga solo los números del vector original que son mayores que el promedio.
Muestra los valores de este nuevo vector en la consola e indica cuantos números están por encima del promedio.
Si no hay números mayores que el promedio, muestra un mensaje indicando esto.

---

## 2. Organización del proyecto

Utilicé la carpeta de las clases sincrónicas para usarlas como base para el proyecto y como se puede ver estan ordenadas de esta manera:


src/
 ── Arreglo.java
 ── Vector.java
 ── Matriz.java
 ── Principal.java


### Arreglo.java

Es la clase padre del proyecto. Contiene el objeto `Scanner`, utilizado para realizar la entrada de datos desde la consola.Las clases hijas podran usar `Scanner`sin escribir mas código innecesario.

### Vector.java

Es una clase hija de `Arreglo` y contiene las principales operaciones realizadas sobre el vector.

Entre sus funcionalidades se encuentran:

* Crear el vector.
* Ingresar los 15 valores.
* Validar que los números estén entre 10 y 100.
* Mostrar el vector completo.
* Buscar un número.
* Determinar el número mayor.
* Determinar el número menor.
* Identificar múltiplos de un número.
* Calcular la suma.
* Calcular el promedio.
* Crear un nuevo vector con los valores superiores al promedio.

### Matriz.java

Es una clase hija de `Arreglo` que permite trabajar con filas y columnas para almacenar los datos 

### Principal.java

Contiene el menú principal que permitirá que el usuario pueda acceder a las opciones para hacer las diferentes operaciones con vectores

---

## 3. Funcionalidades del programa

El programa cuenta con las siguientes opciones:

### 1. Crear y llenar Vector de 15 números

Permite crear un vector de 15 posiciones y solicitar al usuario los valores.

Los números deben estar dentro del rango de 10 a 100.

Si se introduce un número fuera del rango, el programa muestra un mensaje y vuelve a solicitar el valor.

### 2. Ver vector completo

Permite visualizar todos los valores almacenados en el vector.

Ejemplo:


VECTOR COMPLETO: [10 25 30 45 50 60 70 75 80 85 90 95 20 35 40]


### 3. Buscar un número

Permite ingresar un número y buscarlo dentro del vector.

Si el número se encuentra, se muestra la posición en la que está almacenado.

Si no se encuentra, se muestra un mensaje indicando que no está en el vector.

### 4. Mostrar número mayor y menor

Recorre el vector para determinar cuál es el valor mayor y cuál es el valor menor.

### 5. Mostrar múltiplos de X

Permite ingresar un número `X` y buscar dentro del vector todos los elementos que sean múltiplos de dicho número.

### 6. Calcular suma de los valores

Recorre el vector y acumula todos sus valores para obtener la suma total.

### 7. Mostrar valores por encima del promedio

Calcula el promedio de los elementos del vector y crea un nuevo vector que contiene únicamente los valores superiores a dicho promedio.

También muestra la cantidad de números que se encuentran por encima del promedio.

### 8. Salir

Finaliza la ejecución del programa.

---


## 4. Capturas de pantalla

### Menú principal


### Vector completo


### Búsqueda de un número


### Número mayor y menor


### Múltiplos de X


### Suma de los valores


### Valores por encima del promedio


---

## 5. Video de sustentación

En el siguiente enlace se encuentra el video de sustentación individual del proyecto:

**https://drive.google.com/file/d/1mwYdb0uA3t74xRMRfKKTqY6chZmT_zVx/view?usp=drive_link**

---

## 6. Repositorio

El código fuente del proyecto se encuentra disponible en el siguiente repositorio público de GitHub:

**https://github.com/oscarfranco-tech/Arreglosjava.git**

---

## 7. Autor

**Nombre:** Oscar Humberto Franco Montealegre

**Programa:** estructura de datos

**Evidencia de aprendizaje:** Manejo de vectores en Java
