import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComponenteFactory amdFactory = new AMDFactory();
        ComponenteFactory intelFactory = new IntelFactory();
        EnsamblaPC pc = new EnsamblaPC();

        System.out.println("Bienvenido, ¿qué tipo de computadora deseas ensamblar?");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        System.out.println("3. Personalizada (Componentes AMD e Intel)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                ensamblarPC(scanner, pc, amdFactory, amdFactory);  // Solo componentes AMD
                break;
            case 2:
                ensamblarPC(scanner, pc, intelFactory, intelFactory);  // Solo componentes Intel
                break;
            case 3:
                ensamblarPC(scanner, pc, amdFactory, intelFactory);  // Componentes de AMD e Intel
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void ensamblarPC(Scanner scanner, EnsamblaPC pc, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        boolean salir = false;
        boolean cpuElegido = false, gpuElegido = false, ramElegido = false, ddElegido = false, fuenteElegida = false, placaBaseElegida = false;

        while (!salir) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Elegir CPU");
            System.out.println("2. Elegir GPU");
            System.out.println("3. Elegir RAM");
            System.out.println("4. Elegir Disco Duro");
            System.out.println("5. Elegir Fuente de Alimentación");
            System.out.println("6. Elegir Placa Base");
            System.out.println("7. Pagar y Generar Ticket");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (!cpuElegido) {
                        pc.elegirCPU(scanner, amdFactory, intelFactory);
                        cpuElegido = true;
                    } else {
                        System.out.println("Ya has elegido una CPU.");
                    }
                    break;
                case 2:
                    if (!gpuElegido) {
                        pc.elegirGPU(scanner, amdFactory, intelFactory);
                        gpuElegido = true;
                    } else {
                        System.out.println("Ya has elegido una GPU.");
                    }
                    break;
                case 3:
                    if (!ramElegido) {
                        pc.elegirRAM(scanner, amdFactory, intelFactory);
                        ramElegido = true;
                    } else {
                        System.out.println("Ya has elegido una RAM.");
                    }
                    break;
                case 4:
                    if (!ddElegido) {
                        pc.elegirDiscoDuro(scanner, amdFactory, intelFactory);
                        ddElegido = true;
                    } else {
                        System.out.println("Ya has elegido un Disco Duro.");
                    }
                    break;
                case 5:
                    if (!fuenteElegida) {
                        pc.elegirFuenteAlimentacion(scanner, amdFactory, intelFactory);
                        fuenteElegida = true;
                    } else {
                        System.out.println("Ya has elegido una Fuente de Alimentación.");
                    }
                    break;
                case 6:
                    if (!placaBaseElegida) {
                        pc.elegirPlacaBase(scanner, amdFactory, intelFactory);
                        placaBaseElegida = true;
                    } else {
                        System.out.println("Ya has elegido una Placa Base.");
                    }
                    break;
                case 7:
                    if (cpuElegido && gpuElegido && ramElegido && ddElegido && fuenteElegida && placaBaseElegida) {
                        pc.mostrarConfiguracion();
                        salir = true;
                    } else {
                        System.out.println("Faltan componentes por elegir:");
                        if (!cpuElegido) System.out.println("- CPU");
                        if (!gpuElegido) System.out.println("- GPU");
                        if (!ramElegido) System.out.println("- RAM");
                        if (!ddElegido) System.out.println("- Disco Duro");
                        if (!fuenteElegida) System.out.println("- Fuente de Alimentación");
                        if (!placaBaseElegida) System.out.println("- Placa Base");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
