/**
 * Clase que adapta una CPU incompatible a un socket.
 * Implementa la interfaz CPU y permite utilizar CPUs que no son compatibles
 * con un sistema especifico.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class CPUAdapter implements CPU {
    private CPU incompatibleCPU;
    private String targetSocket;  // El socket al que se adapta la CPU

    /**
     * Constructor para crear un adaptador de CPU.
     *
     * @param incompatibleCPU La CPU que se va a adaptar.
     * @param targetSocket El socket al que se adapta la CPU.
     */
    public CPUAdapter(CPU incompatibleCPU, String targetSocket) {
        this.incompatibleCPU = incompatibleCPU;
        this.targetSocket = targetSocket;
    }

    /**
     * Obtiene el tipo de socket de la CPU adaptada.
     * @return El tipo de socket objetivo.
     */
    @Override
    public String getSocketType() {
        return targetSocket;  // Adaptar el socket para que sea compatible
    }

    /**
     * Obtiene una descripcion de la CPU adaptada.
     * @return Una cadena con la descripcion de la CPU, incluyendo el socket adaptado.
     */
    @Override
    public String getDescription() {
        return incompatibleCPU.getDescription() + " (Adaptado a socket: " + targetSocket + ")";
    }

    /**
     * Obtiene el precio de la CPU adaptada.
     * @return El precio de la CPU que se esta adaptando.
     */
    @Override
    public double getPrecio() {
        // Delegar el método getPrecio al objeto CPU que está siendo adaptado
        return incompatibleCPU.getPrecio();
    }

    /**
     * Obtiene la gama de la CPU adaptada.
     * @return la gama de la CPU que se esta adaptando.
     */
    @Override
    public String getGama() {
        // Delegar el método getGama al CPU original
        return incompatibleCPU.getGama();
    }
}
