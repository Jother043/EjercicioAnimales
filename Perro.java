package EjercicioAnimales;

public class Perro extends Animal implements IMascota{


    public Perro(String nombre, int edad) throws InvalidValueException {
        super(nombre, edad);
    }

    @Override
    public void hablar() {
        System.out.println("Perro hablando");
    }

    @Override
    public void moverse() {
        System.out.println("Perro moviéndose");
    }

    @Override
    public void jugar() {
        System.out.println("Perro está jugando");
    }
}
