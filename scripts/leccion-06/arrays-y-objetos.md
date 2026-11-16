# Lección 6: Arrays y Manipulación de Datos con Objetos

**Duración:** 7 minutos aproximadamente  
**Nivel:** Principiante  
**Lenguaje:** Java  
**Herramienta:** OnlineGDB

## Objetivo de aprendizaje

Al finalizar esta lección, el estudiante podrá:

- Comprender qué es un array en Java.
- Declarar y crear arreglos de objetos.
- Almacenar varios objetos dentro de un arreglo.
- Recorrer arrays utilizando un bucle for.
- Acceder a los atributos de los objetos mediante métodos.
- Comparar datos para identificar al jugador con mayor puntuación.

---

## 0:00 - 0:45 | Introducción

**Narración:**

¡Hola! Bienvenidos a la lección seis de nuestro curso de Java para principiantes.

En la lección anterior aprendimos a crear clases y objetos utilizando constructores, atributos y métodos.

Ahora imaginemos que estamos desarrollando un videojuego donde participan varios jugadores.

¿Tendríamos que crear una variable diferente para cada jugador?

Podríamos hacerlo, pero cuando tenemos muchos participantes, administrar toda esa información sería complicado.

Por eso, hoy aprenderemos a utilizar los arreglos, también conocidos como arrays, para almacenar y organizar varios objetos en Java.

¡Comencemos!

**En pantalla:** Mostrar el título de la lección y tres jugadores: Carlos, Ana y Luis.

---

## 0:45 - 1:45 | ¿Qué es un array?

**Narración:**

Primero, debemos entender qué es un array.

Un array es una estructura que permite almacenar varios elementos del mismo tipo en una sola variable.

Imagina que tenemos una caja con tres compartimentos. En cada compartimento podemos colocar un elemento.

En Java, cada posición tiene un número llamado índice.

Algo importante es que los índices comienzan desde cero.

Esto significa que en un arreglo de tres elementos, las posiciones serán cero, uno y dos.

Además, los arreglos tienen un tamaño fijo después de ser creados.

En nuestro ejemplo, utilizaremos un arreglo para almacenar tres objetos de la clase Jugador.

**En pantalla:**

Array: jugadores

- Posición 0: Carlos
- Posición 1: Ana
- Posición 2: Luis

Explicar visualmente que las posiciones comienzan desde cero.

---

## 1:45 - 2:45 | Crear un arreglo de objetos

**Narración:**

Ahora vamos a nuestro editor OnlineGDB.

Primero, declararemos un arreglo utilizando el nombre de la clase Jugador, seguido de corchetes.

Después escribimos el nombre de la variable, que será jugadores.

Utilizamos la palabra new para crear el arreglo e indicamos que tendrá espacio para tres elementos.

En este momento tenemos un arreglo con tres posiciones disponibles, pero todavía no hemos creado los objetos Jugador.

Cada posición inicialmente contiene el valor null, porque aún no tiene un objeto asignado.

Ahora vamos a crear nuestros jugadores utilizando el constructor que aprendimos en la lección anterior.

**Código que se muestra:**

    Jugador[] jugadores = new Jugador[3];

    jugadores[0] = new Jugador("Carlos", 15, 100);
    jugadores[1] = new Jugador("Ana", 16, 200);
    jugadores[2] = new Jugador("Luis", 14, 150);

**En pantalla:** Resaltar los índices 0, 1 y 2.

---

## 2:45 - 4:00 | Recorrer un array con for

**Narración:**

Ya tenemos nuestros tres jugadores registrados.

Ahora necesitamos mostrar la información de todos ellos.

Podríamos escribir una instrucción para cada jugador, pero existe una forma más sencilla.

Utilizaremos un bucle for.

Este bucle nos permite repetir instrucciones mientras se cumpla una condición.

Comenzamos creando una variable i con valor cero.

Después indicamos que el bucle debe continuar mientras i sea menor que la longitud del arreglo.

Para obtener esa longitud utilizamos la propiedad length.

Finalmente, incrementamos i en una unidad después de cada repetición.

Dentro del bucle llamamos al método mostrarInformacion de cada jugador.

Así podemos recorrer automáticamente todas las posiciones.

**Código que se muestra:**

    for (int i = 0; i < jugadores.length; i++) {
        System.out.println("\nJugador " + (i + 1));
        jugadores[i].mostrarInformacion();
    }

**En pantalla:** Ejecutar el programa y mostrar los datos de Carlos, Ana y Luis.

---

## 4:00 - 5:15 | Encontrar al jugador con más puntos

**Narración:**

Ahora vamos a realizar algo más interesante.

Imaginemos que queremos conocer qué jugador obtuvo la puntuación más alta.

Para resolverlo, utilizaremos nuevamente un bucle for y una condición if.

Primero, consideramos provisionalmente que el primer jugador tiene la mayor puntuación.

Después recorremos los demás jugadores y comparamos sus puntos con los del mejor jugador actual.

Para consultar los puntos utilizamos el método getPuntos, que aprendimos en la lección cinco.

Si encontramos un jugador con una puntuación mayor, lo guardamos como nuestro nuevo mejor jugador.

Cuando termina el recorrido, tendremos identificado al participante con más puntos.

**Código que se muestra:**

    Jugador mejorJugador = jugadores[0];

    for (int i = 1; i < jugadores.length; i++) {
        if (jugadores[i].getPuntos()
                > mejorJugador.getPuntos()) {
            mejorJugador = jugadores[i];
        }
    }

**En pantalla:** Explicar cómo Ana supera los 100 puntos de Carlos y conserva la mayor puntuación frente a Luis.

---

## 5:15 - 6:00 | Ejecutar el programa completo

**Narración:**

Vamos a ejecutar nuestro programa completo para verificar los resultados.

Observamos que se muestran los tres jugadores con sus respectivos nombres, edades y puntos.

Carlos tiene cien puntos, Ana tiene doscientos y Luis tiene ciento cincuenta.

Al finalizar, el programa identifica correctamente a Ana como la mejor jugadora.

Esto demuestra que podemos combinar arreglos, objetos, métodos, bucles y condiciones para resolver problemas sencillos.

Y lo mejor es que podemos utilizar la misma lógica con diferentes cantidades de jugadores.

**En pantalla:**

    === MEJOR JUGADOR ===
    Nombre: Ana
    Puntos: 200

---

## 6:00 - 6:40 | Actividad práctica

**Narración:**

¡Ahora te toca practicar!

Abre el ejercicio inicial de esta lección desde el enlace que encontrarás en la descripción del video.

Encontrarás varias instrucciones marcadas con la palabra TODO.

Tu desafío será crear un arreglo de tres jugadores, almacenar sus datos y recorrerlo utilizando un bucle for.

Después tendrás que identificar al jugador que tenga la mayor cantidad de puntos.

Puedes pausar el video para desarrollar el ejercicio con tranquilidad.

Si necesitas orientación, también encontrarás una solución completa en el repositorio del curso.

**En pantalla:** Mostrar el código de starter-files/leccion-06/Main.java y señalar los ejercicios TODO.

---

## 6:40 - 7:00 | Conclusión

**Narración:**

¡Excelente trabajo!

Hoy aprendimos a crear arrays, almacenar objetos, recorrerlos con un bucle for y comparar sus datos.

Estos conocimientos nos permiten organizar información y desarrollar programas más completos.

Recuerda que practicar es la mejor forma de aprender programación.

¡Nos vemos en la siguiente lección!

---

## Recursos de la lección

- Código inicial: starter-files/leccion-06/Main.java
- Código completo: completed-examples/leccion-06/Main.java
- Editor en línea: https://www.onlinegdb.com/online_java_compiler
- Video de YouTube: https://youtu.be/pVIi5TrVYAc 
- Enlace del ejercicio precargado: Pendiente de publicación.

