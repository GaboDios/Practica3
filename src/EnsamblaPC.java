import java.util.Scanner;
public class EnsamblaPC {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private DiscoDuro discoDuro;
    private FuenteAlimentacion fuenteAlimentacion;
    private PlacaBase placaBase;

    public EnsamblaPC(ComponenteFactory factory) {
        // Inicialmente, ningún componente ha sido seleccionado.
    }

    public void elegirCPU(Scanner scanner, ComponenteFactory factory) {
        System.out.println("Elige una CPU:");
        for (int i = 0; i < 5; i++) {
            CPU opcion = factory.crearCPU(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int cpuIndex = scanner.nextInt() - 1;
        this.cpu = factory.crearCPU(cpuIndex);
    }

    public void elegirGPU(Scanner scanner, ComponenteFactory factory) {
        System.out.println("Elige una GPU:");
        for (int i = 0; i < 5; i++) {
            GPU opcion = factory.crearGPU(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int gpuIndex = scanner.nextInt() - 1;
        this.gpu = factory.crearGPU(gpuIndex);
    }

    public void elegirRAM(Scanner scanner, ComponenteFactory factory) {
        System.out.println("Elige una RAM:");
        for (int i = 0; i < 5; i++) {
            RAM opcion = factory.crearRAM(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int ramIndex = scanner.nextInt() - 1;
        this.ram = factory.crearRAM(ramIndex);
    }

    public void elegirDiscoDuro(Scanner scanner, ComponenteFactory factory) {
        System.out.println("Elige un Disco Duro:");
        for (int i = 0; i < 5; i++) {
            DiscoDuro opcion = factory.crearDiscoDuro(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int ddIndex = scanner.nextInt() - 1;
        this.discoDuro = factory.crearDiscoDuro(ddIndex);
    }

    public void elegirFuenteAlimentacion(Scanner scanner, ComponenteFactory factory) {
        System.out.println("Elige una Fuente de Alimentación:");
        for (int i = 0; i < 5; i++) {
            FuenteAlimentacion opcion = factory.crearFuenteAlimentacion(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int fuenteIndex = scanner.nextInt() - 1;
        this.fuenteAlimentacion = factory.crearFuenteAlimentacion(fuenteIndex);
    }

    public void elegirPlacaBase(Scanner scanner, ComponenteFactory factory) {
        System.out.println("Elige una Placa Base:");
        for (int i = 0; i < 5; i++) {
            PlacaBase opcion = factory.crearPlacaBase(i);
            System.out.println((i + 1) + ". " + opcion.getDescription());
        }
        int placaIndex = scanner.nextInt() - 1;
        this.placaBase = factory.crearPlacaBase(placaIndex);
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