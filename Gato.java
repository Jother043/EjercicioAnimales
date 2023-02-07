package EjercicioAnimales;

public class Gato extends Animal implements IMascota{


    public Gato(String nombre, int edad) throws InvalidValueException {
        super(nombre, edad);
    }

    @Override
    public void hablar() {
        System.out.println("Gato hablando");
    }

    @Override
    public void moverse() {
        System.out.println("Gato moviéndose");
    }

    @Override
    public void jugar() {
        System.out.println("Gato está jugando");
    }
}
