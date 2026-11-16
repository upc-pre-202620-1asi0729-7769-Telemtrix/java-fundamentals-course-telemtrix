import java.util.Scanner;

/**
 * Lección 4: Métodos y entrada de usuario.
 * Crea la "tarjeta de jugador" de un videojuego usando métodos y Scanner.
 */
public class Main {

    // 1) Método SIN parámetros: siempre hace lo mismo
    public static void mostrarBanner() {
        System.out.println("==============================");
        System.out.println("   ¡BIENVENIDO AL JUEGO!  ");
        System.out.println("==============================");
    }

    // 2) Método CON parámetro: recibe un dato para trabajar
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Prepárate para jugar.");
    }

    // 3) Método que DEVUELVE un valor con return
    public static int calcularPuntos(int nivel, int monedas) {
        return nivel * 100 + monedas * 10;
    }

    // 4) Método que usa un if (lección anterior) y devuelve un texto
    public static String obtenerRango(int puntos) {
        if (puntos >= 1000) {
            return "Leyenda";
        } else if (puntos >= 500) {
            return "Experto";
        } else {
            return "Novato";
        }
    }

    // 5) Método que usa un bucle for (lección anterior)
    public static void mostrarEstrellas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        mostrarBanner();

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);

        System.out.print("¿En qué nivel vas? (1 a 10): ");
        int nivel = teclado.nextInt();

        System.out.print("¿Cuántas monedas tienes?: ");
        int monedas = teclado.nextInt();

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