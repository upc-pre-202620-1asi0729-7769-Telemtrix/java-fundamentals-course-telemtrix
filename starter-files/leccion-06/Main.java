public class Main {

    public static void main(String[] args) {

        System.out.println("=== PRACTICA: ARRAYS Y OBJETOS ===");

        // TODO 1: Crear un arreglo de tipo Jugador
        // que tenga espacio para 3 jugadores.

        // TODO 2: Crear los siguientes jugadores:
        // Carlos, 15 anios, 100 puntos.
        // Ana, 16 anios, 200 puntos.
        // Luis, 14 anios, 150 puntos.

        // TODO 3: Guardar cada jugador en el arreglo.

        // TODO 4: Recorrer el arreglo con un bucle for
        // y mostrar la informacion de cada jugador.

        // TODO 5: Encontrar al jugador con mas puntos
        // utilizando un bucle y una condicion if.

        // TODO 6: Mostrar el nombre y los puntos
        // del jugador con mayor puntuacion.
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

    public int getPuntos() {
        return puntos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Puntos: " + puntos);
    }
}

