package ITERATIOR;

public class Producto {

    String ID;
    String nombre;

    public Producto(){

    }

    public Producto(String ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "ID='" + ID + '\'' +
                ", nombre='" + nombre + '\'' +
                '}' + "\n \n";
    }
}
