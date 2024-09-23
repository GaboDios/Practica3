import java.util.Scanner;
import java.util.List;

/**
 * Clase que permite al usuario ensamblar una PC seleccionando componentes de diferentes gamas
 * y fabricantes. Ofrece opciones para CPU, GPU, RAM, disco duro, fuente de alimentación y
 * placa base, verificando compatibilidad entre ellos y permitiendo personalización.
 * También muestra la configuración final de la PC ensamblada.
 *
 * @autor Gabo, Pedro, Yamil, Isaac (Los Hijos de Korhal)
 */
public class EnsamblaPC {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private DiscoDuro discoDuro;
    private FuenteAlimentacion fuenteAlimentacion;
    private PlacaBase placaBase;
    private String gamaSeleccionada;

    /**
     * Constructor de EnsamblaPC.
     * Inicializa la clase sin componentes seleccionados inicialmente.
     */
    public EnsamblaPC() {
        // Inicialmente, no hay componentes seleccionados.
    }

    /**
     * Permite al usuario seleccionar la gama de componentes (alta, media, baja).
     *
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     */
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

    /**
     * Permite al usuario seleccionar una CPU, ya sea de AMD o Intel,
     * dependiendo de si la PC es personalizada o no.
     *
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     * @param amdFactory Fábrica de componentes AMD.
     * @param intelFactory Fábrica de componentes Intel.
     * @param esPersonalizada Indica si la PC es personalizada o predefinida.
     */
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

    /**
     * Muestra al usuario las opciones de CPUs disponibles según la gama seleccionada
     * y permite al usuario seleccionar una.
     *
     * @param factory La fábrica de donde se obtendrán las CPUs.
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     */
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

    /**
     * Permite al usuario seleccionar una GPU, ya sea de AMD o Intel,
     * dependiendo de si la PC es personalizada o no.
     *
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     * @param amdFactory Fábrica de componentes AMD.
     * @param intelFactory Fábrica de componentes Intel.
     * @param esPersonalizada Indica si la PC es personalizada o predefinida.
     */
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

    /**
     * Muestra al usuario las opciones de GPUs disponibles según la gama seleccionada
     * y permite al usuario seleccionar una.
     *
     * @param factory La fábrica de donde se obtendrán las GPUs.
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     */
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

    /**
     * Permite al usuario seleccionar una RAM, ya sea de AMD o Intel,
     * dependiendo de si la PC es personalizada o no.
     *
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     * @param amdFactory Fábrica de componentes AMD.
     * @param intelFactory Fábrica de componentes Intel.
     * @param esPersonalizada Indica si la PC es personalizada o predefinida.
     */
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

    /**
     * Muestra al usuario las opciones de RAMs disponibles según la gama seleccionada
     * y permite al usuario seleccionar una.
     *
     * @param factory La fábrica de donde se obtendrán las RAMs.
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     */
    private void mostrarOpcionesRAM(ComponenteFactory factory, Scanner scanner) {
        List<RAM> ramsDisponibles = factory.getRAMsPorGama(gamaSeleccionada);
        for (int i = 0; i < ramsDisponibles.size(); i++) {
            RAM opcion = ramsDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int ramIndex = scanner.nextInt() - 1;
        this.ram = ramsDisponibles.get(ramIndex);
    }

    /**
     * Permite al usuario seleccionar un disco duro, ya sea de AMD o Intel,
     * dependiendo de si la PC es personalizada o no.
     *
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     * @param amdFactory Fábrica de componentes AMD.
     * @param intelFactory Fábrica de componentes Intel.
     * @param esPersonalizada Indica si la PC es personalizada o predefinida.
     */
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

    /**
     * Muestra al usuario las opciones de discos duros disponibles según la gama seleccionada
     * y permite al usuario seleccionar uno.
     *
     * @param factory La fábrica de donde se obtendrán los discos duros.
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     */
    private void mostrarOpcionesDiscoDuro(ComponenteFactory factory, Scanner scanner) {
        List<DiscoDuro> discosDisponibles = factory.getDiscosDurosPorGama(gamaSeleccionada);
        for (int i = 0; i < discosDisponibles.size(); i++) {
            DiscoDuro opcion = discosDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int ddIndex = scanner.nextInt() - 1;
        this.discoDuro = discosDisponibles.get(ddIndex);
    }

    /**
     * Permite al usuario seleccionar una fuente de alimentación, ya sea de AMD o Intel,
     * dependiendo de si la PC es personalizada o no.
     *
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     * @param amdFactory Fábrica de componentes AMD.
     * @param intelFactory Fábrica de componentes Intel.
     * @param esPersonalizada Indica si la PC es personalizada o predefinida.
     */
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

    /**
     * Muestra al usuario las opciones de fuentes de alimentación disponibles según la gama seleccionada
     * y permite al usuario seleccionar una.
     *
     * @param factory La fábrica de donde se obtendrán las fuentes de alimentación.
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     */
    private void mostrarOpcionesFuenteAlimentacion(ComponenteFactory factory, Scanner scanner) {
        List<FuenteAlimentacion> fuentesDisponibles = factory.getFuentesPorGama(gamaSeleccionada);
        for (int i = 0; i < fuentesDisponibles.size(); i++) {
            FuenteAlimentacion opcion = fuentesDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int fuenteIndex = scanner.nextInt() - 1;
        this.fuenteAlimentacion = fuentesDisponibles.get(fuenteIndex);
    }

    /**
     * Permite al usuario seleccionar una placa base, ya sea de AMD o Intel,
     * dependiendo de si la PC es personalizada o no.
     *
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     * @param amdFactory Fábrica de componentes AMD.
     * @param intelFactory Fábrica de componentes Intel.
     * @param esPersonalizada Indica si la PC es personalizada o predefinida.
     */
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

    /**
     * Muestra al usuario las opciones de placas base disponibles según la gama seleccionada
     * y permite al usuario seleccionar una.
     * También verifica la compatibilidad entre la CPU y la placa base,
     * aplicando el patrón Adapter si es necesario.
     *
     * @param factory La fábrica de donde se obtendrán las placas base.
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     */
    private void mostrarOpcionesPlacaBase(ComponenteFactory factory, Scanner scanner) {
        List<PlacaBase> placasDisponibles = factory.getPlacasBasePorGama(gamaSeleccionada);
        for (int i = 0; i < placasDisponibles.size(); i++) {
            PlacaBase opcion = placasDisponibles.get(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int placaIndex = scanner.nextInt() - 1;
        this.placaBase = placasDisponibles.get(placaIndex);

        if (!cpu.getSocketType().equals(placaBase.getCompatibleSocket())) {
            System.out.println("CPU y Placa Base no compatibles, aplicando adaptador...");
            this.cpu = new CPUAdapter(cpu, placaBase.getCompatibleSocket());
        }
    }

    /**
     * Muestra la configuración final de la PC ensamblada, incluyendo
     * los componentes seleccionados y el precio total.
     */
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
