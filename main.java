package EjercicioAnimales;

public class main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        try {
            animales[0] = new Perro("TOBI",2);
        } catch (InvalidValueException e) {
            throw new RuntimeException(e);
        }
        try {
            animales[1] = new Gato("MICHI",3);
        } catch (InvalidValueException e) {
            throw new RuntimeException(e);
        }
        try {
            animales[2] = new Perro("LOCO",4);
        } catch (InvalidValueException e) {
            throw new RuntimeException(e);
        }
        try {
            animales[3] = new Gato("MIAU",7);
        } catch (InvalidValueException e) {
            throw new RuntimeException(e);
        }

        for(Animal animal : animales){
            if(animal instanceof Perro){
                ((Perro) animal).jugar();
            }
            if(animal instanceof Gato){
                ((Gato) animal).jugar();
            }
            animal.hablar();
            animal.moverse();
        }
    }
}
