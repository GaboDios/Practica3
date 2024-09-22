import java.util.Scanner;

public class EnsamblaPC {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private DiscoDuro discoDuro;
    private FuenteAlimentacion fuenteAlimentacion;
    private PlacaBase placaBase;

    public EnsamblaPC() {
        // Inicialmente, no hay componentes seleccionados.
    }

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
            this.cpu = new CPUAdapter(cpu, placaBase.getCompatibleSocket()); // Adaptar la CPU a la Placa Base
        }
    }

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
