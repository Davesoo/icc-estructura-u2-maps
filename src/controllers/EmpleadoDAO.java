package controllers;
import models.*;

public interface EmpleadoDAO {

    public void add(Empleado emp);
    
    public void list();

    public void remove(int id);
} 
