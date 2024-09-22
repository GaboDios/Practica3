/**
 * Clase que representa una fuente de alimentacion AMD.
 * Implementa las interfaces FuenteAlimentacion y Componente.
 * 
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class AMDFuenteAlimentacion implements FuenteAlimentacion, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Fuente de Alimentacion";
    private int potencia;
    private String eficiencia;  // 80 Plus, Gold, etc.

    /**
     * Constructor para crear una fuente de alimentacion AMD.
     *
     * @param nombre El nombre de la fuente de alimentacion.
     * @param precio El precio de la fuente de alimentacion.
     * @param marca La marca de la fuente de alimentacion.
     * @param potencia La potencia de la fuente de alimentacion en vatios.
     * @param eficiencia La clasificacion de eficiencia de la fuente de alimentacion.
     */
    public AMDFuenteAlimentacion(String nombre, double precio, String marca, int potencia, String eficiencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
    }

    /**
     * Obtiene el nombre de la fuente de alimentacion.
     * @return El nombre de la fuente de alimentacion.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio de la fuente de alimentacion.
     * @return El precio de la fuente de alimentacion.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la marca de la fuente de alimentacion.
     * @return La marca de la fuente de alimentacion.
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el tipo de componente.
     *
     * @return El tipo de componente.
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Obtiene una descripcion de la fuente de alimentacion.
     *
     * @return Una cadena con la descripcion de la fuente de alimentacion.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Potencia: " + potencia + "W - Eficiencia: " + eficiencia + " - Precio: $" + precio;
    }
}
