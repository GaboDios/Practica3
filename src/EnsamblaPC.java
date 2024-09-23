import java.util.Scanner;
import java.util.List;

public class EnsamblaPC {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private DiscoDuro discoDuro;
    private FuenteAlimentacion fuenteAlimentacion;
    private PlacaBase placaBase;
    private String gamaSeleccionada;

    public EnsamblaPC() {
        // Inicialmente, no hay componentes seleccionados.
    }

    public void elegirGama(Scanner scanner) {
        System.out.println("Elige la gama de componentes:");
        System.out.println("1. Alta");
        System.out.println("2. Media");
        System.out.println("3. Baja");
        int gamaChoice = scanner.nextInt();

        while (gamaChoice < 1 || gamaChoice > 3) {
            System.out.println("Por favor, selecciona una opción válida (1-3):");
            gamaChoice = scanner.nextInt();
        }

        switch (gamaChoice) {
            case 1:
                gamaSeleccionada = "Alta";
                break;
            case 2:
                gamaSeleccionada = "Media";
                break;
            case 3:
                gamaSeleccionada = "Baja";
                break;
            default:
                gamaSeleccionada = "Media";  // Por defecto, gama media
                break;
        }
    }

    public void elegirCPU(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory, boolean esPersonalizada) {
        if (esPersonalizada) {
            System.out.println("Elige una CPU:");
            System.out.println("1. AMD");
            System.out.println("2. Intel");
            int choice = scanner.nextInt();
            ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;
            mostrarOpcionesCPU(factory, scanner);
        } else {
            System.out.println("Entro al else de Elegir CPU");
            mostrarOpcionesCPU(amdFactory, scanner);  // Usa solo la fábrica seleccionada (AMD o Intel)
        }
    }

    private void mostrarOpcionesCPU(ComponenteFactory factory, Scanner scanner) {
        List<CPU> cpusDisponibles = factory.getCPUsPorGama(gamaSeleccionada);
        for (int i = 0; i < cpusDisponibles.size(); i++) {
            CPU opcion = cpusDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int cpuIndex = scanner.nextInt() - 1;

        while (cpuIndex < 0 || cpuIndex >= cpusDisponibles.size()) {
            System.out.println("Por favor, selecciona una opción válida.");
            cpuIndex = scanner.nextInt() - 1;
        }

        this.cpu = cpusDisponibles.get(cpuIndex);
    }


    public void elegirGPU(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory, boolean esPersonalizada) {
        if (esPersonalizada) {
            System.out.println("Elige una GPU:");
            System.out.println("1. AMD");
            System.out.println("2. Intel");
            int choice = scanner.nextInt();
            ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;
            mostrarOpcionesGPU(factory, scanner);
        } else {
            mostrarOpcionesGPU(amdFactory, scanner);
        }
    }

    private void mostrarOpcionesGPU(ComponenteFactory factory, Scanner scanner) {
        List<GPU> gpusDisponibles = factory.getGPUsPorGama(gamaSeleccionada);
        for (int i = 0; i < gpusDisponibles.size(); i++) {
            GPU opcion = gpusDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int gpuIndex = scanner.nextInt() - 1;

        while (gpuIndex < 0 || gpuIndex >= gpusDisponibles.size()) {
            System.out.println("Por favor, selecciona una opción válida.");
            gpuIndex = scanner.nextInt() - 1;
        }

        this.gpu = gpusDisponibles.get(gpuIndex);
    }


    public void elegirRAM(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory, boolean esPersonalizada) {
        if (esPersonalizada) {
            System.out.println("Elige una RAM:");
            System.out.println("1. AMD");
            System.out.println("2. Intel");
            int choice = scanner.nextInt();
            ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;
            mostrarOpcionesRAM(factory, scanner);
        } else {
            mostrarOpcionesRAM(amdFactory, scanner);
        }
    }

    private void mostrarOpcionesRAM(ComponenteFactory factory, Scanner scanner) {
        List<RAM> ramsDisponibles = factory.getRAMsPorGama(gamaSeleccionada);
        for (int i = 0; i < ramsDisponibles.size(); i++) {
            RAM opcion = ramsDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int ramIndex = scanner.nextInt() - 1;
        this.ram = ramsDisponibles.get(ramIndex);
    }

    public void elegirDiscoDuro(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory, boolean esPersonalizada) {
        if (esPersonalizada) {
            System.out.println("Elige un Disco Duro:");
            System.out.println("1. AMD");
            System.out.println("2. Intel");
            int choice = scanner.nextInt();
            ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;
            mostrarOpcionesDiscoDuro(factory, scanner);
        } else {
            mostrarOpcionesDiscoDuro(amdFactory, scanner);
        }
    }

    private void mostrarOpcionesDiscoDuro(ComponenteFactory factory, Scanner scanner) {
        List<DiscoDuro> discosDisponibles = factory.getDiscosDurosPorGama(gamaSeleccionada);
        for (int i = 0; i < discosDisponibles.size(); i++) {
            DiscoDuro opcion = discosDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int ddIndex = scanner.nextInt() - 1;
        this.discoDuro = discosDisponibles.get(ddIndex);
    }

    public void elegirFuenteAlimentacion(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory, boolean esPersonalizada) {
        if (esPersonalizada) {
            System.out.println("Elige una Fuente de Alimentación:");
            System.out.println("1. AMD");
            System.out.println("2. Intel");
            int choice = scanner.nextInt();
            ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;
            mostrarOpcionesFuenteAlimentacion(factory, scanner);
        } else {
            mostrarOpcionesFuenteAlimentacion(amdFactory, scanner);
        }
    }

    private void mostrarOpcionesFuenteAlimentacion(ComponenteFactory factory, Scanner scanner) {
        List<FuenteAlimentacion> fuentesDisponibles = factory.getFuentesPorGama(gamaSeleccionada);
        for (int i = 0; i < fuentesDisponibles.size(); i++) {
            FuenteAlimentacion opcion = fuentesDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int fuenteIndex = scanner.nextInt() - 1;
        this.fuenteAlimentacion = fuentesDisponibles.get(fuenteIndex);
    }

    public void elegirPlacaBase(Scanner scanner, ComponenteFactory amdFactory, ComponenteFactory intelFactory, boolean esPersonalizada) {
        if (esPersonalizada) {
            System.out.println("Elige una Placa Base:");
            System.out.println("1. AMD");
            System.out.println("2. Intel");
            int choice = scanner.nextInt();
            ComponenteFactory factory = (choice == 1) ? amdFactory : intelFactory;
            mostrarOpcionesPlacaBase(factory, scanner);
        } else {
            mostrarOpcionesPlacaBase(amdFactory, scanner);
        }
    }

    private void mostrarOpcionesPlacaBase(ComponenteFactory factory, Scanner scanner) {
        List<PlacaBase> placasDisponibles = factory.getPlacasBasePorGama(gamaSeleccionada);
        for (int i = 0; i < placasDisponibles.size(); i++) {
            PlacaBase opcion = placasDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int placaIndex = scanner.nextInt() - 1;
        this.placaBase = placasDisponibles.get(placaIndex);

        // Verificar compatibilidad y aplicar el Adapter si es necesario
        if (!cpu.getSocketType().equals(placaBase.getCompatibleSocket())) {
            System.out.println("CPU y Placa Base no compatibles, aplicando adaptador...");
            this.cpu = new CPUAdapter(cpu, placaBase.getCompatibleSocket()); // Adaptar la CPU a la Placa Base
        }
    }

    // Método para mostrar la configuración final de la PC
    public void mostrarConfiguracion() {
        System.out.println("Configuracion final de la PC:");
        System.out.println("CPU: " + cpu.getDescription());
        System.out.println("GPU: " + gpu.getDescription());
        System.out.println("RAM: " + ram.getDescription());
        System.out.println("Disco Duro: " + discoDuro.getDescription());
        System.out.println("Fuente de Alimentacion: " + fuenteAlimentacion.getDescription());
        System.out.println("Placa Base: " + placaBase.getDescription());
        double total = cpu.getPrecio() + gpu.getPrecio() + ram.getPrecio() + discoDuro.getPrecio() + fuenteAlimentacion.getPrecio() + placaBase.getPrecio();
        System.out.println("Precio total: $" + total);
    }
}
