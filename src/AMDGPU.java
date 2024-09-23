/**
 * Clase que representa una GPU AMD.
 * Implementa las interfaces GPU y Componente.
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class AMDGPU implements GPU, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "GPU";
    private String tipoMemoria;
    private String puertosSalida;
    private String gama;

    /**
     * Constructor para crear una GPU AMD.
     *
     * @param nombre El nombre de la GPU.
     * @param precio El precio de la GPU.
     * @param marca La marca de la GPU.
     * @param tipoMemoria El tipo de memoria de la GPU.
     * @param puertosSalida Los puertos de salida de la GPU.
     * @param gama El tipo de gama de la GPU.
     */
    public AMDGPU(String nombre, double precio, String marca, String tipoMemoria, String puertosSalida, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.tipoMemoria = tipoMemoria;
        this.puertosSalida = puertosSalida;
        this.gama = gama;
    }

    /**
     * Obtiene el nombre de la GPU.
     * @return El nombre de la GPU.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio de la GPU.
     * @return El precio de la GPU.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la marca de la GPU.
     * @return La marca de la GPU.
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el tipo de componente.
     * @return El tipo de componente.
     */
    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Obtiene una descripcion de la GPU.
     * @return Una cadena con la descripcon de la GPU.
     */
    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Tipo Memoria: " + tipoMemoria + " - Puertos: " + puertosSalida + " - Precio: $" + precio;
    }

    /**
     * Obtiene una descripcion de la gama de la GPU.
     * @return Una cadena con la descripcon de la gama.
     */
    @Override
    public  String getGama(){
        return gama;
    }
}
