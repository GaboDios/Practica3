import java.util.Scanner;

/**
 * Clase EnsamblaPC que gestiona el proceso de selección de componentes para armar una PC.
 * Permite elegir componentes de diferentes marcas (AMD o Intel) y asegura la compatibilidad 
 * entre CPU y Placa Base mediante el uso de un adaptador si es necesario.
 * @author Los Hijos de Korhal (Gabo, Pedro, Yamil e Isaac)
 */
public class EnsamblaPC {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private DiscoDuro discoDuro;
    private FuenteAlimentacion fuenteAlimentacion;
    private PlacaBase placaBase;

    /**
     * Constructor por defecto de la clase EnsamblaPC.
     * Inicialmente no hay componentes seleccionados.
     */
    public EnsamblaPC() {
        // Inicialmente, no hay componentes seleccionados.
    }

    /**
     * Método para elegir una CPU (AMD o Intel) a partir de una lista proporcionada.
     * 
     * @param scanner       Entrada del usuario.
     * @param amdFactory    Fábrica de componentes AMD.
     * @param intelFactory  Fábrica de componentes Intel.
     */
    public void elegirCPU(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        System.out.println("Elige una CPU:");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        int choice = scanner.nextInt();

        ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;

        for (int i = 0; i < 5; i++) {
            CPU opcion = factory.crearCPU(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int cpuIndex = scanner.nextInt() - 1;
        this.cpu = factory.crearCPU(cpuIndex);
    }

    /**
     * Método para elegir una Placa Base (AMD o Intel) y verificar la compatibilidad con la CPU seleccionada.
     * Si no son compatibles, se utiliza un adaptador para hacerlos compatibles.
     * @param scanner       Entrada del usuario.
     * @param amdFactory    Fábrica de componentes AMD.
     * @param intelFactory  Fábrica de componentes Intel.
     */
    public void elegirPlacaBase(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        System.out.println("Elige una Placa Base:");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        int choice = scanner.nextInt();

        ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;

        for (int i = 0; i < 5; i++) {
            PlacaBase opcion = factory.crearPlacaBase(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int placaIndex = scanner.nextInt() - 1;
        this.placaBase = factory.crearPlacaBase(placaIndex);

        // Verificar compatibilidad y aplicar el Adapter si es necesario
        if (!cpu.getSocketType().equals(placaBase.getCompatibleSocket())) {
            System.out.println("CPU y Placa Base no compatibles, aplicando adaptador...");
            this.cpu = new CPUAdapter(cpu, placaBase.getCompatibleSocket());
        }
    }

    /**
     * Método para elegir una GPU (AMD o Intel) a partir de una lista proporcionada.
     * 
     * @param scanner       Entrada del usuario.
     * @param amdFactory    Fábrica de componentes AMD.
     * @param intelFactory  Fábrica de componentes Intel.
     */
    public void elegirGPU(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        System.out.println("Elige una GPU:");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        int choice = scanner.nextInt();

        ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;

        for (int i = 0; i < 5; i++) {
            GPU opcion = factory.crearGPU(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int gpuIndex = scanner.nextInt() - 1;
        this.gpu = factory.crearGPU(gpuIndex);
    }

    /**
     * Método para elegir una RAM (AMD o Intel) a partir de una lista proporcionada.
     * 
     * @param scanner       Entrada del usuario.
     * @param amdFactory    Fábrica de componentes AMD.
     * @param intelFactory  Fábrica de componentes Intel.
     */
    public void elegirRAM(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        System.out.println("Elige una RAM:");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        int choice = scanner.nextInt();

        ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;

        for (int i = 0; i < 5; i++) {
            RAM opcion = factory.crearRAM(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int ramIndex = scanner.nextInt() - 1;
        this.ram = factory.crearRAM(ramIndex);
    }

    /**
     * Método para elegir un Disco Duro (AMD o Intel) a partir de una lista proporcionada.
     * 
     * @param scanner       Entrada del usuario.
     * @param amdFactory    Fábrica de componentes AMD.
     * @param intelFactory  Fábrica de componentes Intel.
     */
    public void elegirDiscoDuro(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        System.out.println("Elige un Disco Duro:");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        int choice = scanner.nextInt();

        ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;

        for (int i = 0; i < 5; i++) {
            DiscoDuro opcion = factory.crearDiscoDuro(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int ddIndex = scanner.nextInt() - 1;
        this.discoDuro = factory.crearDiscoDuro(ddIndex);
    }

    /**
     * Método para elegir una Fuente de Alimentación (AMD o Intel) a partir de una lista proporcionada.
     * 
     * @param scanner       Entrada del usuario.
     * @param amdFactory    Fábrica de componentes AMD.
     * @param intelFactory  Fábrica de componentes Intel.
     */
    public void elegirFuenteAlimentacion(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory) {
        System.out.println("Elige una Fuente de Alimentación:");
        System.out.println("1. AMD");
        System.out.println("2. Intel");
        int choice = scanner.nextInt();

        ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;

        for (int i = 0; i < 5; i++) {
            FuenteAlimentacion opcion = factory.crearFuenteAlimentacion(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int fuenteIndex = scanner.nextInt() - 1;
        this.fuenteAlimentacion = factory.crearFuenteAlimentacion(fuenteIndex);
    }

    /**
     * Método para mostrar la configuración final de la PC ensamblada y calcular el precio total de los componentes.
     */
    public void mostrarConfiguracion() {
        System.out.println("Configuración final de la PC:");
        System.out.println("CPU: " + cpu.getDescription());
        System.out.println("GPU: " + gpu.getDescription());
        System.out.println("RAM: " + ram.getDescription());
        System.out.println("Disco Duro: " + discoDuro.getDescription());
        System.out.println("Fuente de Alimentación: " + fuenteAlimentacion.getDescription());
        System.out.println("Placa Base: " + placaBase.getDescription());
        double total = cpu.getPrecio() + gpu.getPrecio() + ram.getPrecio() + discoDuro.getPrecio() + fuenteAlimentacion.getPrecio() + placaBase.getPrecio();
        System.out.println("Precio total: $" + total);
    }
}
