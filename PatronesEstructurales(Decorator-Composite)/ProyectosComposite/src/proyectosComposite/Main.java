package proyectosComposite;

/**
 * Clase prueba para demostrar patrón composite
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Ana", "Quesada", "207410170");
        Entregable e1 = new Entregable("Entregable1", "este es el entregable1", emp1);

        Empleado emp2 = new Empleado("Juan", "Arias", "207440378");
        Entregable e2 = new Entregable("Entregable2", "entregable numero2", emp2);

        Tarea t1 = new Tarea("Tarea1", "tarea numero1", 10, emp1);
        Tarea t2 = new Tarea("Tarea2", "tarea numero2", 15, emp2);

        // las tareas se componen de entregables y de tareas (Patrón Composite)
        t1.agregarProyecto(e1);
        t1.agregarProyecto(e2);

        t1.agregarProyecto(t2);

        System.out.println("total tiempo tarea 1 y tarea 2 compuestas: " + t1.calcularTiempo());

    }

}
