# Evidencia de Aprendizaje - Manejo de Vectores en Java

## 1. Objetivo

Desarrollar un programa en Java que permita crear y manipular un vector de 15 números enteros, aplicando conceptos de programación como arreglos, ciclos, condicionales, métodos, herencia y entrada de datos mediante `Scanner`.

El programa permite ingresar valores entre 10 y 100 y realizar diferentes operaciones sobre los datos almacenados en el vector.

---

## 2. Organización del proyecto

El proyecto está organizado en cuatro clases:


src/
 ── Arreglo.java
 ── Vector.java
 ── Matriz.java
 ── Principal.java


### Arreglo.java

Es la clase padre del proyecto. Contiene el objeto `Scanner`, utilizado para realizar la entrada de datos desde la consola.

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

Es una clase hija de `Arreglo` que permite trabajar con arreglos bidimensionales.

Esta clase se conserva como parte de la estructura trabajada durante el curso, aunque no se utiliza en el menú de esta actividad debido a que los requerimientos están enfocados en el manejo de vectores.

### Principal.java

Contiene el método `main` y el menú principal del programa.

Desde esta clase el usuario puede seleccionar las diferentes operaciones disponibles para trabajar con el vector.

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

## 4. Conceptos de programación utilizados

Durante el desarrollo del proyecto se aplicaron los siguientes conceptos:

* Clases y objetos.
* Herencia mediante `extends`.
* Clase padre y clases hijas.
* Arreglos unidimensionales.
* Arreglos bidimensionales.
* Ciclo `for`.
* Ciclo `do while`.
* Condicionales `if`.
* Variables y tipos de datos.
* Métodos.
* Retorno de valores.
* Operador módulo `%`.
* Entrada de datos mediante `Scanner`.

---

## 5. Capturas de pantalla

### Menú principal

![Menú principal](capturas/menu.png)

### Vector completo

![Vector completo](capturas/vector-completo.png)

### Búsqueda de un número

![Búsqueda de un número](capturas/busqueda.png)

### Número mayor y menor

![Mayor y menor](capturas/mayor-menor.png)

### Múltiplos de X

![Múltiplos](capturas/multiplos.png)

### Suma de los valores

![Suma](capturas/suma.png)

### Valores por encima del promedio

![Promedio](capturas/promedio.png)

---

## 6. Video de sustentación

En el siguiente enlace se encuentra el video de sustentación individual del proyecto:

**[Ver video de sustentación](PEGAR_AQUI_EL_ENLACE_DEL_VIDEO)**

---

## 7. Repositorio

El código fuente del proyecto se encuentra disponible en el siguiente repositorio público de GitHub:

**[Ver repositorio en GitHub](PEGAR_AQUI_EL_ENLACE_DEL_REPOSITORIO)**

---

## 8. Autor

**Nombre:** Oscar Humberto Franco Montealegre

**Programa:** estructura de datos


**Evidencia de aprendizaje:** Manejo de vectores en Java
