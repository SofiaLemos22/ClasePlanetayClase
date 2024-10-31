public class Main {
    public static void main(String[] args) {
            // Crear dos planetas
        Planeta marte = new Planeta("Marte", 2, 6.42e23, 163.0, 6779, 228, Planeta.TipoPlaneta.TERRESTRE, true,
                678,25);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898e27, 1430000.0, 139820, 778, Planeta.TipoPlaneta.GASEOSO, false,
        12, 1);


        // Imprimir atributos y cálculos de cada planeta
            System.out.println("Atributos de Marte:");
            marte.imprimirAtributos();
            System.out.printf("Densidad de Marte: %.2f kg/km³\n", marte.calcularDensidad());
            System.out.println("¿Marte es un planeta exterior? " + marte.esExterior());

            System.out.println("\nAtributos de Júpiter:");
            jupiter.imprimirAtributos();
            System.out.printf("Densidad de Júpiter: %.2f kg/km³\n", jupiter.calcularDensidad());
            System.out.println("¿Júpiter es un planeta exterior? " + jupiter.esExterior());
        }
    }