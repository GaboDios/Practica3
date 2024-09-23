import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComponenteFactory amdFactory = new AMDFactory();
        ComponenteFactory intelFactory = new IntelFactory();
        EnsamblaPC pc = new EnsamblaPC();

        // Menú principal con nuevas opciones
        System.out.println("Bienvenido, ¿qué tipo de computadora deseas ensamblar?");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        System.out.println("3. Personalizada (Componentes AMD e Intel)");
        System.out.println("4. PC para Oficina");
        System.out.println("5. PC Gaming");

        int choice = scanner.nextInt();
        boolean esPersonalizada = false;


        switch (choice) {
            case 1:
                pc.elegirGama(scanner);  // Elige la gama antes de seleccionar componentes
                ensamblarPC(scanner, pc, amdFactory, amdFactory, esPersonalizada);  // Solo componentes AMD
                break;
            case 2:
                pc.elegirGama(scanner);  // Elige la gama antes de seleccionar componentes
                ensamblarPC(scanner, pc, intelFactory, intelFactory, esPersonalizada);  // Solo componentes Intel
                break;
            case 3:
                pc.elegirGama(scanner);  // Elige la gama antes de seleccionar componentes
                esPersonalizada = true;
                ensamblarPC(scanner, pc, amdFactory, intelFactory, esPersonalizada);  // Componentes de AMD e Intel
                break;
            case 4:
                // Opción para PC de Oficina
                elegirPCOficina(scanner, amdFactory, intelFactory);  // Configuración predeterminada de oficina
                break;
            case 5:
                // Opción para PC Gaming
                elegirPCGaming(scanner, amdFactory, intelFactory);  // Configuración predeterminada de gaming
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void elegirPCOficina(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        System.out.println("Has elegido ensamblar una PC de Oficina.");
        System.out.println("¿Qué marca prefieres?");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        int marcaChoice = scanner.nextInt();

        ComponenteFactory factory = (marcaChoice == 1) ? amdFactory : intelFactory;
        OficinaPCBuilder oficinaBuilder = new OficinaPCBuilder(factory);
        Director director = new Director(oficinaBuilder);
        director.construirPC();

        PC pcOficina = director.getPC();
        pcOficina.mostrarConfiguracion();
    }



    public static void elegirPCGaming(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        System.out.println("Has elegido ensamblar una PC Gaming.");
        System.out.println("¿Qué marca prefieres?");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        int marcaChoice = scanner.nextInt();

        ComponenteFactory factory = (marcaChoice == 1) ? amdFactory : intelFactory;
        GamingPCBuilder gamingBuilder = new GamingPCBuilder(factory);
        Director director = new Director(gamingBuilder);
        director.construirPC();

        PC pcGaming = director.getPC();
        pcGaming.mostrarConfiguracion();
    }



    // Método para ensamblar una PC personalizada
    public static void ensamblarPC(Scanner scanner, EnsamblaPC pc, ComponenteFactory amdFactory, ComponenteFactory intelFactory, boolean esPersonalizada) {
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
                        pc.elegirCPU(scanner, amdFactory, intelFactory, esPersonalizada);
                        cpuElegido = true;
                    } else {
                        System.out.println("Ya has elegido una CPU.");
                    }
                    break;
                case 2:
                    if (!gpuElegido) {
                        pc.elegirGPU(scanner, amdFactory, intelFactory, esPersonalizada);
                        gpuElegido = true;
                    } else {
                        System.out.println("Ya has elegido una GPU.");
                    }
                    break;
                case 3:
                    if (!ramElegido) {
                        pc.elegirRAM(scanner, amdFactory, intelFactory, esPersonalizada);
                        ramElegido = true;
                    } else {
                        System.out.println("Ya has elegido una RAM.");
                    }
                    break;
                case 4:
                    if (!ddElegido) {
                        pc.elegirDiscoDuro(scanner, amdFactory, intelFactory, esPersonalizada);
                        ddElegido = true;
                    } else {
                        System.out.println("Ya has elegido un Disco Duro.");
                    }
                    break;
                case 5:
                    if (!fuenteElegida) {
                        pc.elegirFuenteAlimentacion(scanner, amdFactory, intelFactory, esPersonalizada);
                        fuenteElegida = true;
                    } else {
                        System.out.println("Ya has elegido una Fuente de Alimentación.");
                    }
                    break;
                case 6:
                    if (!placaBaseElegida) {
                        pc.elegirPlacaBase(scanner, amdFactory, intelFactory, esPersonalizada);
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
