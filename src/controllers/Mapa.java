package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){
        Map<String, String> mapa = new HashMap<>();

        System.out.println("Ejemplo de HashMap");

        mapa.put("001 ", " Celular");
        mapa.put("002 ", " Laptop");
        mapa.put("003 ", " Celular");
        mapa.put("003 ", " Pc");

        System.out.println("\t" + mapa);
        System.out.println("\t" + mapa.keySet());

        for (String key : mapa.keySet()) {
            System.out.println("\tValor: " + mapa.get(key));
        }

        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    }

    public void runLinkedHashMap(){
        Map <Integer, String> mapa = new HashMap<>();

        System.out.println("Ejemplo de LinkedHashMap");

        mapa.put(1 , "FIFA");
        mapa.put(2, "Rocket League");
        mapa.put(3, "Fortnite");
        mapa.put(4, "Forza Horizon");
        mapa.put(5, "Dead by Daylight");

        for (Integer key : mapa.keySet()){
            System.out.println("\tClave: " + key + ", Valor: " + mapa.get(key));
        }
    }

    public void runTreeMap(){
        System.out.println("Ejemplo de TreeMap");
        Map <Integer, String> items = new HashMap<>();
        items.put(1, "Audi");
        items.put(2, "BMW");
        items.put(3, "Mercedes");

        for (Integer key : items.keySet()) {
            System.out.println("\tClave: " + key + ", Valor: " + items.get(key));
        }
    }

    public void runHashMapObj(){
        Map <Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        System.out.println("Ejemplo de HashMap con objetos");
        for (Empleado empleado : empleados.keySet()) {
            System.out.println("\tEmpleado " + empleado + ", Salario  " + empleados.get(empleado));
            
        }
    }

    public void runTreeMapObj(){
        // Implementar ejemplo de TreeMap con objetos
        // Similar al ejemplo de HashMap con objetos, pero usando TreeMap
        Map<Empleado, Integer> empleados = new HashMap<>();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);

        System.out.println("Ejemplo de TreeMap con objetos");
        for (Empleado empleado : empleados.keySet()) {
            System.out.println("\tEmpleado " + empleado + ", Salario " + empleados.get(empleado));
            
        }
    }
}
