// import controllers.Ejercicios;
// import controllers.EmpleadoContoller;
import controllers.*;
import models.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Dave Siguenza"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runEmpleadoExample();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();
    }

    public static void runEmpleadoExample() {

        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoController empleadoContoller = new EmpleadoController(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoController empleadoContoller2 = new EmpleadoController(empleadoDAOTree);

        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);
        empleadoContoller.list();
        empleadoContoller.eliminarEmpleado(2);
        empleadoContoller.list();

        empleadoContoller2.agregarEmpleado(emp1);
        empleadoContoller2.agregarEmpleado(emp2);
        empleadoContoller2.agregarEmpleado(emp3);
        empleadoContoller2.agregarEmpleado(emp4);
        empleadoContoller2.agregarEmpleado(emp5);
        empleadoContoller2.list();
        empleadoContoller2.eliminarEmpleado(2);
        empleadoContoller2.list();

    }

    // private static void runEmpleadoExample() {
    //     throw new UnsupportedOperationException("Not implemented yet");
    // }

    // private static void runEjerccios() {
    //     throw new UnsupportedOperationException("Not implemented yet");

    // }
}
