/**
 * Clase abstracta que define el esquema para construir una PC utilizando el patrón Builder.
 * Esta clase sirve como base para diferentes tipos de constructores de PC (como oficina o gaming),
 * permitiendo la creación de una PC paso a paso mediante la adición de componentes como CPU, GPU,
 * RAM, disco duro, fuente de alimentación y placa base.
 *
 * La clase utiliza una fábrica de componentes (ComponenteFactory) para crear componentes específicos
 * de marcas como AMD o Intel.
 *
 * Las subclases deben implementar los métodos abstractos para definir el comportamiento
 * específico de cómo se construye cada componente de la PC.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public abstract class PCBuilder {
    protected PC pc;
    protected ComponenteFactory factory;

    /**
     * Constructor que inicializa un constructor de PC con una fábrica de componentes específica.
     * También crea una instancia vacía de PC.
     *
     * @param factory La fábrica de componentes que se utilizará para crear los componentes de la PC.
     */
    public PCBuilder(ComponenteFactory factory) {
        this.factory = factory;
        this.pc = new PC();
    }

    /**
     * Retorna la instancia de PC que ha sido construida.
     *
     * @return La PC ensamblada hasta el momento.
     */
    public PC getPC() {
        return pc;
    }

    /**
     * Método abstracto para construir la CPU de la PC.
     * Las subclases deben implementar este método para definir la CPU que se agregará a la PC.
     */
    public abstract void construirCPU();

    /**
     * Método abstracto para construir la GPU de la PC.
     * Las subclases deben implementar este método para definir la GPU que se agregará a la PC.
     */
    public abstract void construirGPU();

    /**
     * Método abstracto para construir la RAM de la PC.
     * Las subclases deben implementar este método para definir la RAM que se agregará a la PC.
     */
    public abstract void construirRAM();

    /**
     * Método abstracto para construir el disco duro de la PC.
     * Las subclases deben implementar este método para definir el disco duro que se agregará a la PC.
     */
    public abstract void construirDiscoDuro();

    /**
     * Método abstracto para construir la fuente de alimentación de la PC.
     * Las subclases deben implementar este método para definir la fuente de alimentación que se agregará a la PC.
     */
    public abstract void construirFuenteAlimentacion();

    /**
     * Método abstracto para construir la placa base de la PC.
     * Las subclases deben implementar este método para definir la placa base que se agregará a la PC.
     */
    public abstract void construirPlacaBase();
}
