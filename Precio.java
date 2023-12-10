// Importar la clase Scanner desde el paquete java.util
import java.util.Scanner;

// Definir la clase "diez"
public class diez {

    // Método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base imponible al usuario
        System.out.print("Introduce la base imponible (precio antes de impuestos): ");
        double baseImponible = scanner.nextDouble();

        // Solicitar el tipo de IVA al usuario
        System.out.println("Selecciona el tipo de IVA:");
        System.out.println("1. General (21%)");
        System.out.println("2. Reducido (10%)");
        System.out.println("3. Superreducido (4%)");
        int opcionIVA = scanner.nextInt();
        double porcentajeIVA = 0.0;

        // Asignar el porcentaje de IVA según la opción seleccionada por el usuario
        switch (opcionIVA) {
            case 1:
                porcentajeIVA = 21.0;
                break;
            case 2:
                porcentajeIVA = 10.0;
                break;
            case 3:
                porcentajeIVA = 4.0;
                break;
            default:
                System.out.println("Opción de IVA no válida. Se aplicará el 21% por defecto.");
                porcentajeIVA = 21.0;
        }

        // Solicitar el código promocional al usuario
        System.out.println("Selecciona el código promocional:");
        System.out.println("1. Nopro");
        System.out.println("2. Mitad");
        System.out.println("3. Meno5");
        System.out.println("4. 5porc");
        int opcionPromocional = scanner.nextInt();
        double descuento = 0.0;

        // Asignar el descuento según la opción de código promocional seleccionada
        switch (opcionPromocional) {
            case 1:
                // No se aplica ningún descuento
                break;
            case 2:
                // Se reduce a la mitad
                descuento = baseImponible / 2.0;
                break;
            case 3:
                // Se descuentan 5 euros
                descuento = 5.0;
                break;
            case 4:
                // Se descuenta el 5%
                descuento = (baseImponible * 5.0) / 100.0;
                break;
            default:
                System.out.println("Código promocional no válido. No se aplica ningún descuento.");
        }

        // Calcular el precio final
        double precioFinal = baseImponible + (baseImponible * (porcentajeIVA / 100.0)) - descuento;

        // Mostrar el resultado
        System.out.println("El precio final es: " + precioFinal + " euros.");
    }
}
