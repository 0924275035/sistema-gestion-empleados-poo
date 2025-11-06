public class Main {
    public static void main(String[] args) {
        Desarrollador dev = new Desarrollador("Nicole",101,3500, "Java");
        Gerente mgr = new Gerente("Carlos", 201, 6000, 5);
        Diseñador dis = new Diseñador("Lucía", 301, 3200, "Figma");

        dev.mostrarInfo();
        dev.trabajar();
        dev.escribirCodigo();

        System.out.println();

        mgr.mostrarInfo();
        mgr.trabajar();
        mgr.coordinarEquipo();

        System.out.println();

        dis.mostrarInfo();
        dis.trabajar();
        dis.crearPrototipo();
    }
}
    
