public class Empleado {

    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Salario: $" + String.format("%.2f", salario));
    }
}
    

