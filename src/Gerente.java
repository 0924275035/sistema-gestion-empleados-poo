public class Gerente extends Empleado {

    private int numSubordinados;

    public Gerente(String nombre, int id, double salario, int numSubordinados) {
        super(nombre, id, salario);
        this.numSubordinados = numSubordinados;
    }

    public void coordinarEquipo() {
        System.out.println(nombre + " está coordinando un equipo de " + numSubordinados + " personas.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está gestionando el proyecto.");
    }
}
