/**
 * Interfaz que representa una placa base.
 * Extiende la interfaz Componente y define metodos específicos
 * para obtener informacion sobre la placa base, incluyendo su socket compatible.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface PlacaBase extends Componente {
    /**
     * Obtiene el tipo de socket compatible con la placa base.
     * @return El socket compatible
     */
    String getCompatibleSocket();  // Método para obtener el socket compatible de la placa base

    /**
     * Obtiene el precio de la placa base.
     * @return El precio de la placa base
     */
    double getPrecio();
}
