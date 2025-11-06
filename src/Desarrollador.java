public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String nombre, int id, double salario, String lenguaje) {
        super(nombre, id, salario);
        this.lenguajePrincipal = lenguaje;
    }

    public void escribirCodigo() {
        System.out.println(getNombre() + " está escribiendo código en " + lenguajePrincipal);
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está desarrollando software.");
    }
}