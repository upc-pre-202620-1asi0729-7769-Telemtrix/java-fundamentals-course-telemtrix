
# Lección 5: Fundamentos de Programación Orientada a Objetos

**Duración:** 8 minutos aproximadamente  
**Nivel:** Principiante  
**Lenguaje:** Java  
**Herramienta:** OnlineGDB o MyCompiler

## Objetivo de aprendizaje

Al finalizar esta lección, el estudiante podrá:

- Comprender qué son las clases y los objetos.
- Identificar atributos y métodos.
- Crear objetos utilizando constructores.
- Aplicar encapsulación con atributos privados.
- Utilizar getters y setters.
- Ejecutar un programa básico de POO en Java.

---

## 0:00 - 0:45 | Introducción

**Narración:**

¡Hola! Bienvenidos a la lección cinco de nuestro curso de Java para principiantes.

En las lecciones anteriores aprendimos a utilizar variables, condicionales, bucles y métodos.

Ahora conoceremos uno de los conceptos más importantes de Java: la Programación Orientada a Objetos, también conocida como POO.

Imagina que estamos desarrollando un videojuego y necesitamos crear personajes con nombres, edades y puntos.

En lugar de programar toda esa información por separado, podemos organizarla utilizando clases y objetos.

¡Vamos a descubrir cómo funciona!

**En pantalla:** Título de la lección y ejemplo de un personaje de videojuego.

---

## 0:45 - 1:45 | ¿Qué son las clases y los objetos?

**Narración:**

Primero, debemos comprender la diferencia entre una clase y un objeto.

Una clase es como un molde que nos permite definir las características y comportamientos de algo.

Por ejemplo, imaginemos una clase llamada Jugador.

Un jugador puede tener un nombre, una edad y una cantidad de puntos.

Estas características se conocen como atributos.

Además, el jugador puede realizar acciones, como mostrar su información o actualizar sus puntos. Estas acciones se representan mediante métodos.

Un objeto es una instancia creada a partir de una clase.

Por ejemplo, podemos crear un jugador llamado Carlos, de quince años, con cien puntos.

La clase es el molde y Carlos es un objeto creado utilizando ese molde.

**En pantalla:**

Clase: Jugador

Atributos:
- nombre
- edad
- puntos

Método:
- mostrarInformacion()

Objeto:
- Carlos, 15 años, 100 puntos

---

## 1:45 - 3:00 | Creando nuestra primera clase

**Narración:**

Ahora vamos a nuestro editor de Java en línea.

Comenzaremos escribiendo la palabra class, seguida del nombre Jugador.

Dentro de la clase declararemos tres atributos: nombre, edad y puntos.

Utilizamos String para almacenar el nombre e int para almacenar números enteros, como la edad y los puntos.

También observamos la palabra private.

Esta palabra permite restringir el acceso directo a los atributos desde otras clases.

Más adelante veremos cómo consultar y modificar estos valores de manera controlada.

**Código que se muestra:**

```java
class Jugador {
    private String nombre;
    private int edad;
    private int puntos;
}
```

**En pantalla:** Explicar cada atributo señalándolo con el cursor.

---

## 3:00 - 4:00 | ¿Qué es un constructor?

**Narración:**

Ahora que tenemos nuestra clase, necesitamos una manera de asignar los datos iniciales a cada jugador.

Para eso utilizamos un constructor.

Un constructor es una estructura especial que se ejecuta cuando creamos un objeto.

En Java, tiene el mismo nombre que la clase y no declara un tipo de retorno.

En nuestro ejemplo, el constructor recibe tres datos: nombre, edad y puntos.

Después utilizamos la palabra this para distinguir los atributos del objeto de los parámetros que recibimos.

Gracias a esto, podemos crear diferentes jugadores con información personalizada.

**Código que se muestra:**

```java
public Jugador(String nombre, int edad, int puntos) {
    this.nombre = nombre;
    this.edad = edad;
    this.puntos = puntos;
}
```

**En pantalla:** Resaltar el constructor y la palabra this.

---

## 4:00 - 5:15 | Encapsulación, getters y setters

**Narración:**

Continuemos con otro concepto importante: la encapsulación.

La encapsulación nos ayuda a proteger los datos internos de un objeto y controlar cómo se consultan o modifican.

Como nuestros atributos son privados, podemos utilizar métodos públicos llamados getters y setters.

Un getter permite consultar un valor.

Por ejemplo, getPuntos devuelve la cantidad de puntos de un jugador.

Por otro lado, un setter permite modificar ese valor.

En setPuntos utilizamos una condición para evitar que los puntos sean negativos.

De esta forma, no solo modificamos los datos, sino que también podemos aplicar reglas para protegerlos.

**Código que se muestra:**

```java
public int getPuntos() {
    return puntos;
}

public void setPuntos(int puntos) {
    if (puntos >= 0) {
        this.puntos = puntos;
    }
}
```

**En pantalla:** Explicar la diferencia entre getPuntos y setPuntos.

---

## 5:15 - 6:30 | Creando y utilizando un objeto

**Narración:**

Ya tenemos nuestra clase Jugador.

Ahora vamos al método principal, llamado main.

Aquí crearemos un objeto escribiendo Jugador, seguido del nombre de la variable jugador1.

Utilizamos la palabra new para crear el objeto, y llamamos al constructor enviando los datos de Carlos.

Después utilizamos el método mostrarInformacion para visualizar su nombre, edad y puntos.

Finalmente, actualizaremos sus puntos utilizando setPuntos con el valor ciento cincuenta.

Para comprobar el cambio, utilizaremos getPuntos.

Ejecutamos el programa y observamos cómo los puntos iniciales cambiaron de cien a ciento cincuenta.

**Código que se muestra:**

```java
Jugador jugador1 = new Jugador("Carlos", 15, 100);

jugador1.mostrarInformacion();

jugador1.setPuntos(150);

System.out.println(jugador1.getPuntos());
```

**En pantalla:** Ejecutar el código completo de completed-examples/leccion-05/Main.java.

**Resultado esperado:**

```text
=== MI PRIMER OBJETO EN JAVA ===
Nombre: Carlos
Edad: 15
Puntos: 100

Actualizando puntos...
Puntos actuales: 150
```

---

## 6:30 - 7:30 | Actividad práctica

**Narración:**

¡Ahora es tu turno!

Te propongo un pequeño desafío para comprobar lo aprendido.

Abre el ejercicio inicial de esta lección en el editor de Java en línea.

Encontrarás comentarios con la palabra TODO.

Tu objetivo será completar los atributos, el constructor y los métodos de la clase Jugador.

Después crea tu propio jugador utilizando tu nombre, edad y una cantidad inicial de puntos.

Por último, utiliza el método setPuntos para actualizar su puntuación.

Puedes pausar el video mientras completas la actividad.

Si necesitas ayuda, revisa el ejemplo completo disponible en el repositorio del curso.

**En pantalla:** Mostrar starter-files/leccion-05/Main.java.

**Actividad:**
1. Completar la clase Jugador.
2. Crear un objeto.
3. Mostrar sus datos.
4. Actualizar sus puntos.

---

## 7:30 - 8:00 | Conclusión

**Narración:**

¡Excelente trabajo!

Hoy aprendimos que una clase funciona como un molde y que los objetos son instancias creadas a partir de ella.

También conocimos los atributos, constructores y métodos, así como la encapsulación mediante getters y setters.

Estos conocimientos son fundamentales para desarrollar programas más organizados y reutilizables.

En la próxima lección aprenderemos a trabajar con varios objetos utilizando arreglos o arrays en Java.

¡Nos vemos en la siguiente lección!

---

## Recursos de la lección

- Código inicial: starter-files/leccion-05/Main.java
- Código completo: completed-examples/leccion-05/Main.java
- Editor en línea: https://www.onlinegdb.com/online_java_compiler
- Video de YouTube: https://youtu.be/2ZQr82_QnRs 
- Enlace del ejercicio precargado: Pendiente de publicación.

