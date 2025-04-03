
class Transporte {
    protected int velocidadMaxima;
    protected int capacidad;

    public Transporte(int velocidadMaxima, int capacidad) {
        this.velocidadMaxima = velocidadMaxima;
        this.capacidad = capacidad;
    }

    public void mostrarInfo() {
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h, Capacidad: " + capacidad);
    }
}

class Bicicleta extends Transporte {
    public Bicicleta(int velocidadMaxima, int capacidad) {
        super(velocidadMaxima, capacidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Bicicleta - Velocidad máxima: " + velocidadMaxima + " km/h, Capacidad: " + capacidad + " persona(s)");
    }
}

class Moto extends Transporte {
    public Moto(int velocidadMaxima, int capacidad) {
        super(velocidadMaxima, capacidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto - Velocidad máxima: " + velocidadMaxima + " km/h, Capacidad: " + capacidad + " persona(s)");
    }
}

public class Main {
    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta(25, 1);
        Transporte moto = new Moto(120, 2);

        bicicleta.mostrarInfo();
        moto.mostrarInfo();
    }
}
