package EjercicioAnimales;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) throws InvalidValueException {
        setNombre(nombre);
        setEdad(edad);
    }

    public void setNombre(String nombre) throws InvalidValueException {
        if(nombre == null && nombre.trim().isEmpty()){
            throw new InvalidValueException("No puede dejar vacío el campo nombre");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws InvalidValueException {
        if(edad < 0){
            throw new InvalidValueException("La edad del animal no puede ser 0");
        }
        this.edad = edad;
    }

    public abstract void hablar();

    public abstract void moverse();
}
