package controllers;
import java.util.*;
import models.*;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap(){
        this.empleados = new HashMap<>();
    }

    @Override
    public void add (Empleado emp){
        empleados.put(emp, emp);
    }

    @Override
    public void list(){
        System.out.println("Lista de empleados HASH: ");
        for(Empleado emp : empleados.values()){
            System.out.println("\t" + emp);
        }
    }

    @Override
    public void remove(int id){
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }
}
