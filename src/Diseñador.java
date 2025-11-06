public class Diseñador extends Empleado {
    
    private String herramientaPrincipal;

    public Diseñador(String nombre, int id, double salario, String herramienta) {
        super(nombre, id, salario);
        this.herramientaPrincipal = herramienta;
    }

    public void crearPrototipo() {
        System.out.println(nombre + " está creando un prototipo en " + herramientaPrincipal + ".");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está diseñando interfaces.");
    }
}
    
}
