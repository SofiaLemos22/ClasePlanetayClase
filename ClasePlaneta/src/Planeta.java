public class Planeta {
    // Enum para el tipo de planeta
    public enum TipoPlaneta {
        GASEOSO,
        TERRESTRE,
        ENANO
    }

    // Atributos de la clase
    private String nombre;
    private int cantidadSatélites;
    private double masa; // en kilogramos
    private double volumen; // en kilómetros cúbicos
    private int diámetro; // en kilómetros
    private int distanciaMediaAlSol; // en millones de kilómetros
    private TipoPlaneta tipoPlaneta;
    private boolean observableASimpleVista;
    private int periodoOrbital;
    private int periodoRotación;

    public Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro, int distanciaMediaAlSol, TipoPlaneta tipoPlaneta, boolean observableASimpleVista, int periodoOrbital, int periodoRotación) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observableASimpleVista = observableASimpleVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotación = periodoRotación;
    }

    // Metodo para imprimir los atributos del planeta

    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatélites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diámetro + " km");
        System.out.println("Distancia media al Sol: " + distanciaMediaAlSol + " millones de km");
        System.out.println("Tipo de Planeta: " + tipoPlaneta);
        System.out.println("Observable a simple vista: " + observableASimpleVista);
        System.out.println("Tipo de Planeta: " + tipoPlaneta);
        System.out.println("Periódo orbital: " + periodoOrbital);
        System.out.println("Periódo rotación: " + periodoRotación);
        System.out.println();
    }

    // Metodo para calcular la densidad

    public double calcularDensidad() {
        return masa / volumen;
    }

    // Metodo para determinar si el planeta es exterior
    public boolean esExterior() {
        final double UA_EN_KM = 149597870; // 1 UA en kilómetros
        double distanciaEnUA = distanciaMediaAlSol * 1000000 / UA_EN_KM; // Convertir a UA
        return distanciaEnUA > 3.4; // Verificar si está más allá del cinturón de asteroides
    }
}





