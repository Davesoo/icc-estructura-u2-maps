package models;

public class Empleado implements Comparable<Empleado> {
    
    @Override
    public int compareTo(Empleado o) {
        // TODO Auto-generated method stub
        // Si son iguales, se puede comparar por nombre o ID
        if (this.id != 0 && o.id != 0) {
            return Integer.compare(id, o.id);
        }

        return Integer.compare(id, o.id);
    }

    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    

    public Empleado(int id) {
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + name + ", Posición: " + position;
    }
}