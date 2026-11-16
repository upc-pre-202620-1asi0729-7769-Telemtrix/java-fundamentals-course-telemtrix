public class Main {

    public static void main(String[] args) {

        System.out.println("=== LISTA DE JUGADORES EN JAVA ===");

        // Crear un arreglo para almacenar 3 jugadores
        Jugador[] jugadores = new Jugador[3];

        // Crear objetos y guardarlos en el arreglo
        jugadores[0] = new Jugador("Carlos", 15, 100);
        jugadores[1] = new Jugador("Ana", 16, 200);
        jugadores[2] = new Jugador("Luis", 14, 150);

        // Recorrer el arreglo utilizando un bucle for
        System.out.println("\nJugadores registrados:");

        for (int i = 0; i < jugadores.length; i++) {

            System.out.println("\nJugador " + (i + 1));
            jugadores[i].mostrarInformacion();
        }

        // Mostrar el nombre del jugador con mas puntos
        Jugador mejorJugador = jugadores[0];

        for (int i = 1; i < jugadores.length; i++) {

            if (jugadores[i].getPuntos()
                    > mejorJugador.getPuntos()) {

                mejorJugador = jugadores[i];
            }
        }

        System.out.println("\n=== MEJOR JUGADOR ===");
        System.out.println("Nombre: "
                + mejorJugador.getNombre());
        System.out.println("Puntos: "
                + mejorJugador.getPuntos());
    }
}

class Jugador {

    private String nombre;
    private int edad;
    private int puntos;

    public Jugador(String nombre, int edad, int puntos) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Puntos: " + puntos);
    }
}

