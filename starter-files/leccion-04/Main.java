import java.util.Scanner;

/**
 * Lección 4: Métodos y entrada de usuario.
 * ¡Completa los TODO para crear tu "tarjeta de jugador"!
 */
public class Main {

    // Método SIN parámetros (ya está listo como ejemplo)
    public static void mostrarBanner() {
        System.out.println("==============================");
        System.out.println("   ¡BIENVENIDO AL JUEGO!  ");
        System.out.println("==============================");
    }

    // TODO 1: Completa el método saludar para que muestre:
    //         ¡Hola, <nombre>! Prepárate para jugar.
    public static void saludar(String nombre) {
        // Escribe tu código aquí
    }

    // TODO 2: Devuelve los puntos con la fórmula: nivel * 100 + monedas * 10
    public static int calcularPuntos(int nivel, int monedas) {
        return 0; // Cambia este 0 por la fórmula
    }

    // TODO 3: Devuelve "Leyenda" si puntos >= 1000,
    //         "Experto" si puntos >= 500 y "Novato" en otro caso
    public static String obtenerRango(int puntos) {
        return "Novato"; // Cambia esto usando if / else
    }

    // TODO 4: Usa un bucle for para imprimir un * por cada nivel
    public static void mostrarEstrellas(int cantidad) {
        // Escribe tu bucle aquí
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        mostrarBanner();

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);

        // TODO 5: Pregunta el nivel y guárdalo con teclado.nextInt()
        int nivel = 1;

        // TODO 6: Pregunta las monedas y guárdalas con teclado.nextInt()
        int monedas = 0;

        int puntos = calcularPuntos(nivel, monedas);
        String rango = obtenerRango(puntos);

        System.out.println();
        System.out.println("----- TARJETA DE JUGADOR -----");
        System.out.println("Jugador: " + nombre);
        System.out.println("Puntos:  " + puntos);
        System.out.println("Rango:   " + rango);
        System.out.print("Nivel:   ");
        mostrarEstrellas(nivel);

        teclado.close();
    }
}