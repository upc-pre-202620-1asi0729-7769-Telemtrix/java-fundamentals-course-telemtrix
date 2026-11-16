# Script - Lección 4: Métodos y Entrada de Usuario

¡Hola a todos! Sean bienvenidos a la lección 4. En el video anterior aprendimos a tomar decisiones con `if` y `else`, y a repetir instrucciones con los bucles `for` y `while`. Hoy vamos a dar dos pasos muy importantes. Primero, aprenderemos a **organizar** nuestro código en bloques con nombre, llamados **métodos**, para no repetir lo mismo una y otra vez. Segundo, haremos que nuestros programas **conversen** con nosotros: que nos pregunten cosas y usen nuestras respuestas. Para practicar, vamos a crear la **tarjeta de jugador** de un videojuego. Como siempre, no vamos a instalar nada: todo lo haremos en OnlineGDB, desde el navegador.

## Antes de empezar: abrir OnlineGDB
Abran el plan del curso y busquen la lección 4. Ahí encontrarán el enlace **"Haz clic para practicar"**, que abre OnlineGDB con el archivo inicial de esta lección ya cargado. Arriba a la derecha verifiquen que el lenguaje sea **Java**. Presionen el botón verde **Run**. Abajo aparece la consola: verán un banner de bienvenida y una pregunta, "¿Cómo te llamas?". Escriban su nombre y presionen Enter. El programa ya funciona, pero está incompleto. Esos espacios marcados con la palabra `TODO` son los que vamos a completar juntos.

## ¿Qué es un método?
Imaginen que cada vez que empiezan una partida tienen que escribir el mismo banner de bienvenida. Copiar y pegar esas líneas muchas veces es aburrido, y si se equivocan en una, tienen que corregirlas todas. Un **método** es como una **receta con nombre**: escribimos las instrucciones una sola vez, le ponemos un nombre, y cuando las necesitamos, solo decimos el nombre. Miren el método que ya está listo:

    public static void mostrarBanner() {
        System.out.println("==============================");
        System.out.println("   ¡BIENVENIDO AL JUEGO!  ");
        System.out.println("==============================");
    }

Por ahora, `public static` lo escribiremos siempre, igual que en `main`; en la próxima lección verán por qué. `void` significa que el método **hace algo** pero no nos devuelve ningún resultado. Luego va el nombre, `mostrarBanner`, y entre llaves las instrucciones. Para usarlo, lo **llamamos** por su nombre con paréntesis dentro de `main`: `mostrarBanner();`. Fíjense que los nombres de métodos empiezan con minúscula y, si tienen varias palabras, cada palabra nueva empieza con mayúscula. A esto se le llama *camelCase*.

## TODO 1: Métodos con parámetros
Ahora queremos saludar al jugador por su nombre. Pero el nombre cambia: no es el mismo para todos. Para eso existen los **parámetros**: son datos que le enviamos al método, como los ingredientes que le damos a la receta. Dentro de los paréntesis escribimos el tipo de dato y un nombre: `String nombre`. Completen el método así:

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Prepárate para jugar.");
    }

Presionen **Run** y escriban su nombre. Ahora el programa los saluda a ustedes. Si lo llaman con otro nombre, por ejemplo `saludar("Luis");`, saludará a Luis. Un mismo método sirve para muchos jugadores.

## TODO 2: Métodos que devuelven un resultado
Algunos métodos no solo hacen algo: también **calculan** y nos **devuelven** un resultado, como una calculadora. En lugar de `void`, escribimos el tipo de dato que vamos a devolver, en este caso `int`, un número entero. Y usamos la palabra `return` para entregar el resultado:

    public static int calcularPuntos(int nivel, int monedas) {
        return nivel * 100 + monedas * 10;
    }

Este método recibe **dos** parámetros, separados por coma: el nivel y las monedas. Cada nivel vale 100 puntos y cada moneda vale 10. ¿Recuerdan los operadores `*` y `+` de la lección 2? Aquí los estamos usando.

## Práctica 1
Pausen el video. Completen los TODO 1 y 2 y presionen Run. Por ahora el nivel siempre es 1 y las monedas son 0, así que los puntos deberían salir **100**. Si les sale 100, ¡su método funciona! Cuando terminen, continuamos.

## TODO 3: Métodos que deciden
Dentro de un método podemos usar todo lo que ya sabemos, como los `if` de la lección anterior. Vamos a darle un **rango** al jugador según sus puntos. Este método devuelve un texto, por eso su tipo es `String`:

    public static String obtenerRango(int puntos) {
        if (puntos >= 1000) {
            return "Leyenda";
        } else if (puntos >= 500) {
            return "Experto";
        } else {
            return "Novato";
        }
    }

Cuando Java llega a un `return`, el método termina en ese momento y entrega ese valor.

## TODO 4: Métodos que repiten
También podemos usar bucles. Queremos mostrar una estrella por cada nivel. Usamos un `for` que se repite tantas veces como diga el parámetro `cantidad`. Fíjense que usamos `print` y no `println`, para que todas las estrellas queden en la misma línea:

    public static void mostrarEstrellas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

## La clase Scanner: escuchar al usuario
Hasta ahora el nivel y las monedas estaban escritos directamente en el código. ¡Hagamos que el jugador los escriba! Para eso usamos `Scanner`, una herramienta de Java que **lee lo que escribimos con el teclado**. Miren las primeras líneas del programa. Arriba de todo está `import java.util.Scanner;`, que le dice a Java que vamos a usar esta herramienta. Y dentro de `main` creamos nuestro lector: `Scanner teclado = new Scanner(System.in);`. `System.in` significa "lo que entra por el teclado".

Ya usamos uno de sus métodos: `teclado.nextLine()` lee **una línea completa de texto**, como un nombre. Para leer **números enteros** usamos `teclado.nextInt()`.

## TODO 5 y 6: Pedir el nivel y las monedas
Siempre que pidamos un dato, primero mostramos una pregunta con `print`, para que el usuario sepa qué escribir. Luego leemos su respuesta:

    System.out.print("¿En qué nivel vas? (1 a 10): ");
    int nivel = teclado.nextInt();

    System.out.print("¿Cuántas monedas tienes?: ");
    int monedas = teclado.nextInt();

Presionen **Run**. Escriban su nombre, luego su nivel, por ejemplo 7, y luego sus monedas, por ejemplo 35. ¡Ahí está su tarjeta de jugador! 7 por 100 son 700, más 35 por 10, que son 350: en total 1050 puntos, y como pasan de 1000, su rango es **Leyenda**. Y debajo aparecen 7 estrellas.

## Práctica 2
Pausen el video. Completen los TODO 3 al 6 y prueben con distintos niveles y monedas. ¿Qué datos necesitan para ser "Experto"? Y un reto extra: creen un método nuevo llamado `despedir` que reciba el nombre y muestre "¡Hasta la próxima, nombre!". Llámenlo al final de `main`.

## Errores comunes
- **Llamar a un método con datos equivocados.** Si `calcularPuntos` espera dos números, tienen que enviarle dos números, en el mismo orden: primero el nivel y luego las monedas.
- **Olvidar el `return`.** Si un método dice que devuelve `int` o `String`, siempre debe terminar con un `return`. Si no, Java mostrará un error.
- **Escribir texto cuando se pide un número.** Si en el nivel escriben "siete" en lugar de 7, `nextInt()` no lo entiende y el programa se detiene con un error llamado `InputMismatchException`. Siempre escriban números cuando se pide un número.
- **Olvidar el `import`.** Sin `import java.util.Scanner;` arriba, Java no sabe qué es `Scanner`.

## Resumen
Hoy aprendimos que un **método** es un bloque de código con nombre que podemos reutilizar. Los **parámetros** son los datos que le enviamos, y con **`return`** el método nos devuelve un resultado. `void` significa que no devuelve nada. Con **`Scanner`** leemos lo que el usuario escribe: `nextLine()` para texto y `nextInt()` para números enteros.

En la próxima lección daremos el gran salto: estos métodos van a vivir dentro de una **clase**, y aprenderemos a crear nuestros propios **objetos**. Por ejemplo, un objeto `Jugador` con su nombre, su nivel y sus monedas. ¡Nos vemos en la lección 5!