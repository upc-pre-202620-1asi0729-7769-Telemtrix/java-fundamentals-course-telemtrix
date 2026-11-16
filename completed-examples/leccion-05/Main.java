public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Carlos", 15, 100);
        System.out.println("=== MI PRIMER OBJETO EN JAVA ===");
        jugador1.mostrarInformacion();
        System.out.println("\nActualizando puntos...");
        jugador1.setPuntos(150);
        System.out.println("Puntos actuales: "
                + jugador1.getPuntos());
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

    public void setPuntos(int puntos) {
        if (puntos >= 0) {
            this.puntos = puntos;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Puntos: " + puntos);
    }
}

